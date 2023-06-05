#include "regex.h"
#include "regex-compile-listener.h"

/**
 * 注：如果你愿意，你可以自由的using namespace。
 */

/**
 * 编译给定的正则表达式，构造出Regex对象。
 * 具体包括两个过程：解析正则表达式得到语法分析树（这步已经为你写好，即parse方法），
 * 和在语法分析树上进行分析（遍历），构造出NFA（需要你完成的部分）。
 * 在语法分析树上进行分析的方法，可以是直接自行访问该树，也可以是使用antlr的Visitor机制，详见作业文档。
 * @param pattern 正则表达式的字符串
 * @param flags 正则表达式的修饰符（第二次实验不要求支持，保证传入的永远是空串）
 * @return Regex类的对象
 */
Regex Regex::compile(const std::string &pattern, const std::string &flags) {
    auto parser = std::make_unique<ParseUtil>(pattern);
    regexParser::RegexContext *tree = parser->parse();

    Flag mask = 0;
    for (char flag : flags) {
        switch (flag) {
            case 'm': mask |= kMultiline; break;
            case 's': mask |= kDotAll; break;
        }
    }

    Regex regex;
    RegexCompileListener listener(regex, mask);
    // 使用 listener 遍历语法树，对每棵子树编译得到 NFA 片段
    listener.buildFrom(tree);

    return regex;
}

/**
 * 在给定的输入文本上，进行正则表达式匹配，返回匹配到的第一个结果。
 * 匹配不成功时，返回空vector( return std::vector<std::string>(); ，或使用返回初始化列表的语法 return {}; )；
 * 匹配成功时，返回一个std::vector<std::string>，其中下标为0的元素是匹配到的字符串，
 * 下标为i(i>=1)的元素是匹配结果中的第i个分组。
 * （第二次实验中不要求支持分组功能，返回的vector中只含一个元素即可）
 * @param text 输入的文本
 * @return 如上所述
 */
std::vector<std::string> Regex::match(const std::string &text) {
    Path path = nfa.exec(text, true);
    if (path.states.size() == 0) return {};

    // 捕获组匹配子串的起始位置
    std::vector<std::pair<int, int>> group_pos(group_count + 1);
    // 当前是否处在捕获组中
    std::vector<bool> in_group(group_count + 1);

    // 计算匹配开始的位置
    int step = 0;
    while (path.states[step + 1] == 0) step++;

    int pos = step;
    group_pos[0].first = pos;
    in_group[0] = true;

    // 计算捕获组的匹配位置
    for (; step < (int)path.consumes.size(); step++) {
        int state = path.states[step + 1]; // 当前状态
        pos += path.consumes[step].length();

        if (int index = group_map[state]) { // 找到对应的捕获组
            if (!in_group[index]) { // 捕获组开始
                group_pos[index].first = pos;
                in_group[index] = true;
            } else { // 捕获组结束
                group_pos[index].second = pos;
                in_group[index] = false;
            }
        }
    }

    // 计算匹配结束的位置
    group_pos[0].second = pos;
    in_group[0] = false;

    // 生成匹配结果
    std::vector<std::string> results;
    results.reserve(group_count + 1);
    for (auto [begin, end] : group_pos) {
        // TODO: 处理捕获组未匹配的情况
        results.push_back(text.substr(begin, end - begin));
    }
    return results;
}

Regex::ParseUtil::ParseUtil(const std::string &pattern)
    : antlrInputStream(pattern),
      antlrLexer(&antlrInputStream),
      antlrTokenStream(&antlrLexer),
      antlrParser(&antlrTokenStream) {}

regexParser::RegexContext *Regex::ParseUtil::parse() {
    regexParser::RegexContext *tree = antlrParser.regex();
    if (!tree)
        throw std::runtime_error("parser解析失败(函数返回了nullptr)");

    if (antlrTokenStream.LA(1) != antlr4::Token::EOF) {
        auto start = antlrTokenStream.get(0);
        auto stop = antlrTokenStream.get(antlrTokenStream.index() - 1);
        auto parsedText = antlrTokenStream.getText(start, stop);
        throw std::runtime_error("parser解析失败，解析过程未能到达字符串结尾，可能是由于表达式中间有无法解析的内容！已解析的部分：" + parsedText);
    }

    auto errCount = antlrParser.getNumberOfSyntaxErrors();
    if (errCount > 0)
        throw std::runtime_error("parser解析失败，表达式中有" + std::to_string(errCount) + "个语法错误！");

    return tree;
}

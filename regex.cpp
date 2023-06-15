#include "regex.h"
#include "regex-compile-listener.h"
#include "regex-matcher.h"
#include <cctype>

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

std::vector<std::string> Regex::match(const std::string &text) {
    RegexMatcher matcher(*this, text);
    if (matcher.match()) return matcher.groups();
    return {};
}

std::vector<std::vector<std::string>> Regex::matchAll(const std::string &text) {
    RegexMatcher matcher(*this, text);
    std::vector<std::vector<std::string>> results;
    int pos = 0;
    while (pos <= (int)text.length() && matcher.match(pos)) {
        results.push_back(matcher.groups());
        // 从上一个匹配的末尾继续匹配，需要特判匹配空串的情况
        pos = std::max(pos + 1, matcher.groupPos(0).second);
    }
    return results;
}

std::string Regex::replaceAll(const std::string &text, const std::string &replacement) {
    RegexMatcher matcher(*this, text);
    std::string result;
    int pos = 0;
    while (matcher.match(pos)) {
        auto [begin, end] = matcher.groupPos(0);
        result.append(text, pos, begin - pos);
        matcher.appendReplacement(result, replacement);
        if (begin == end) { // 匹配空串
            if (end == (int)text.length()) break;
            result.push_back(text[end]);
            pos = end + 1;
        } else {
            pos = end;
        }
    }
    result.append(text, pos);
    return result;
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

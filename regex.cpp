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
Regex Regex::compile(const std::string &pattern, const std::string & /*flags*/) {
    Regex regex;
    regexParser::RegexContext *tree = regex.parse(pattern);

    // 使用 listener 遍历语法树，对每棵子树编译得到 NFA 片段
    RegexCompileListener listener(regex);
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

    // 计算匹配开始的位置
    int offset = 0;
    while (path.states[offset + 1] == 0) offset++;

    // 计算匹配的长度
    int length = 0;
    for (int i = offset; i < (int)path.consumes.size(); i++) {
        length += path.consumes[i].length();
    }

    return { text.substr(offset, length) };
}

/**
 * 解析正则表达式的字符串，生成语法分析树。
 * 你应该在compile函数中调用一次本函数，以得到语法分析树。
 * 通常，你不需要改动此函数，也不需要理解此函数实现每一行的具体含义。
 * 但是，你应当对语法分析树的数据结构(RegexContext)有一定的理解，作业文档中有相关的教程可供参考。
 * @param pattern 要解析的正则表达式的字符串
 * @return RegexContext类的对象的指针。保证不为空指针。
 */
regexParser::RegexContext *Regex::parse(const std::string &pattern) {
    if (antlrInputStream)
        throw std::runtime_error("此Regex对象已被调用过一次parse函数，不可以再次调用！");

    antlrInputStream = std::make_unique<antlr4::ANTLRInputStream>(pattern);
    antlrLexer = std::make_unique<regexLexer>(antlrInputStream.get());

    antlrTokenStream = std::make_unique<antlr4::CommonTokenStream>(antlrLexer.get());
    antlrParser = std::make_unique<regexParser>(antlrTokenStream.get());

    regexParser::RegexContext *tree = antlrParser->regex();
    if (!tree)
        throw std::runtime_error("parser解析失败(函数返回了nullptr)");

    if (antlrTokenStream->LA(1) != antlr4::Token::EOF)
        throw std::runtime_error("parser未到达EOF");

    auto errCount = antlrParser->getNumberOfSyntaxErrors();
    if (errCount > 0)
        throw std::runtime_error("parser解析失败，表达式中有" + std::to_string(errCount) + "个语法错误！");

    return tree;
}

// 此析构函数是为了管理ANTLR语法分析树所使用的内存的。你不需要阅读和理解它。
Regex::~Regex() {}

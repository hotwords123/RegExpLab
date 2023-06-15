#ifndef CPP_REGEX_H
#define CPP_REGEX_H

#include "nfa.h"
#include "parser/regexLexer.h"
#include "parser/regexParser.h"
#include <memory>

/**
 * 本文件（包括对应的cpp文件）中已经定义好了一些类和函数，类内也已经定义好了一些成员变量和方法。不建议大家修改这些已经定义好的东西。
 * 但是，为了实现功能，你可以自由地增加新的函数、类等，包括可以在已经定义好的类自由地添加新的成员变量和方法。
 */
/**
 * 在第二次实验中：
 *   - 保证正则表达式字符串和待操作的文本内容都仅包含ASCII字符，且不包含'\0'和换行符'\r' '\n'。
 *   - 要求支持的正则表达式文法为，随第二次实验下发的`regex.g4`中，所有未被注释的部分。
 *     - 即，本次不需要实现除了anchor、backreference、非捕获分组、区间次数限定符(rangeQualifier)
 *   - 只需要实现compile函数（将正则表达式编译为NFA），和match函数（返回串中第一个匹配结果）。
 *   - 不要求支持返回捕获分组（即你实现的match函数，返回只含一个元素的数组即可）。
 *   - 要求支持的特殊字符在`regex.g4`中均有列出。具体包括（如下一行列举的内容与`regex.g4`中的声明有冲突，请以`regex.g4`为准）：
 *     - \d \w \s \D \W \S .
 *   - 不需要支持任何正则表达式的修饰符。保证传给compile函数的flags参数永远为空串。
 * 正则表达式中各种字符的具体定义可查看 https://www.runoob.com/regexp/regexp-metachar.html
 */

/**
 * 表示一个正则表达式的类。
 */
class Regex {
    NFA nfa; // 正则表达式所使用的NFA

    int group_count = 0; // 捕获组数量
    std::vector<int> group_map; // 每个状态对应的捕获组编号，0 表示没有对应的捕获组

    struct ParseUtil { // 用于解析正则表达式的辅助类
        antlr4::ANTLRInputStream antlrInputStream;
        regexLexer antlrLexer;
        antlr4::CommonTokenStream antlrTokenStream;
        regexParser antlrParser;

        ParseUtil(const std::string &pattern);

        // 解析正则表达式的字符串，生成语法分析树。
        regexParser::RegexContext *parse();
    };

    friend class RegexCompileListener;
    friend class RegexMatcher;

public:
    using Flag = unsigned int;

    static constexpr Flag kMultiline = 1u << 0;
    static constexpr Flag kDotAll = 1u << 1;

    Regex() = default;
    Regex(Regex &&) = default;

    /**
     * 编译给定的正则表达式，构造出Regex对象。
     * 具体包括两个过程：解析正则表达式得到语法分析树（这步已经为你写好，即parse方法），
     * 和在语法分析树上进行分析（遍历），构造出NFA（需要你完成的部分）。
     * 在语法分析树上进行分析的方法，可以是直接自行访问该树，也可以是使用antlr的Visitor机制，详见作业文档。
     * @param pattern 正则表达式的字符串
     * @param flags 正则表达式的修饰符（第二次实验不要求支持，保证传入的永远是空串）
     * @return Regex类的对象
     */
    static Regex compile(const std::string &pattern, const std::string &flags = "");

    /**
     * 在给定的输入文本上，进行正则表达式匹配，返回匹配到的第一个结果。
     * 匹配不成功时，返回空vector( return std::vector<std::string>(); ，或使用返回初始化列表的语法 return {}; )；
     * 匹配成功时，返回一个std::vector<std::string>，其中下标为0的元素是匹配到的字符串，
     * 下标为i(i>=1)的元素是匹配结果中的第i个分组。
     * （第二次实验中不要求支持分组功能，返回的vector中只含一个元素即可）
     * @param text 输入的文本
     * @return 如上所述
     */
    std::vector<std::string> match(const std::string &text);

    std::vector<std::vector<std::string>> matchAll(const std::string &text);

    std::string replace(const std::string &text, const std::string &replacement);

    std::string replaceAll(const std::string &text, const std::string &replacement);
};

#endif // CPP_REGEX_H

#ifndef CPP_RULE_H
#define CPP_RULE_H

#include <string>

/**
 * 用于表示状态转移的类型，和所有可能值的枚举
 */
enum RuleType : int {
    NORMAL,  // 一般转移。如 a
    RANGE,   // 字符区间转移。如 a-z
    SPECIAL, // 特殊转移。如 \d （注意Rule的by属性里面是没有斜杠的，只有一个字母如d）
    EPSILON, // epsilon-转移。
    ANCHOR,  // 锚点转移。如 ^ $ \b \B。特别地，A,Z 分别表示多行模式下的 ^,$
};

/**
 * 表示一条状态转移规则。
 */
struct Rule {
    int dst; // 目的状态
    RuleType type; // 状态转移的类型，取值见上方的宏定义
    std::string by; // 对特殊字符转移，这里只有一个字母，如d；对字符区间转移，这里是区间的开头，如a；对一般转移，这里就是转移所需的字母；对epsilon-转移，这里固定为空串；对锚点转移，这里对应锚点类型。
    std::string to; // 对字符区间转移，这里是区间的结尾，如z；对任何其他类型的转移，这里固定为空串。

    /**
     * 判断当前规则能否匹配输入串的某个位置。
     * @param text 输入串
     * @param pos 匹配位置
     * @returns 若能匹配，返回消耗的字符数；若不能匹配，返回 -1
     */
    int match(const std::string &text, int pos) const;

    // 判断当前规则能否匹配某个字符。
    bool matches(unsigned char ch) const;

    // 对于锚点规则，判断能否匹配某个位置。
    bool anchorMatches(const std::string &text, int pos) const;
};

#endif // CPP_RULE_H

#ifndef CPP_REGEX_MATCHER_H
#define CPP_REGEX_MATCHER_H

#include "regex.h"
#include "nfa-executor.h"
#include <vector>

/**
 * 正则表达式匹配类，用于在给定文本上进行正则表达式匹配。
 */
class RegexMatcher {
    const Regex &regex;
    const std::string &text;

    NFAExecutor executor;

    // 捕获组匹配子串的位置
    std::vector<std::pair<int, int>> group_pos;
    // 当前是否处在捕获组中
    std::vector<bool> in_group;

public:
    static constexpr char kGroupMarker = '$';

    RegexMatcher(const Regex &regex, const std::string &text)
        : regex(regex), text(text), executor(regex.nfa, text, true) {}

    /**
     * 从指定位置开始尝试匹配文本。
     * @param start_pos 匹配的起始位置
     * @return 是否匹配成功
     */
    bool match(int start_pos = 0);

    /**
     * 返回所有的捕获组。
     */
    std::vector<std::string> groups() const;

    /**
     * 返回指定的捕获组在文本中开始和结束的位置。
     * @param index 捕获组的编号
     */
    std::pair<int, int> groupPos(int index) const {
        return group_pos[index];
    }

    /**
     * 计算当前匹配被替换后的子串，并添加到目标字符串末尾。
     * @param target 目标字符串
     * @param replacement 替换格式，$n 表示第 n 个捕获组
     */
    void appendReplacement(std::string &target, const std::string &replacement) const;
};

#endif // CPP_REGEX_MATCHER_H

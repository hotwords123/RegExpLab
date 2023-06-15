#ifndef CPP_NFA_EXECUTOR_H
#define CPP_NFA_EXECUTOR_H

#include "nfa.h"
#include <unordered_set>

/**
 * 提供 std::pair<T1, T2> 的 std::hash 特化。
 */
template <typename T1, typename T2>
struct std::hash<std::pair<T1, T2>> {
    using argument_type = std::pair<T1, T2>;
    using result_type = size_t;

    result_type operator()(const argument_type &value) const {
        size_t h1 = std::hash<T1>{}(value.first);
        size_t h2 = std::hash<T2>{}(value.second);
        h2 ^= h2 << 2;
        h2 ^= h2 << 7;
        h2 ^= h2 >> 7;
        return h1 ^ h2;
    }
};

/**
 * NFA 的带路径执行器类。
 */
class NFAExecutor {
    const NFA &nfa;
    const std::string text;
    bool accept_prefix; // 是否允许只接受输入串的一个前缀
    Path path;
    std::unordered_set<std::pair<int, int>> visited; // 缓存访问过的状态

public:
    NFAExecutor(const NFA &nfa, const std::string &text, bool accept_prefix = false)
        : nfa(nfa), text(text), accept_prefix(accept_prefix) {}

    // 在自动机上执行字符串。
    Path exec(int start_pos = 0);

private:
    bool dfs(int state, int pos, int step);
};

#endif // CPP_NFA_EXECUTOR_H
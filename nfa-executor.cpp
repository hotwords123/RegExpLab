#include "nfa-executor.h"

Path NFAExecutor::exec() {
    if (dfs(0, 0))
        return path;
    else
        return Path::reject();
}

bool NFAExecutor::dfs(int state, int pos) {
    // 判断当前状态是否已被访问过，若访问过则剪枝
    if (!visited.insert(std::make_pair(state, pos)).second)
        return false;

    // 记录途径的状态，进栈
    path.states.push_back(state);

    // 判断终态
    if (pos == text.size() && nfa.is_final[state])
        return true;

    // 枚举 state 的所有转移规则
    for (auto &rule : nfa.rules[state]) {
        if (rule.type == EPSILON) { // epsilon-转移
            path.consumes.push_back({});
            if (dfs(rule.dst, pos))
                return true;
            path.consumes.pop_back();
        } else if (pos != text.size() && rule.matches(text[pos])) { // 字符转移
            path.consumes.push_back(std::string(1, text[pos]));
            if (dfs(rule.dst, pos + 1))
                return true;
            path.consumes.pop_back();
        }
    }

    // 当前状态出栈
    path.states.pop_back();
    return false;
}
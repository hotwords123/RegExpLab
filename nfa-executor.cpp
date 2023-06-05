#include "nfa-executor.h"

Path NFAExecutor::exec() {
    if (nfa.num_states > 0 && dfs(0, 0, 0))
        return path;
    else
        return Path::reject();
}

bool NFAExecutor::dfs(int state, int pos, int step) {
    // 判断当前状态是否已被访问过，若访问过则剪枝
    if (!visited.insert(std::make_pair(state, pos)).second)
        return false;

    // 判断终态
    if ((accept_prefix || pos == (int)text.size()) && nfa.is_final[state]) {
        path.states.resize(step + 1);
        path.consumes.resize(step);
        path.states[step] = state;
        return true;
    }

    // 枚举 state 的所有转移规则
    for (auto &rule : nfa.rules[state]) {
        int count = rule.match(text, pos);
        if (count >= 0 && dfs(rule.dst, pos + count, step + 1)) { // 匹配成功
            path.states[step] = state;
            path.consumes[step] = text.substr(pos, count);
            return true;
        }
    }

    return false;
}
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
    if ((accept_prefix || pos == (int)text.size()) && nfa.is_final[state])
        return true;

    // 枚举 state 的所有转移规则
    for (auto &rule : nfa.rules[state]) {
        int count = rule.match(text, pos);
        if (count >= 0) { // 匹配成功
            path.consumes.push_back(text.substr(pos, count));
            if (dfs(rule.dst, pos + count))
                return true;
            path.consumes.pop_back();
        }
    }

    // 当前状态出栈
    path.states.pop_back();
    return false;
}
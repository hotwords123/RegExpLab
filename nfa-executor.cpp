#include "nfa-executor.h"

Path NFAExecutor::exec(int start_pos) {
    if (nfa.num_states > 0) {
        path.states.clear();
        path.consumes.clear();
        // 之前搜索过的状态已经无法到达终态，故无需重置
        // visited.clear();
        if (dfs(0, start_pos, 0)) return std::move(path);
    }
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
        // 下次搜索可能匹配空串到达终态，需要还原为未访问状态
        visited.erase(std::make_pair(state, pos));
        return true;
    }

    // 枚举 state 的所有转移规则
    for (auto &rule : nfa.rules[state]) {
        int count = rule.match(text, pos);
        if (count >= 0 && dfs(rule.dst, pos + count, step + 1)) { // 匹配成功
            path.states[step] = state;
            path.consumes[step] = text.substr(pos, count);
            // 下次搜索可能到达这一状态，同样需要还原
            visited.erase(std::make_pair(state, pos));
            return true;
        }
    }

    return false;
}

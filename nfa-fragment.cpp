#include "nfa-fragment.h"
#include "nfa.h"

void NFAFragment::assemble(NFA &nfa, int initial, int final) const {
    // 在 NFA 中添加所需的额外状态
    int state_offset = nfa.append_states(num_nodes);

    // 计算 NFA 中状态的下标
    auto stateIndex = [&](NodeId id) {
        if (id <= 0) return initial;
        if (id > num_nodes) return final;
        return state_offset + (id - 1);
    };

    // 将迁移边从片段复制到 NFA 中
    auto addRule = [&](const RuleEdge &edge) {
        int from = stateIndex(edge.from);
        int to = stateIndex(edge.to);
        Rule &rule = nfa.rules[from].emplace_back(edge.rule);
        rule.dst = to;
    };

    // 处理不需要最后添加的迁移边
    for (auto &edge : rule_edges) {
        if (edge.rule.dst != 1) addRule(edge);
    }

    // 在 NFA 中递归组装子片段
    for (auto &edge : fragment_edges) {
        int from = stateIndex(edge.from);
        int to = stateIndex(edge.to);
        edge.fragment->assemble(nfa, from, to);
    }

    // 处理需要最后添加的迁移边
    for (auto &edge : rule_edges) {
        if (edge.rule.dst == 1) addRule(edge);
    }
}
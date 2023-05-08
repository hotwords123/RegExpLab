#ifndef CPP_NFA_FRAGMENT_H
#define CPP_NFA_FRAGMENT_H

#include "rule.h"
#include <vector>

class NFA;

/**
 * NFA 片段类，其中包含迁移边和类似迁移边的子片段。
 */
struct NFAFragment {
    // 片段中的顶点编号，0 表示起点，num_nodes + 1 表示终点
    using NodeId = int;

    struct Edge {
        NodeId from;
        NodeId to;
    };

    // 片段中的迁移边
    struct RuleEdge : Edge {
        Rule rule;
    };

    // 片段中的子片段
    struct FragmentEdge : Edge {
        const NFAFragment *fragment;
    };

    int num_nodes;
    std::vector<RuleEdge> rule_edges;
    std::vector<FragmentEdge> fragment_edges;

    /**
     * 构造 NFA 片段。
     * @param num_nodes 片段中额外状态的个数，不包含初态和终态
     */
    NFAFragment(int num_nodes = 0) : num_nodes(num_nodes) {}

    void addNormalRule(NodeId from, NodeId to, char ch) {
        rule_edges.push_back({ from, to, { 0, NORMAL, std::string(1, ch) } });
    }

    void addRangeRule(NodeId from, NodeId to, char lbound, char ubound) {
        rule_edges.push_back({ from, to, { 0, RANGE, std::string(1, lbound), std::string(1, ubound) } });
    }

    void addSpecialRule(NodeId from, NodeId to, char type) {
        rule_edges.push_back({ from, to, { 0, SPECIAL, std::string(1, type) } });
    }

    /**
     * @param last 组装时是否最后添加这条边，用于切换贪婪匹配
     */
    void addEpsilonRule(NodeId from, NodeId to, bool add_last = false) {
        rule_edges.push_back({ from, to, { add_last ? 1 : 0, EPSILON } });
    }

    void addFragment(NodeId from, NodeId to, const NFAFragment *fragment) {
        fragment_edges.push_back({ from, to, fragment });
    }

    /**
     * 将当前片段组装到 NFA 中。
     * @param nfa 目标 NFA
     * @param initial 初态对应的下标
     * @param final 终态对应的下标
     */
    void assemble(NFA &nfa, int initial, int final) const;
};

#endif // CPP_NFA_FRAGMENT_H
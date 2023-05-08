#ifndef CPP_NFA_FRAGMENT_H
#define CPP_NFA_FRAGMENT_H

#include "rule.h"
#include <vector>

class NFA;

struct NFAFragment {
    // 片段中的顶点编号，-1 表示起点，num_nodes 表示终点
    using NodeId = int;

    struct Edge {
        NodeId from;
        NodeId to;
    };

    struct RuleEdge : Edge {
        Rule rule;
    };

    struct FragmentEdge : Edge {
        const NFAFragment *fragment;
    };

    int num_nodes;
    std::vector<RuleEdge> rule_edges;
    std::vector<FragmentEdge> fragment_edges;

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

    void addEpsilonRule(NodeId from, NodeId to) {
        rule_edges.push_back({ from, to, { 0, EPSILON } });
    }

    void addFragment(NodeId from, NodeId to, const NFAFragment *fragment) {
        fragment_edges.push_back({ from, to, fragment });
    }

    void assemble(NFA &nfa, int initial, int final) const;
};

#endif // CPP_NFA_FRAGMENT_H
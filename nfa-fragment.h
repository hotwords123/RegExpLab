#ifndef CPP_NFA_FRAGMENT_H
#define CPP_NFA_FRAGMENT_H

#include "rule.h"
#include <vector>

class NFA;

struct NFAFragment {
    enum NodeId : int {
        kInitial = -1,
        kFinal = -2
    };

    struct Edge {
        NodeId from;
        NodeId to;
    };

    struct SimpleEdge : Edge {
        Rule rule;
    };

    struct FragmentEdge : Edge {
        NFAFragment *fragment;
    };

    int num_nodes;
    std::vector<SimpleEdge> simple_edges;
    std::vector<FragmentEdge> fragment_edges;

    void assemble(NFA &nfa, int initial, int final) const;
};

#endif // CPP_NFA_FRAGMENT_H
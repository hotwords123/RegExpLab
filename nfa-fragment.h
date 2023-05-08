#ifndef CPP_NFA_FRAGMENT_H
#define CPP_NFA_FRAGMENT_H

#include "rule.h"
#include <vector>

class NFA;

struct NFAFragment {
    enum StateId : int {
        kInitial = -1,
        kFinal = -2
    };

    struct Transition {
        StateId from;
        StateId to;
    };

    struct SimpleTransition : Transition {
        Rule rule;
    };

    struct FragmentTransition : Transition {
        NFAFragment *fragment;
    };

    int num_states;
    std::vector<SimpleTransition> simple_trans;
    std::vector<SimpleTransition> fragment_trans;

    void assemble(NFA &nfa, int initial, int final) const;
};

#endif // CPP_NFA_FRAGMENT_H
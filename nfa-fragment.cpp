#include "nfa-fragment.h"
#include "nfa.h"

void NFAFragment::assemble(NFA &nfa, int initial, int final) const {
    // append new states to nfa
    int state_offset = nfa.append_states(num_nodes);

    // get the state index in nfa
    auto state_index = [&](NodeId id) {
        if (id == kInitial) return initial;
        if (id == kFinal) return final;
        return state_offset + id;
    };

    // add transition rules to nfa
    for (auto &edge : simple_edges) {
        int from = state_index(edge.from);
        int to = state_index(edge.to);
        Rule &rule = nfa.rules[from].emplace_back(edge.rule);
        rule.dst = to;
    }

    // assemble sub-fragments to nfa
    for (auto &edge : fragment_edges) {
        int from = state_index(edge.from);
        int to = state_index(edge.to);
        edge.fragment->assemble(nfa, from, to);
    }
}
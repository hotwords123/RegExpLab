#ifndef CPP_REGEX_COMPILE_LISTENER_H
#define CPP_REGEX_COMPILE_LISTENER_H

#include "parser/regexBaseListener.h"
#include "regex.h"
#include "nfa-fragment.h"
#include <vector>
#include <unordered_map>

class RegexCompileListener : public regexBaseListener {
    Regex &regex;

    std::unordered_map<antlr4::RuleContext *, std::unique_ptr<NFAFragment>> fragments;

public:
    RegexCompileListener(Regex &regex);

    void enterRegex(regexParser::RegexContext *) override;
};

#endif // CPP_REGEX_COMPILE_LISTENER_H
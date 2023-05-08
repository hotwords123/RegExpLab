#ifndef CPP_REGEX_COMPILE_LISTENER_H
#define CPP_REGEX_COMPILE_LISTENER_H

#include "parser/regexBaseListener.h"
#include "regex.h"
#include "nfa-fragment.h"
#include <vector>
#include <unordered_map>

class RegexCompileListener : public regexBaseListener {
    Regex &regex;

    // 存储每棵子树编译得到的 NFA 片段
    std::unordered_map<antlr4::RuleContext *, std::unique_ptr<NFAFragment>> fragments;

public:
    RegexCompileListener(Regex &regex);

    // 在 fragments 中为子树创建 NFA 片段
    NFAFragment *createFragment(antlr4::RuleContext *ctx, int num_nodes);

    // 返回子树的 NFA 片段
    NFAFragment *getFragment(antlr4::RuleContext *ctx) const;

    void exitRegex(regexParser::RegexContext *) override;
    void exitExpression(regexParser::ExpressionContext *) override;
    void exitExpressionItem(regexParser::ExpressionItemContext *) override;
    void exitNormalItem(regexParser::NormalItemContext *) override;
    void exitGroup(regexParser::GroupContext *) override;
    void exitSingle(regexParser::SingleContext *) override;
    void exitCharacterGroup(regexParser::CharacterGroupContext *) override;
};

#endif // CPP_REGEX_COMPILE_LISTENER_H
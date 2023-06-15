#ifndef CPP_REGEX_COMPILE_LISTENER_H
#define CPP_REGEX_COMPILE_LISTENER_H

#include "parser/regexBaseListener.h"
#include "regex.h"
#include "nfa-fragment.h"
#include <vector>
#include <unordered_map>

class RegexCompileListener : public regexBaseListener {
    Regex &regex;
    Regex::Flag flags;

    // 存储每棵子树编译得到的 NFA 片段
    std::unordered_map<antlr4::RuleContext *, std::unique_ptr<NFAFragment>> fragments;

public:
    RegexCompileListener(Regex &regex, Regex::Flag flags);

    void exitRegex(regexParser::RegexContext *) override;
    void exitExpression(regexParser::ExpressionContext *) override;
    void exitExpressionItem(regexParser::ExpressionItemContext *) override;
    void enterNormalItem(regexParser::NormalItemContext *) override;
    void exitNormalItem(regexParser::NormalItemContext *) override;
    void exitCharacterGroup(regexParser::CharacterGroupContext *) override;

    // 遍历语法树，构建正则表达式对应的 NFA
    void buildFrom(regexParser::RegexContext *tree);

private:
    // 在 fragments 中为子树创建 NFA 片段
    NFAFragment *createFragment(antlr4::RuleContext *ctx, int num_nodes = 0);

    // 返回子树的 NFA 片段
    NFAFragment *getFragment(antlr4::RuleContext *ctx) const;

    /**
     * 将片段组装到正则表达式的 NFA 中。
     * @param fragment 要组装的 NFA 片段
     * @param initial 初态对应的下标
     * @param final 终态对应的下标
     */
    void assemble(const NFAFragment *fragment, int initial, int final) const;
};

#endif // CPP_REGEX_COMPILE_LISTENER_H

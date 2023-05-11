#include "regex-compile-listener.h"
#include <iostream>

RegexCompileListener::RegexCompileListener(Regex &regex)
    : regex(regex) {}

NFAFragment *RegexCompileListener::createFragment(antlr4::RuleContext *ctx, int num_nodes) {
    auto [it, flag] = fragments.emplace(ctx, std::make_unique<NFAFragment>(num_nodes));
    return it->second.get();
}

NFAFragment *RegexCompileListener::getFragment(antlr4::RuleContext *ctx) const {
    auto it = fragments.find(ctx);
    if (it == fragments.end()) return nullptr;
    return it->second.get();
}

// regex : expression ('|' expression)* ;
void RegexCompileListener::exitRegex(regexParser::RegexContext *ctx) {
    auto expressions = ctx->expression();

    auto fragment = createFragment(ctx);
    for (auto expression : expressions) {
        fragment->addFragment(0, 1, getFragment(expression));
    }
}

// expression : expressionItem+ ;
void RegexCompileListener::exitExpression(regexParser::ExpressionContext *ctx) {
    auto expressionItems = ctx->expressionItem();
    int count = expressionItems.size();

    auto fragment = createFragment(ctx, count - 1);
    for (int i = 0; i < count; i++) {
        fragment->addFragment(i, i + 1, getFragment(expressionItems[i]));
    }
}

// expressionItem : normalItem quantifier? ;
void RegexCompileListener::exitExpressionItem(regexParser::ExpressionItemContext *ctx) {
    auto normalItem = ctx->normalItem();
    auto itemFragment = getFragment(normalItem);

    int min_count = 1, max_count = 1;
    bool greedy = true;

    if (auto quantifier = ctx->quantifier()) {
        auto quantifierType = quantifier->quantifierType();
        if (quantifierType->ZeroOrMoreQuantifier()) {
            min_count = 0;
            max_count = -1;
        } else if (quantifierType->OneOrMoreQuantifier()) {
            min_count = 1;
            max_count = -1;
        } else if (quantifierType->ZeroOrOneQuantifier()) {
            min_count = 0;
            max_count = 1;
        }

        if (quantifier->lazyModifier()) greedy = false;
    }

    auto fragment = createFragment(ctx);
    if (max_count == -1) {
        if (min_count == 0) { // E*
            fragment->num_nodes = 1;
            fragment->addEpsilonRule(0, 1);
            fragment->addFragment(1, 1, itemFragment);
            fragment->addEpsilonRule(1, 2, greedy);
        } else if (min_count == 1) { // E+
            fragment->num_nodes = 2;
            fragment->addEpsilonRule(0, 1);
            fragment->addFragment(1, 2, itemFragment);
            fragment->addEpsilonRule(2, 3, greedy);
            fragment->addEpsilonRule(2, 1);
        } else { // E{>=2,}
            fragment->num_nodes = min_count;
            for (int i = 0; i < min_count; i++) {
                fragment->addFragment(i, i + 1, itemFragment);
            }
            fragment->addEpsilonRule(min_count, min_count + 1, greedy);
            fragment->addEpsilonRule(min_count, min_count - 1);
        }
    } else if (max_count > 0) { // E{a,b}
        fragment->num_nodes = max_count - 1;
        for (int i = 0; i < max_count; i++) {
            fragment->addFragment(i, i + 1, itemFragment);
            if (i >= min_count) {
                fragment->addEpsilonRule(i, max_count, greedy);
            }
        }
    } else { // E{0}
        fragment->addEpsilonRule(0, 1);
    }
}

// 解析单个可能被转义的字符。
static char parseChar(const std::string &text) {
    // 未转义的字符
    if (text.front() != '\\') return text.front();

    // 处理转义字符
    char value = text.back();
    switch (value) {
        case 'f': return '\f';
        case 'n': return '\n';
        case 'r': return '\r';
        case 't': return '\t';
        case 'v': return '\v';
        case '0': return '\0';
        default: return value;
    }
}

// normalItem : single | group ;
// single : char | characterClass | AnyCharacter | characterGroup ;
// group : '(' regex ')' ;
void RegexCompileListener::exitNormalItem(regexParser::NormalItemContext *ctx) {
    auto fragment = createFragment(ctx);
    if (auto single = ctx->single()) {
        if (auto char_ = single->char_()) {
            // 解析普通字符并添加普通转移
            fragment->addNormalRule(0, 1, parseChar(char_->getText()));
        } else if (auto characterClass = single->characterClass()) {
            // 字符类别取最后一位用于区分
            fragment->addSpecialRule(0, 1, characterClass->getText().back());
        } else if (single->AnyCharacter()) {
            fragment->addSpecialRule(0, 1, '.');
        } else if (auto characterGroup = single->characterGroup()) {
            fragment->addFragment(0, 1, getFragment(characterGroup));
        }
    } else if (auto group = ctx->group()) {
        auto regex = group->regex();
        fragment->addFragment(0, 1, getFragment(regex));
    }
}

// characterGroup : '[' characterGroupNegativeModifier? characterGroupItem+ ']';
// characterGroupItem : charInGroup | characterClass | characterRange ;
void RegexCompileListener::exitCharacterGroup(regexParser::CharacterGroupContext *ctx) {
    auto fragment = createFragment(ctx);

    auto groupItems = ctx->characterGroupItem();
    for (auto groupItem : groupItems) {
        if (auto charInGroup = groupItem->charInGroup()) {
            fragment->addNormalRule(0, 1, parseChar(charInGroup->getText()));
        } else if (auto characterClass = groupItem->characterClass()) {
            fragment->addSpecialRule(0, 1, characterClass->getText().back());
        } else if (auto characterRange = groupItem->characterRange()) {
            auto chars = characterRange->charInGroup();
            char lbound = parseChar(chars[0]->getText());
            char ubound = parseChar(chars[1]->getText());
            fragment->addRangeRule(0, 1, lbound, ubound);
        }
    }

    if (ctx->characterGroupNegativeModifier()) {
        // 枚举 ASCII 字符并判断能否匹配
        std::vector<bool> mask(128, true);
        for (int i = 0; i < 128; i++) {
            for (const auto &edge : fragment->rule_edges) {
                if (edge.rule.matches(i)) {
                    mask[i] = false;
                    break;
                }
            }
        }

        // 构造新的迁移边
        fragment->rule_edges.clear();
        for (int i = 0; i < 128; i++) {
            int start = i;
            while (i < 128 && mask[i]) i++;
            if (i != start) { // 对 ASCII 码连续的可匹配字符构造区间转移
                fragment->addRangeRule(0, 1, start, i - 1);
            }
        }
    }
}

void RegexCompileListener::buildFrom(regexParser::RegexContext *tree) {
    // 遍历正则表达式的语法树
    antlr4::tree::ParseTreeWalker::DEFAULT.walk(this, tree);

    // 加入初态 0 和终态 1
    regex.nfa.append_states(2);
    regex.nfa.set_final(1, true);

    // 把编译得到的片段组装成完整的 NFA
    NFAFragment *fragment = getFragment(tree);
    assemble(fragment, 0, 1);

    // 允许从任意位置开始匹配
    regex.nfa.add_rule(0, { 0, SPECIAL, "*" });

    std::cout << regex.nfa;
}

void RegexCompileListener::assemble(const NFAFragment *fragment, int initial, int final) const {
    auto &nfa = regex.nfa;

    // 在 NFA 中添加所需的额外状态
    int state_offset = nfa.append_states(fragment->num_nodes);

    // 计算 NFA 中状态的下标
    auto stateIndex = [&](NFAFragment::NodeId id) {
        if (id <= 0) return initial;
        if (id > fragment->num_nodes) return final;
        return state_offset + (id - 1);
    };

    // 将迁移边从片段复制到 NFA 中
    auto copyRule = [&](const NFAFragment::RuleEdge &edge) {
        int from = stateIndex(edge.from);
        int to = stateIndex(edge.to);
        Rule &rule = nfa.add_rule(from, edge.rule);
        rule.dst = to;
    };

    // 处理不需要最后添加的迁移边
    for (auto &edge : fragment->rule_edges) {
        if (edge.rule.dst != 1) copyRule(edge);
    }

    // 在 NFA 中递归组装子片段
    for (auto &edge : fragment->fragment_edges) {
        int from = stateIndex(edge.from);
        int to = stateIndex(edge.to);
        assemble(edge.fragment, from, to);
    }

    // 处理需要最后添加的迁移边
    for (auto &edge : fragment->rule_edges) {
        if (edge.rule.dst == 1) copyRule(edge);
    }
}

#include "regex-compile-listener.h"

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

    auto fragment = createFragment(ctx, 0);
    for (auto expression : expressions) {
        fragment->addFragment(-1, 0, getFragment(expression));
    }
}

// expression : expressionItem+ ;
void RegexCompileListener::exitExpression(regexParser::ExpressionContext *ctx) {
    auto expressionItems = ctx->expressionItem();
    int count = expressionItems.size();
    printf("expression item count = %d\n", count);

    auto fragment = createFragment(ctx, count - 1);
    for (int i = 0; i < count; i++) {
        fragment->addFragment(i - 1, i, getFragment(expressionItems[i]));
    }
}

// expressionItem : normalItem quantifier? ;
void RegexCompileListener::exitExpressionItem(regexParser::ExpressionItemContext *ctx) {
    auto normalItem = ctx->normalItem();
    auto quantifier = ctx->quantifier();

    // TODO: quantifier support
    auto fragment = createFragment(ctx, 0);
    fragment->addFragment(-1, 0, getFragment(normalItem));
}

// normalItem : single | group ;
void RegexCompileListener::exitNormalItem(regexParser::NormalItemContext *ctx) {
    auto fragment = createFragment(ctx, 0);
    if (auto single = ctx->single()) {
        fragment->addFragment(-1, 0, getFragment(single));
    } else if (auto group = ctx->group()) {
        fragment->addFragment(-1, 0, getFragment(group));
    }
}

// group : '(' regex ')' ;
void RegexCompileListener::exitGroup(regexParser::GroupContext *ctx) {
    auto fragment = createFragment(ctx, 0);
    auto regex = ctx->regex();
    fragment->addFragment(-1, 0, getFragment(regex));
}

// single : char | characterClass | AnyCharacter | characterGroup ;
void RegexCompileListener::exitSingle(regexParser::SingleContext *ctx) {
    auto fragment = createFragment(ctx, 0);
    if (auto char_ = ctx->char_()) {
        // 不论字符是否被转义，取最后一位即可
        fragment->addNormalRule(-1, 0, char_->getText().back());
    } else if (auto characterClass = ctx->characterClass()) {
        // 字符类别同样取最后一位用于区分
        fragment->addSpecialRule(-1, 0, characterClass->getText().back());
    } else if (ctx->AnyCharacter()) {
        fragment->addSpecialRule(-1, 0, '.');
    } else if (auto characterGroup = ctx->characterGroup()) {
        fragment->addFragment(-1, 0, getFragment(characterGroup));
    }
}

// characterGroup : '[' characterGroupNegativeModifier? characterGroupItem+ ']';
// characterGroupItem : charInGroup | characterClass | characterRange ;
void RegexCompileListener::exitCharacterGroup(regexParser::CharacterGroupContext *ctx) {
    auto fragment = createFragment(ctx, 0);

    auto groupItems = ctx->characterGroupItem();
    for (auto groupItem : groupItems) {
        if (auto charInGroup = groupItem->charInGroup()) {
            fragment->addNormalRule(-1, 0, charInGroup->getText().back());
        } else if (auto characterClass = groupItem->characterClass()) {
            fragment->addSpecialRule(-1, 0, characterClass->getText().back());
        } else if (auto characterRange = groupItem->characterRange()) {
            auto chars = characterRange->charInGroup();
            char lbound = chars[0]->getText().back();
            char ubound = chars[1]->getText().back();
            fragment->addRangeRule(-1, 0, lbound, ubound);
        }
    }

    // TODO: negative modifier
}

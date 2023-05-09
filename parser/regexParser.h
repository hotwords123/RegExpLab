
// Generated from regex.g4 by ANTLR 4.12.0

#pragma once


#include "antlr4-runtime.h"




class  regexParser : public antlr4::Parser {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    GroupNonCapturingModifier = 8, AnyCharacter = 9, Hat = 10, Hyphen = 11, 
    CharacterClassAnyWord = 12, CharacterClassAnyWordInverted = 13, CharacterClassAnyDecimalDigit = 14, 
    CharacterClassAnyDecimalDigitInverted = 15, CharacterClassAnyBlank = 16, 
    CharacterClassAnyBlankInverted = 17, ZeroOrMoreQuantifier = 18, OneOrMoreQuantifier = 19, 
    ZeroOrOneQuantifier = 20, RangeQuantifierSeparator = 21, AnchorWordBoundary = 22, 
    AnchorNonWordBoundary = 23, AnchorEndOfString = 24, EscapedChar = 25, 
    Digit = 26, Char = 27
  };

  enum {
    RuleRegex = 0, RuleExpression = 1, RuleExpressionItem = 2, RuleNormalItem = 3, 
    RuleGroup = 4, RuleSingle = 5, RuleCharacterGroup = 6, RuleCharacterGroupNegativeModifier = 7, 
    RuleCharacterGroupItem = 8, RuleCharacterRange = 9, RuleCharacterClass = 10, 
    RuleQuantifier = 11, RuleLazyModifier = 12, RuleQuantifierType = 13, 
    RuleRangeQuantifier = 14, RuleRangeQuantifierLowerBound = 15, RuleRangeQuantifierUpperBound = 16, 
    RuleInteger = 17, RuleAnchor = 18, RuleAnchorStartOfString = 19, RuleChar = 20, 
    RuleCharInGroup = 21
  };

  explicit regexParser(antlr4::TokenStream *input);

  regexParser(antlr4::TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options);

  ~regexParser() override;

  std::string getGrammarFileName() const override;

  const antlr4::atn::ATN& getATN() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;


  class RegexContext;
  class ExpressionContext;
  class ExpressionItemContext;
  class NormalItemContext;
  class GroupContext;
  class SingleContext;
  class CharacterGroupContext;
  class CharacterGroupNegativeModifierContext;
  class CharacterGroupItemContext;
  class CharacterRangeContext;
  class CharacterClassContext;
  class QuantifierContext;
  class LazyModifierContext;
  class QuantifierTypeContext;
  class RangeQuantifierContext;
  class RangeQuantifierLowerBoundContext;
  class RangeQuantifierUpperBoundContext;
  class IntegerContext;
  class AnchorContext;
  class AnchorStartOfStringContext;
  class CharContext;
  class CharInGroupContext; 

  class  RegexContext : public antlr4::ParserRuleContext {
  public:
    RegexContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  RegexContext* regex();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionItemContext *> expressionItem();
    ExpressionItemContext* expressionItem(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  ExpressionContext* expression();

  class  ExpressionItemContext : public antlr4::ParserRuleContext {
  public:
    ExpressionItemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    NormalItemContext *normalItem();
    QuantifierContext *quantifier();
    AnchorContext *anchor();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  ExpressionItemContext* expressionItem();

  class  NormalItemContext : public antlr4::ParserRuleContext {
  public:
    NormalItemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    SingleContext *single();
    GroupContext *group();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  NormalItemContext* normalItem();

  class  GroupContext : public antlr4::ParserRuleContext {
  public:
    GroupContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    RegexContext *regex();
    antlr4::tree::TerminalNode *GroupNonCapturingModifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  GroupContext* group();

  class  SingleContext : public antlr4::ParserRuleContext {
  public:
    SingleContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CharContext *char_();
    CharacterClassContext *characterClass();
    antlr4::tree::TerminalNode *AnyCharacter();
    CharacterGroupContext *characterGroup();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  SingleContext* single();

  class  CharacterGroupContext : public antlr4::ParserRuleContext {
  public:
    CharacterGroupContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CharacterGroupNegativeModifierContext *characterGroupNegativeModifier();
    std::vector<CharacterGroupItemContext *> characterGroupItem();
    CharacterGroupItemContext* characterGroupItem(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CharacterGroupContext* characterGroup();

  class  CharacterGroupNegativeModifierContext : public antlr4::ParserRuleContext {
  public:
    CharacterGroupNegativeModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Hat();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CharacterGroupNegativeModifierContext* characterGroupNegativeModifier();

  class  CharacterGroupItemContext : public antlr4::ParserRuleContext {
  public:
    CharacterGroupItemContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    CharInGroupContext *charInGroup();
    CharacterClassContext *characterClass();
    CharacterRangeContext *characterRange();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CharacterGroupItemContext* characterGroupItem();

  class  CharacterRangeContext : public antlr4::ParserRuleContext {
  public:
    CharacterRangeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<CharInGroupContext *> charInGroup();
    CharInGroupContext* charInGroup(size_t i);
    antlr4::tree::TerminalNode *Hyphen();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CharacterRangeContext* characterRange();

  class  CharacterClassContext : public antlr4::ParserRuleContext {
  public:
    CharacterClassContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CharacterClassAnyWord();
    antlr4::tree::TerminalNode *CharacterClassAnyWordInverted();
    antlr4::tree::TerminalNode *CharacterClassAnyDecimalDigit();
    antlr4::tree::TerminalNode *CharacterClassAnyDecimalDigitInverted();
    antlr4::tree::TerminalNode *CharacterClassAnyBlank();
    antlr4::tree::TerminalNode *CharacterClassAnyBlankInverted();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CharacterClassContext* characterClass();

  class  QuantifierContext : public antlr4::ParserRuleContext {
  public:
    QuantifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    QuantifierTypeContext *quantifierType();
    LazyModifierContext *lazyModifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  QuantifierContext* quantifier();

  class  LazyModifierContext : public antlr4::ParserRuleContext {
  public:
    LazyModifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ZeroOrOneQuantifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  LazyModifierContext* lazyModifier();

  class  QuantifierTypeContext : public antlr4::ParserRuleContext {
  public:
    QuantifierTypeContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ZeroOrMoreQuantifier();
    antlr4::tree::TerminalNode *OneOrMoreQuantifier();
    antlr4::tree::TerminalNode *ZeroOrOneQuantifier();
    RangeQuantifierContext *rangeQuantifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  QuantifierTypeContext* quantifierType();

  class  RangeQuantifierContext : public antlr4::ParserRuleContext {
  public:
    RangeQuantifierContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    RangeQuantifierLowerBoundContext *rangeQuantifierLowerBound();
    antlr4::tree::TerminalNode *RangeQuantifierSeparator();
    RangeQuantifierUpperBoundContext *rangeQuantifierUpperBound();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  RangeQuantifierContext* rangeQuantifier();

  class  RangeQuantifierLowerBoundContext : public antlr4::ParserRuleContext {
  public:
    RangeQuantifierLowerBoundContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IntegerContext *integer();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  RangeQuantifierLowerBoundContext* rangeQuantifierLowerBound();

  class  RangeQuantifierUpperBoundContext : public antlr4::ParserRuleContext {
  public:
    RangeQuantifierUpperBoundContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    IntegerContext *integer();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  RangeQuantifierUpperBoundContext* rangeQuantifierUpperBound();

  class  IntegerContext : public antlr4::ParserRuleContext {
  public:
    IntegerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> Digit();
    antlr4::tree::TerminalNode* Digit(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  IntegerContext* integer();

  class  AnchorContext : public antlr4::ParserRuleContext {
  public:
    AnchorContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    AnchorStartOfStringContext *anchorStartOfString();
    antlr4::tree::TerminalNode *AnchorEndOfString();
    antlr4::tree::TerminalNode *AnchorWordBoundary();
    antlr4::tree::TerminalNode *AnchorNonWordBoundary();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  AnchorContext* anchor();

  class  AnchorStartOfStringContext : public antlr4::ParserRuleContext {
  public:
    AnchorStartOfStringContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *Hat();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  AnchorStartOfStringContext* anchorStartOfString();

  class  CharContext : public antlr4::ParserRuleContext {
  public:
    CharContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EscapedChar();
    antlr4::tree::TerminalNode *Digit();
    antlr4::tree::TerminalNode *Char();
    antlr4::tree::TerminalNode *Hyphen();
    antlr4::tree::TerminalNode *RangeQuantifierSeparator();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CharContext* char_();

  class  CharInGroupContext : public antlr4::ParserRuleContext {
  public:
    CharInGroupContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EscapedChar();
    antlr4::tree::TerminalNode *Digit();
    antlr4::tree::TerminalNode *Char();
    antlr4::tree::TerminalNode *AnyCharacter();
    antlr4::tree::TerminalNode *Hat();
    antlr4::tree::TerminalNode *AnchorEndOfString();
    antlr4::tree::TerminalNode *ZeroOrMoreQuantifier();
    antlr4::tree::TerminalNode *OneOrMoreQuantifier();
    antlr4::tree::TerminalNode *ZeroOrOneQuantifier();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;
   
  };

  CharInGroupContext* charInGroup();


  // By default the static state used to implement the parser is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:
};


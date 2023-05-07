
// Generated from regex.g4 by ANTLR 4.12.0

#pragma once


#include "antlr4-runtime.h"
#include "regexParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by regexParser.
 */
class  regexListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterRegex(regexParser::RegexContext *ctx) = 0;
  virtual void exitRegex(regexParser::RegexContext *ctx) = 0;

  virtual void enterExpression(regexParser::ExpressionContext *ctx) = 0;
  virtual void exitExpression(regexParser::ExpressionContext *ctx) = 0;

  virtual void enterExpressionItem(regexParser::ExpressionItemContext *ctx) = 0;
  virtual void exitExpressionItem(regexParser::ExpressionItemContext *ctx) = 0;

  virtual void enterNormalItem(regexParser::NormalItemContext *ctx) = 0;
  virtual void exitNormalItem(regexParser::NormalItemContext *ctx) = 0;

  virtual void enterGroup(regexParser::GroupContext *ctx) = 0;
  virtual void exitGroup(regexParser::GroupContext *ctx) = 0;

  virtual void enterSingle(regexParser::SingleContext *ctx) = 0;
  virtual void exitSingle(regexParser::SingleContext *ctx) = 0;

  virtual void enterCharacterGroup(regexParser::CharacterGroupContext *ctx) = 0;
  virtual void exitCharacterGroup(regexParser::CharacterGroupContext *ctx) = 0;

  virtual void enterCharacterGroupNegativeModifier(regexParser::CharacterGroupNegativeModifierContext *ctx) = 0;
  virtual void exitCharacterGroupNegativeModifier(regexParser::CharacterGroupNegativeModifierContext *ctx) = 0;

  virtual void enterCharacterGroupItem(regexParser::CharacterGroupItemContext *ctx) = 0;
  virtual void exitCharacterGroupItem(regexParser::CharacterGroupItemContext *ctx) = 0;

  virtual void enterCharacterRange(regexParser::CharacterRangeContext *ctx) = 0;
  virtual void exitCharacterRange(regexParser::CharacterRangeContext *ctx) = 0;

  virtual void enterCharacterClass(regexParser::CharacterClassContext *ctx) = 0;
  virtual void exitCharacterClass(regexParser::CharacterClassContext *ctx) = 0;

  virtual void enterQuantifier(regexParser::QuantifierContext *ctx) = 0;
  virtual void exitQuantifier(regexParser::QuantifierContext *ctx) = 0;

  virtual void enterLazyModifier(regexParser::LazyModifierContext *ctx) = 0;
  virtual void exitLazyModifier(regexParser::LazyModifierContext *ctx) = 0;

  virtual void enterQuantifierType(regexParser::QuantifierTypeContext *ctx) = 0;
  virtual void exitQuantifierType(regexParser::QuantifierTypeContext *ctx) = 0;

  virtual void enterChar(regexParser::CharContext *ctx) = 0;
  virtual void exitChar(regexParser::CharContext *ctx) = 0;

  virtual void enterCharInGroup(regexParser::CharInGroupContext *ctx) = 0;
  virtual void exitCharInGroup(regexParser::CharInGroupContext *ctx) = 0;


};


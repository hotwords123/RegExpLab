
// Generated from regex.g4 by ANTLR 4.12.0

#pragma once


#include "antlr4-runtime.h"
#include "regexListener.h"


/**
 * This class provides an empty implementation of regexListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  regexBaseListener : public regexListener {
public:

  virtual void enterRegex(regexParser::RegexContext * /*ctx*/) override { }
  virtual void exitRegex(regexParser::RegexContext * /*ctx*/) override { }

  virtual void enterExpression(regexParser::ExpressionContext * /*ctx*/) override { }
  virtual void exitExpression(regexParser::ExpressionContext * /*ctx*/) override { }

  virtual void enterExpressionItem(regexParser::ExpressionItemContext * /*ctx*/) override { }
  virtual void exitExpressionItem(regexParser::ExpressionItemContext * /*ctx*/) override { }

  virtual void enterNormalItem(regexParser::NormalItemContext * /*ctx*/) override { }
  virtual void exitNormalItem(regexParser::NormalItemContext * /*ctx*/) override { }

  virtual void enterGroup(regexParser::GroupContext * /*ctx*/) override { }
  virtual void exitGroup(regexParser::GroupContext * /*ctx*/) override { }

  virtual void enterSingle(regexParser::SingleContext * /*ctx*/) override { }
  virtual void exitSingle(regexParser::SingleContext * /*ctx*/) override { }

  virtual void enterCharacterGroup(regexParser::CharacterGroupContext * /*ctx*/) override { }
  virtual void exitCharacterGroup(regexParser::CharacterGroupContext * /*ctx*/) override { }

  virtual void enterCharacterGroupNegativeModifier(regexParser::CharacterGroupNegativeModifierContext * /*ctx*/) override { }
  virtual void exitCharacterGroupNegativeModifier(regexParser::CharacterGroupNegativeModifierContext * /*ctx*/) override { }

  virtual void enterCharacterGroupItem(regexParser::CharacterGroupItemContext * /*ctx*/) override { }
  virtual void exitCharacterGroupItem(regexParser::CharacterGroupItemContext * /*ctx*/) override { }

  virtual void enterCharacterRange(regexParser::CharacterRangeContext * /*ctx*/) override { }
  virtual void exitCharacterRange(regexParser::CharacterRangeContext * /*ctx*/) override { }

  virtual void enterCharacterClass(regexParser::CharacterClassContext * /*ctx*/) override { }
  virtual void exitCharacterClass(regexParser::CharacterClassContext * /*ctx*/) override { }

  virtual void enterQuantifier(regexParser::QuantifierContext * /*ctx*/) override { }
  virtual void exitQuantifier(regexParser::QuantifierContext * /*ctx*/) override { }

  virtual void enterLazyModifier(regexParser::LazyModifierContext * /*ctx*/) override { }
  virtual void exitLazyModifier(regexParser::LazyModifierContext * /*ctx*/) override { }

  virtual void enterQuantifierType(regexParser::QuantifierTypeContext * /*ctx*/) override { }
  virtual void exitQuantifierType(regexParser::QuantifierTypeContext * /*ctx*/) override { }

  virtual void enterChar(regexParser::CharContext * /*ctx*/) override { }
  virtual void exitChar(regexParser::CharContext * /*ctx*/) override { }

  virtual void enterCharInGroup(regexParser::CharInGroupContext * /*ctx*/) override { }
  virtual void exitCharInGroup(regexParser::CharInGroupContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};


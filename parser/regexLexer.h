
// Generated from regex.g4 by ANTLR 4.12.0

#pragma once


#include "antlr4-runtime.h"




class  regexLexer : public antlr4::Lexer {
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

  explicit regexLexer(antlr4::CharStream *input);

  ~regexLexer() override;


  std::string getGrammarFileName() const override;

  const std::vector<std::string>& getRuleNames() const override;

  const std::vector<std::string>& getChannelNames() const override;

  const std::vector<std::string>& getModeNames() const override;

  const antlr4::dfa::Vocabulary& getVocabulary() const override;

  antlr4::atn::SerializedATNView getSerializedATN() const override;

  const antlr4::atn::ATN& getATN() const override;

  // By default the static state used to implement the lexer is lazily initialized during the first
  // call to the constructor. You can call this function if you wish to initialize the static state
  // ahead of time.
  static void initialize();

private:

  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

};


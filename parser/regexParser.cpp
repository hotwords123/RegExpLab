
// Generated from regex.g4 by ANTLR 4.12.0


#include "regexListener.h"

#include "regexParser.h"


using namespace antlrcpp;

using namespace antlr4;

namespace {

struct RegexParserStaticData final {
  RegexParserStaticData(std::vector<std::string> ruleNames,
                        std::vector<std::string> literalNames,
                        std::vector<std::string> symbolicNames)
      : ruleNames(std::move(ruleNames)), literalNames(std::move(literalNames)),
        symbolicNames(std::move(symbolicNames)),
        vocabulary(this->literalNames, this->symbolicNames) {}

  RegexParserStaticData(const RegexParserStaticData&) = delete;
  RegexParserStaticData(RegexParserStaticData&&) = delete;
  RegexParserStaticData& operator=(const RegexParserStaticData&) = delete;
  RegexParserStaticData& operator=(RegexParserStaticData&&) = delete;

  std::vector<antlr4::dfa::DFA> decisionToDFA;
  antlr4::atn::PredictionContextCache sharedContextCache;
  const std::vector<std::string> ruleNames;
  const std::vector<std::string> literalNames;
  const std::vector<std::string> symbolicNames;
  const antlr4::dfa::Vocabulary vocabulary;
  antlr4::atn::SerializedATNView serializedATN;
  std::unique_ptr<antlr4::atn::ATN> atn;
};

::antlr4::internal::OnceFlag regexParserOnceFlag;
RegexParserStaticData *regexParserStaticData = nullptr;

void regexParserInitialize() {
  assert(regexParserStaticData == nullptr);
  auto staticData = std::make_unique<RegexParserStaticData>(
    std::vector<std::string>{
      "regex", "expression", "expressionItem", "normalItem", "group", "single", 
      "characterGroup", "characterGroupNegativeModifier", "characterGroupItem", 
      "characterRange", "characterClass", "quantifier", "lazyModifier", 
      "quantifierType", "char", "charInGroup"
    },
    std::vector<std::string>{
      "", "'|'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\\u003F:'", 
      "'.'", "'^'", "'-'", "'\\w'", "'\\W'", "'\\d'", "'\\D'", "'\\s'", 
      "'\\S'", "'*'", "'+'", "'\\u003F'", "'\\b'", "'\\B'", "'$'"
    },
    std::vector<std::string>{
      "", "", "", "", "", "", "", "", "GroupNonCapturingModifier", "AnyCharacter", 
      "Hat", "Hyphen", "CharacterClassAnyWord", "CharacterClassAnyWordInverted", 
      "CharacterClassAnyDecimalDigit", "CharacterClassAnyDecimalDigitInverted", 
      "CharacterClassAnyBlank", "CharacterClassAnyBlankInverted", "ZeroOrMoreQuantifier", 
      "OneOrMoreQuantifier", "ZeroOrOneQuantifier", "AnchorWordBoundary", 
      "AnchorNonWordBoundary", "AnchorEndOfString", "EscapedChar", "Digit", 
      "Char"
    }
  );
  static const int32_t serializedATNSegment[] = {
  	4,1,26,100,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,
  	7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,
  	14,2,15,7,15,1,0,1,0,1,0,5,0,36,8,0,10,0,12,0,39,9,0,1,1,4,1,42,8,1,11,
  	1,12,1,43,1,2,1,2,3,2,48,8,2,1,3,1,3,3,3,52,8,3,1,4,1,4,1,4,1,4,1,5,1,
  	5,1,5,1,5,3,5,62,8,5,1,6,1,6,3,6,66,8,6,1,6,4,6,69,8,6,11,6,12,6,70,1,
  	6,1,6,1,7,1,7,1,8,1,8,1,8,3,8,80,8,8,1,9,1,9,1,9,1,9,1,10,1,10,1,11,1,
  	11,3,11,90,8,11,1,12,1,12,1,13,1,13,1,14,1,14,1,15,1,15,1,15,0,0,16,0,
  	2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,0,4,1,0,12,17,1,0,18,20,2,0,
  	11,11,24,26,5,0,1,4,6,7,9,10,18,20,23,26,95,0,32,1,0,0,0,2,41,1,0,0,0,
  	4,45,1,0,0,0,6,51,1,0,0,0,8,53,1,0,0,0,10,61,1,0,0,0,12,63,1,0,0,0,14,
  	74,1,0,0,0,16,79,1,0,0,0,18,81,1,0,0,0,20,85,1,0,0,0,22,87,1,0,0,0,24,
  	91,1,0,0,0,26,93,1,0,0,0,28,95,1,0,0,0,30,97,1,0,0,0,32,37,3,2,1,0,33,
  	34,5,1,0,0,34,36,3,2,1,0,35,33,1,0,0,0,36,39,1,0,0,0,37,35,1,0,0,0,37,
  	38,1,0,0,0,38,1,1,0,0,0,39,37,1,0,0,0,40,42,3,4,2,0,41,40,1,0,0,0,42,
  	43,1,0,0,0,43,41,1,0,0,0,43,44,1,0,0,0,44,3,1,0,0,0,45,47,3,6,3,0,46,
  	48,3,22,11,0,47,46,1,0,0,0,47,48,1,0,0,0,48,5,1,0,0,0,49,52,3,10,5,0,
  	50,52,3,8,4,0,51,49,1,0,0,0,51,50,1,0,0,0,52,7,1,0,0,0,53,54,5,2,0,0,
  	54,55,3,0,0,0,55,56,5,3,0,0,56,9,1,0,0,0,57,62,3,28,14,0,58,62,3,20,10,
  	0,59,62,5,9,0,0,60,62,3,12,6,0,61,57,1,0,0,0,61,58,1,0,0,0,61,59,1,0,
  	0,0,61,60,1,0,0,0,62,11,1,0,0,0,63,65,5,4,0,0,64,66,3,14,7,0,65,64,1,
  	0,0,0,65,66,1,0,0,0,66,68,1,0,0,0,67,69,3,16,8,0,68,67,1,0,0,0,69,70,
  	1,0,0,0,70,68,1,0,0,0,70,71,1,0,0,0,71,72,1,0,0,0,72,73,5,5,0,0,73,13,
  	1,0,0,0,74,75,5,10,0,0,75,15,1,0,0,0,76,80,3,30,15,0,77,80,3,20,10,0,
  	78,80,3,18,9,0,79,76,1,0,0,0,79,77,1,0,0,0,79,78,1,0,0,0,80,17,1,0,0,
  	0,81,82,3,30,15,0,82,83,5,11,0,0,83,84,3,30,15,0,84,19,1,0,0,0,85,86,
  	7,0,0,0,86,21,1,0,0,0,87,89,3,26,13,0,88,90,3,24,12,0,89,88,1,0,0,0,89,
  	90,1,0,0,0,90,23,1,0,0,0,91,92,5,20,0,0,92,25,1,0,0,0,93,94,7,1,0,0,94,
  	27,1,0,0,0,95,96,7,2,0,0,96,29,1,0,0,0,97,98,7,3,0,0,98,31,1,0,0,0,9,
  	37,43,47,51,61,65,70,79,89
  };
  staticData->serializedATN = antlr4::atn::SerializedATNView(serializedATNSegment, sizeof(serializedATNSegment) / sizeof(serializedATNSegment[0]));

  antlr4::atn::ATNDeserializer deserializer;
  staticData->atn = deserializer.deserialize(staticData->serializedATN);

  const size_t count = staticData->atn->getNumberOfDecisions();
  staticData->decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    staticData->decisionToDFA.emplace_back(staticData->atn->getDecisionState(i), i);
  }
  regexParserStaticData = staticData.release();
}

}

regexParser::regexParser(TokenStream *input) : regexParser(input, antlr4::atn::ParserATNSimulatorOptions()) {}

regexParser::regexParser(TokenStream *input, const antlr4::atn::ParserATNSimulatorOptions &options) : Parser(input) {
  regexParser::initialize();
  _interpreter = new atn::ParserATNSimulator(this, *regexParserStaticData->atn, regexParserStaticData->decisionToDFA, regexParserStaticData->sharedContextCache, options);
}

regexParser::~regexParser() {
  delete _interpreter;
}

const atn::ATN& regexParser::getATN() const {
  return *regexParserStaticData->atn;
}

std::string regexParser::getGrammarFileName() const {
  return "regex.g4";
}

const std::vector<std::string>& regexParser::getRuleNames() const {
  return regexParserStaticData->ruleNames;
}

const dfa::Vocabulary& regexParser::getVocabulary() const {
  return regexParserStaticData->vocabulary;
}

antlr4::atn::SerializedATNView regexParser::getSerializedATN() const {
  return regexParserStaticData->serializedATN;
}


//----------------- RegexContext ------------------------------------------------------------------

regexParser::RegexContext::RegexContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<regexParser::ExpressionContext *> regexParser::RegexContext::expression() {
  return getRuleContexts<regexParser::ExpressionContext>();
}

regexParser::ExpressionContext* regexParser::RegexContext::expression(size_t i) {
  return getRuleContext<regexParser::ExpressionContext>(i);
}


size_t regexParser::RegexContext::getRuleIndex() const {
  return regexParser::RuleRegex;
}

void regexParser::RegexContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterRegex(this);
}

void regexParser::RegexContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitRegex(this);
}

regexParser::RegexContext* regexParser::regex() {
  RegexContext *_localctx = _tracker.createInstance<RegexContext>(_ctx, getState());
  enterRule(_localctx, 0, regexParser::RuleRegex);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(32);
    expression();
    setState(37);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == regexParser::T__0) {
      setState(33);
      match(regexParser::T__0);
      setState(34);
      expression();
      setState(39);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

regexParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<regexParser::ExpressionItemContext *> regexParser::ExpressionContext::expressionItem() {
  return getRuleContexts<regexParser::ExpressionItemContext>();
}

regexParser::ExpressionItemContext* regexParser::ExpressionContext::expressionItem(size_t i) {
  return getRuleContext<regexParser::ExpressionItemContext>(i);
}


size_t regexParser::ExpressionContext::getRuleIndex() const {
  return regexParser::RuleExpression;
}

void regexParser::ExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpression(this);
}

void regexParser::ExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpression(this);
}

regexParser::ExpressionContext* regexParser::expression() {
  ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, getState());
  enterRule(_localctx, 2, regexParser::RuleExpression);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(41); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(40);
      expressionItem();
      setState(43); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 117701140) != 0));
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionItemContext ------------------------------------------------------------------

regexParser::ExpressionItemContext::ExpressionItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

regexParser::NormalItemContext* regexParser::ExpressionItemContext::normalItem() {
  return getRuleContext<regexParser::NormalItemContext>(0);
}

regexParser::QuantifierContext* regexParser::ExpressionItemContext::quantifier() {
  return getRuleContext<regexParser::QuantifierContext>(0);
}


size_t regexParser::ExpressionItemContext::getRuleIndex() const {
  return regexParser::RuleExpressionItem;
}

void regexParser::ExpressionItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpressionItem(this);
}

void regexParser::ExpressionItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpressionItem(this);
}

regexParser::ExpressionItemContext* regexParser::expressionItem() {
  ExpressionItemContext *_localctx = _tracker.createInstance<ExpressionItemContext>(_ctx, getState());
  enterRule(_localctx, 4, regexParser::RuleExpressionItem);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(45);
    normalItem();
    setState(47);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 1835008) != 0)) {
      setState(46);
      quantifier();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NormalItemContext ------------------------------------------------------------------

regexParser::NormalItemContext::NormalItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

regexParser::SingleContext* regexParser::NormalItemContext::single() {
  return getRuleContext<regexParser::SingleContext>(0);
}

regexParser::GroupContext* regexParser::NormalItemContext::group() {
  return getRuleContext<regexParser::GroupContext>(0);
}


size_t regexParser::NormalItemContext::getRuleIndex() const {
  return regexParser::RuleNormalItem;
}

void regexParser::NormalItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterNormalItem(this);
}

void regexParser::NormalItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitNormalItem(this);
}

regexParser::NormalItemContext* regexParser::normalItem() {
  NormalItemContext *_localctx = _tracker.createInstance<NormalItemContext>(_ctx, getState());
  enterRule(_localctx, 6, regexParser::RuleNormalItem);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(51);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case regexParser::T__3:
      case regexParser::AnyCharacter:
      case regexParser::Hyphen:
      case regexParser::CharacterClassAnyWord:
      case regexParser::CharacterClassAnyWordInverted:
      case regexParser::CharacterClassAnyDecimalDigit:
      case regexParser::CharacterClassAnyDecimalDigitInverted:
      case regexParser::CharacterClassAnyBlank:
      case regexParser::CharacterClassAnyBlankInverted:
      case regexParser::EscapedChar:
      case regexParser::Digit:
      case regexParser::Char: {
        enterOuterAlt(_localctx, 1);
        setState(49);
        single();
        break;
      }

      case regexParser::T__1: {
        enterOuterAlt(_localctx, 2);
        setState(50);
        group();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- GroupContext ------------------------------------------------------------------

regexParser::GroupContext::GroupContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

regexParser::RegexContext* regexParser::GroupContext::regex() {
  return getRuleContext<regexParser::RegexContext>(0);
}


size_t regexParser::GroupContext::getRuleIndex() const {
  return regexParser::RuleGroup;
}

void regexParser::GroupContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterGroup(this);
}

void regexParser::GroupContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitGroup(this);
}

regexParser::GroupContext* regexParser::group() {
  GroupContext *_localctx = _tracker.createInstance<GroupContext>(_ctx, getState());
  enterRule(_localctx, 8, regexParser::RuleGroup);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(53);
    match(regexParser::T__1);
    setState(54);
    regex();
    setState(55);
    match(regexParser::T__2);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SingleContext ------------------------------------------------------------------

regexParser::SingleContext::SingleContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

regexParser::CharContext* regexParser::SingleContext::char_() {
  return getRuleContext<regexParser::CharContext>(0);
}

regexParser::CharacterClassContext* regexParser::SingleContext::characterClass() {
  return getRuleContext<regexParser::CharacterClassContext>(0);
}

tree::TerminalNode* regexParser::SingleContext::AnyCharacter() {
  return getToken(regexParser::AnyCharacter, 0);
}

regexParser::CharacterGroupContext* regexParser::SingleContext::characterGroup() {
  return getRuleContext<regexParser::CharacterGroupContext>(0);
}


size_t regexParser::SingleContext::getRuleIndex() const {
  return regexParser::RuleSingle;
}

void regexParser::SingleContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSingle(this);
}

void regexParser::SingleContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSingle(this);
}

regexParser::SingleContext* regexParser::single() {
  SingleContext *_localctx = _tracker.createInstance<SingleContext>(_ctx, getState());
  enterRule(_localctx, 10, regexParser::RuleSingle);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(61);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case regexParser::Hyphen:
      case regexParser::EscapedChar:
      case regexParser::Digit:
      case regexParser::Char: {
        enterOuterAlt(_localctx, 1);
        setState(57);
        char_();
        break;
      }

      case regexParser::CharacterClassAnyWord:
      case regexParser::CharacterClassAnyWordInverted:
      case regexParser::CharacterClassAnyDecimalDigit:
      case regexParser::CharacterClassAnyDecimalDigitInverted:
      case regexParser::CharacterClassAnyBlank:
      case regexParser::CharacterClassAnyBlankInverted: {
        enterOuterAlt(_localctx, 2);
        setState(58);
        characterClass();
        break;
      }

      case regexParser::AnyCharacter: {
        enterOuterAlt(_localctx, 3);
        setState(59);
        match(regexParser::AnyCharacter);
        break;
      }

      case regexParser::T__3: {
        enterOuterAlt(_localctx, 4);
        setState(60);
        characterGroup();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CharacterGroupContext ------------------------------------------------------------------

regexParser::CharacterGroupContext::CharacterGroupContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

regexParser::CharacterGroupNegativeModifierContext* regexParser::CharacterGroupContext::characterGroupNegativeModifier() {
  return getRuleContext<regexParser::CharacterGroupNegativeModifierContext>(0);
}

std::vector<regexParser::CharacterGroupItemContext *> regexParser::CharacterGroupContext::characterGroupItem() {
  return getRuleContexts<regexParser::CharacterGroupItemContext>();
}

regexParser::CharacterGroupItemContext* regexParser::CharacterGroupContext::characterGroupItem(size_t i) {
  return getRuleContext<regexParser::CharacterGroupItemContext>(i);
}


size_t regexParser::CharacterGroupContext::getRuleIndex() const {
  return regexParser::RuleCharacterGroup;
}

void regexParser::CharacterGroupContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCharacterGroup(this);
}

void regexParser::CharacterGroupContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCharacterGroup(this);
}

regexParser::CharacterGroupContext* regexParser::characterGroup() {
  CharacterGroupContext *_localctx = _tracker.createInstance<CharacterGroupContext>(_ctx, getState());
  enterRule(_localctx, 12, regexParser::RuleCharacterGroup);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(63);
    match(regexParser::T__3);
    setState(65);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      setState(64);
      characterGroupNegativeModifier();
      break;
    }

    default:
      break;
    }
    setState(68); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(67);
      characterGroupItem();
      setState(70); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 127923934) != 0));
    setState(72);
    match(regexParser::T__4);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CharacterGroupNegativeModifierContext ------------------------------------------------------------------

regexParser::CharacterGroupNegativeModifierContext::CharacterGroupNegativeModifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* regexParser::CharacterGroupNegativeModifierContext::Hat() {
  return getToken(regexParser::Hat, 0);
}


size_t regexParser::CharacterGroupNegativeModifierContext::getRuleIndex() const {
  return regexParser::RuleCharacterGroupNegativeModifier;
}

void regexParser::CharacterGroupNegativeModifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCharacterGroupNegativeModifier(this);
}

void regexParser::CharacterGroupNegativeModifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCharacterGroupNegativeModifier(this);
}

regexParser::CharacterGroupNegativeModifierContext* regexParser::characterGroupNegativeModifier() {
  CharacterGroupNegativeModifierContext *_localctx = _tracker.createInstance<CharacterGroupNegativeModifierContext>(_ctx, getState());
  enterRule(_localctx, 14, regexParser::RuleCharacterGroupNegativeModifier);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(74);
    match(regexParser::Hat);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CharacterGroupItemContext ------------------------------------------------------------------

regexParser::CharacterGroupItemContext::CharacterGroupItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

regexParser::CharInGroupContext* regexParser::CharacterGroupItemContext::charInGroup() {
  return getRuleContext<regexParser::CharInGroupContext>(0);
}

regexParser::CharacterClassContext* regexParser::CharacterGroupItemContext::characterClass() {
  return getRuleContext<regexParser::CharacterClassContext>(0);
}

regexParser::CharacterRangeContext* regexParser::CharacterGroupItemContext::characterRange() {
  return getRuleContext<regexParser::CharacterRangeContext>(0);
}


size_t regexParser::CharacterGroupItemContext::getRuleIndex() const {
  return regexParser::RuleCharacterGroupItem;
}

void regexParser::CharacterGroupItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCharacterGroupItem(this);
}

void regexParser::CharacterGroupItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCharacterGroupItem(this);
}

regexParser::CharacterGroupItemContext* regexParser::characterGroupItem() {
  CharacterGroupItemContext *_localctx = _tracker.createInstance<CharacterGroupItemContext>(_ctx, getState());
  enterRule(_localctx, 16, regexParser::RuleCharacterGroupItem);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    setState(79);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(76);
      charInGroup();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(77);
      characterClass();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(78);
      characterRange();
      break;
    }

    default:
      break;
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CharacterRangeContext ------------------------------------------------------------------

regexParser::CharacterRangeContext::CharacterRangeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<regexParser::CharInGroupContext *> regexParser::CharacterRangeContext::charInGroup() {
  return getRuleContexts<regexParser::CharInGroupContext>();
}

regexParser::CharInGroupContext* regexParser::CharacterRangeContext::charInGroup(size_t i) {
  return getRuleContext<regexParser::CharInGroupContext>(i);
}

tree::TerminalNode* regexParser::CharacterRangeContext::Hyphen() {
  return getToken(regexParser::Hyphen, 0);
}


size_t regexParser::CharacterRangeContext::getRuleIndex() const {
  return regexParser::RuleCharacterRange;
}

void regexParser::CharacterRangeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCharacterRange(this);
}

void regexParser::CharacterRangeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCharacterRange(this);
}

regexParser::CharacterRangeContext* regexParser::characterRange() {
  CharacterRangeContext *_localctx = _tracker.createInstance<CharacterRangeContext>(_ctx, getState());
  enterRule(_localctx, 18, regexParser::RuleCharacterRange);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(81);
    charInGroup();
    setState(82);
    match(regexParser::Hyphen);
    setState(83);
    charInGroup();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CharacterClassContext ------------------------------------------------------------------

regexParser::CharacterClassContext::CharacterClassContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* regexParser::CharacterClassContext::CharacterClassAnyWord() {
  return getToken(regexParser::CharacterClassAnyWord, 0);
}

tree::TerminalNode* regexParser::CharacterClassContext::CharacterClassAnyWordInverted() {
  return getToken(regexParser::CharacterClassAnyWordInverted, 0);
}

tree::TerminalNode* regexParser::CharacterClassContext::CharacterClassAnyDecimalDigit() {
  return getToken(regexParser::CharacterClassAnyDecimalDigit, 0);
}

tree::TerminalNode* regexParser::CharacterClassContext::CharacterClassAnyDecimalDigitInverted() {
  return getToken(regexParser::CharacterClassAnyDecimalDigitInverted, 0);
}

tree::TerminalNode* regexParser::CharacterClassContext::CharacterClassAnyBlank() {
  return getToken(regexParser::CharacterClassAnyBlank, 0);
}

tree::TerminalNode* regexParser::CharacterClassContext::CharacterClassAnyBlankInverted() {
  return getToken(regexParser::CharacterClassAnyBlankInverted, 0);
}


size_t regexParser::CharacterClassContext::getRuleIndex() const {
  return regexParser::RuleCharacterClass;
}

void regexParser::CharacterClassContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCharacterClass(this);
}

void regexParser::CharacterClassContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCharacterClass(this);
}

regexParser::CharacterClassContext* regexParser::characterClass() {
  CharacterClassContext *_localctx = _tracker.createInstance<CharacterClassContext>(_ctx, getState());
  enterRule(_localctx, 20, regexParser::RuleCharacterClass);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(85);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 258048) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- QuantifierContext ------------------------------------------------------------------

regexParser::QuantifierContext::QuantifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

regexParser::QuantifierTypeContext* regexParser::QuantifierContext::quantifierType() {
  return getRuleContext<regexParser::QuantifierTypeContext>(0);
}

regexParser::LazyModifierContext* regexParser::QuantifierContext::lazyModifier() {
  return getRuleContext<regexParser::LazyModifierContext>(0);
}


size_t regexParser::QuantifierContext::getRuleIndex() const {
  return regexParser::RuleQuantifier;
}

void regexParser::QuantifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterQuantifier(this);
}

void regexParser::QuantifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitQuantifier(this);
}

regexParser::QuantifierContext* regexParser::quantifier() {
  QuantifierContext *_localctx = _tracker.createInstance<QuantifierContext>(_ctx, getState());
  enterRule(_localctx, 22, regexParser::RuleQuantifier);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(87);
    quantifierType();
    setState(89);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == regexParser::ZeroOrOneQuantifier) {
      setState(88);
      lazyModifier();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LazyModifierContext ------------------------------------------------------------------

regexParser::LazyModifierContext::LazyModifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* regexParser::LazyModifierContext::ZeroOrOneQuantifier() {
  return getToken(regexParser::ZeroOrOneQuantifier, 0);
}


size_t regexParser::LazyModifierContext::getRuleIndex() const {
  return regexParser::RuleLazyModifier;
}

void regexParser::LazyModifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLazyModifier(this);
}

void regexParser::LazyModifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLazyModifier(this);
}

regexParser::LazyModifierContext* regexParser::lazyModifier() {
  LazyModifierContext *_localctx = _tracker.createInstance<LazyModifierContext>(_ctx, getState());
  enterRule(_localctx, 24, regexParser::RuleLazyModifier);

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(91);
    match(regexParser::ZeroOrOneQuantifier);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- QuantifierTypeContext ------------------------------------------------------------------

regexParser::QuantifierTypeContext::QuantifierTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* regexParser::QuantifierTypeContext::ZeroOrMoreQuantifier() {
  return getToken(regexParser::ZeroOrMoreQuantifier, 0);
}

tree::TerminalNode* regexParser::QuantifierTypeContext::OneOrMoreQuantifier() {
  return getToken(regexParser::OneOrMoreQuantifier, 0);
}

tree::TerminalNode* regexParser::QuantifierTypeContext::ZeroOrOneQuantifier() {
  return getToken(regexParser::ZeroOrOneQuantifier, 0);
}


size_t regexParser::QuantifierTypeContext::getRuleIndex() const {
  return regexParser::RuleQuantifierType;
}

void regexParser::QuantifierTypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterQuantifierType(this);
}

void regexParser::QuantifierTypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitQuantifierType(this);
}

regexParser::QuantifierTypeContext* regexParser::quantifierType() {
  QuantifierTypeContext *_localctx = _tracker.createInstance<QuantifierTypeContext>(_ctx, getState());
  enterRule(_localctx, 26, regexParser::RuleQuantifierType);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(93);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 1835008) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CharContext ------------------------------------------------------------------

regexParser::CharContext::CharContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* regexParser::CharContext::EscapedChar() {
  return getToken(regexParser::EscapedChar, 0);
}

tree::TerminalNode* regexParser::CharContext::Digit() {
  return getToken(regexParser::Digit, 0);
}

tree::TerminalNode* regexParser::CharContext::Char() {
  return getToken(regexParser::Char, 0);
}

tree::TerminalNode* regexParser::CharContext::Hyphen() {
  return getToken(regexParser::Hyphen, 0);
}


size_t regexParser::CharContext::getRuleIndex() const {
  return regexParser::RuleChar;
}

void regexParser::CharContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterChar(this);
}

void regexParser::CharContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitChar(this);
}

regexParser::CharContext* regexParser::char_() {
  CharContext *_localctx = _tracker.createInstance<CharContext>(_ctx, getState());
  enterRule(_localctx, 28, regexParser::RuleChar);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(95);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 117442560) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- CharInGroupContext ------------------------------------------------------------------

regexParser::CharInGroupContext::CharInGroupContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* regexParser::CharInGroupContext::EscapedChar() {
  return getToken(regexParser::EscapedChar, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::Digit() {
  return getToken(regexParser::Digit, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::Char() {
  return getToken(regexParser::Char, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::AnyCharacter() {
  return getToken(regexParser::AnyCharacter, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::Hat() {
  return getToken(regexParser::Hat, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::AnchorEndOfString() {
  return getToken(regexParser::AnchorEndOfString, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::ZeroOrMoreQuantifier() {
  return getToken(regexParser::ZeroOrMoreQuantifier, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::OneOrMoreQuantifier() {
  return getToken(regexParser::OneOrMoreQuantifier, 0);
}

tree::TerminalNode* regexParser::CharInGroupContext::ZeroOrOneQuantifier() {
  return getToken(regexParser::ZeroOrOneQuantifier, 0);
}


size_t regexParser::CharInGroupContext::getRuleIndex() const {
  return regexParser::RuleCharInGroup;
}

void regexParser::CharInGroupContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCharInGroup(this);
}

void regexParser::CharInGroupContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<regexListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCharInGroup(this);
}

regexParser::CharInGroupContext* regexParser::charInGroup() {
  CharInGroupContext *_localctx = _tracker.createInstance<CharInGroupContext>(_ctx, getState());
  enterRule(_localctx, 30, regexParser::RuleCharInGroup);
  size_t _la = 0;

#if __cplusplus > 201703L
  auto onExit = finally([=, this] {
#else
  auto onExit = finally([=] {
#endif
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(97);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & 127665886) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

void regexParser::initialize() {
  ::antlr4::internal::call_once(regexParserOnceFlag, regexParserInitialize);
}

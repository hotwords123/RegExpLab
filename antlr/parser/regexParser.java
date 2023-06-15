// Generated from regex.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class regexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AnyCharacter=11, CharacterClassAnyWord=12, CharacterClassAnyWordInverted=13, 
		CharacterClassAnyDecimalDigit=14, CharacterClassAnyDecimalDigitInverted=15, 
		CharacterClassAnyBlank=16, CharacterClassAnyBlankInverted=17, ZeroOrMoreQuantifier=18, 
		OneOrMoreQuantifier=19, ZeroOrOneQuantifier=20, AnchorStartOfString=21, 
		AnchorWordBoundary=22, AnchorNonWordBoundary=23, AnchorEndOfString=24, 
		EscapedChar=25, Digit=26, Char=27;
	public static final int
		RULE_regex = 0, RULE_expression = 1, RULE_expressionItem = 2, RULE_normalItem = 3, 
		RULE_group = 4, RULE_groupNonCapturingModifier = 5, RULE_single = 6, RULE_characterGroup = 7, 
		RULE_characterGroupNegativeModifier = 8, RULE_characterGroupItem = 9, 
		RULE_characterRange = 10, RULE_characterClass = 11, RULE_quantifier = 12, 
		RULE_lazyModifier = 13, RULE_quantifierType = 14, RULE_rangeQuantifier = 15, 
		RULE_rangeDelimiter = 16, RULE_rangeQuantifierLowerBound = 17, RULE_rangeQuantifierUpperBound = 18, 
		RULE_integer = 19, RULE_anchor = 20, RULE_char = 21, RULE_charInGroup = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"regex", "expression", "expressionItem", "normalItem", "group", "groupNonCapturingModifier", 
			"single", "characterGroup", "characterGroupNegativeModifier", "characterGroupItem", 
			"characterRange", "characterClass", "quantifier", "lazyModifier", "quantifierType", 
			"rangeQuantifier", "rangeDelimiter", "rangeQuantifierLowerBound", "rangeQuantifierUpperBound", 
			"integer", "anchor", "char", "charInGroup"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'('", "')'", "':'", "'['", "']'", "'-'", "'{'", "'}'", 
			"','", "'.'", "'\\w'", "'\\W'", "'\\d'", "'\\D'", "'\\s'", "'\\S'", "'*'", 
			"'+'", "'?'", "'^'", "'\\b'", "'\\B'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AnyCharacter", 
			"CharacterClassAnyWord", "CharacterClassAnyWordInverted", "CharacterClassAnyDecimalDigit", 
			"CharacterClassAnyDecimalDigitInverted", "CharacterClassAnyBlank", "CharacterClassAnyBlankInverted", 
			"ZeroOrMoreQuantifier", "OneOrMoreQuantifier", "ZeroOrOneQuantifier", 
			"AnchorStartOfString", "AnchorWordBoundary", "AnchorNonWordBoundary", 
			"AnchorEndOfString", "EscapedChar", "Digit", "Char"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "regex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public regexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegexContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitRegex(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			expression();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(47);
				match(T__0);
				setState(48);
				expression();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionItemContext> expressionItem() {
			return getRuleContexts(ExpressionItemContext.class);
		}
		public ExpressionItemContext expressionItem(int i) {
			return getRuleContext(ExpressionItemContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				expressionItem();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 266599604L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionItemContext extends ParserRuleContext {
		public NormalItemContext normalItem() {
			return getRuleContext(NormalItemContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public AnchorContext anchor() {
			return getRuleContext(AnchorContext.class,0);
		}
		public ExpressionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterExpressionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitExpressionItem(this);
		}
	}

	public final ExpressionItemContext expressionItem() throws RecognitionException {
		ExpressionItemContext _localctx = new ExpressionItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionItem);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__6:
			case T__9:
			case AnyCharacter:
			case CharacterClassAnyWord:
			case CharacterClassAnyWordInverted:
			case CharacterClassAnyDecimalDigit:
			case CharacterClassAnyDecimalDigitInverted:
			case CharacterClassAnyBlank:
			case CharacterClassAnyBlankInverted:
			case EscapedChar:
			case Digit:
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				normalItem();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835264L) != 0)) {
					{
					setState(60);
					quantifier();
					}
				}

				}
				break;
			case AnchorStartOfString:
			case AnchorWordBoundary:
			case AnchorNonWordBoundary:
			case AnchorEndOfString:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				anchor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalItemContext extends ParserRuleContext {
		public SingleContext single() {
			return getRuleContext(SingleContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public NormalItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterNormalItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitNormalItem(this);
		}
	}

	public final NormalItemContext normalItem() throws RecognitionException {
		NormalItemContext _localctx = new NormalItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_normalItem);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__6:
			case T__9:
			case AnyCharacter:
			case CharacterClassAnyWord:
			case CharacterClassAnyWordInverted:
			case CharacterClassAnyDecimalDigit:
			case CharacterClassAnyDecimalDigitInverted:
			case CharacterClassAnyBlank:
			case CharacterClassAnyBlankInverted:
			case EscapedChar:
			case Digit:
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				single();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				group();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ParserRuleContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public GroupNonCapturingModifierContext groupNonCapturingModifier() {
			return getRuleContext(GroupNonCapturingModifierContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__1);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZeroOrOneQuantifier) {
				{
				setState(71);
				groupNonCapturingModifier();
				}
			}

			setState(74);
			regex();
			setState(75);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupNonCapturingModifierContext extends ParserRuleContext {
		public TerminalNode ZeroOrOneQuantifier() { return getToken(regexParser.ZeroOrOneQuantifier, 0); }
		public GroupNonCapturingModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupNonCapturingModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterGroupNonCapturingModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitGroupNonCapturingModifier(this);
		}
	}

	public final GroupNonCapturingModifierContext groupNonCapturingModifier() throws RecognitionException {
		GroupNonCapturingModifierContext _localctx = new GroupNonCapturingModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_groupNonCapturingModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ZeroOrOneQuantifier);
			setState(78);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleContext extends ParserRuleContext {
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public TerminalNode AnyCharacter() { return getToken(regexParser.AnyCharacter, 0); }
		public CharacterGroupContext characterGroup() {
			return getRuleContext(CharacterGroupContext.class,0);
		}
		public SingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitSingle(this);
		}
	}

	public final SingleContext single() throws RecognitionException {
		SingleContext _localctx = new SingleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_single);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__9:
			case EscapedChar:
			case Digit:
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				char_();
				}
				break;
			case CharacterClassAnyWord:
			case CharacterClassAnyWordInverted:
			case CharacterClassAnyDecimalDigit:
			case CharacterClassAnyDecimalDigitInverted:
			case CharacterClassAnyBlank:
			case CharacterClassAnyBlankInverted:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				characterClass();
				}
				break;
			case AnyCharacter:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(AnyCharacter);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				characterGroup();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterGroupContext extends ParserRuleContext {
		public CharacterGroupNegativeModifierContext characterGroupNegativeModifier() {
			return getRuleContext(CharacterGroupNegativeModifierContext.class,0);
		}
		public List<CharacterGroupItemContext> characterGroupItem() {
			return getRuleContexts(CharacterGroupItemContext.class);
		}
		public CharacterGroupItemContext characterGroupItem(int i) {
			return getRuleContext(CharacterGroupItemContext.class,i);
		}
		public CharacterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCharacterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCharacterGroup(this);
		}
	}

	public final CharacterGroupContext characterGroup() throws RecognitionException {
		CharacterGroupContext _localctx = new CharacterGroupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_characterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__4);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(87);
				characterGroupNegativeModifier();
				}
				break;
			}
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				characterGroupItem();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 255852350L) != 0) );
			setState(95);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterGroupNegativeModifierContext extends ParserRuleContext {
		public TerminalNode AnchorStartOfString() { return getToken(regexParser.AnchorStartOfString, 0); }
		public CharacterGroupNegativeModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterGroupNegativeModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCharacterGroupNegativeModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCharacterGroupNegativeModifier(this);
		}
	}

	public final CharacterGroupNegativeModifierContext characterGroupNegativeModifier() throws RecognitionException {
		CharacterGroupNegativeModifierContext _localctx = new CharacterGroupNegativeModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_characterGroupNegativeModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(AnchorStartOfString);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterGroupItemContext extends ParserRuleContext {
		public CharInGroupContext charInGroup() {
			return getRuleContext(CharInGroupContext.class,0);
		}
		public CharacterClassContext characterClass() {
			return getRuleContext(CharacterClassContext.class,0);
		}
		public CharacterRangeContext characterRange() {
			return getRuleContext(CharacterRangeContext.class,0);
		}
		public CharacterGroupItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterGroupItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCharacterGroupItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCharacterGroupItem(this);
		}
	}

	public final CharacterGroupItemContext characterGroupItem() throws RecognitionException {
		CharacterGroupItemContext _localctx = new CharacterGroupItemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_characterGroupItem);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				charInGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				characterClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				characterRange();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterRangeContext extends ParserRuleContext {
		public List<CharInGroupContext> charInGroup() {
			return getRuleContexts(CharInGroupContext.class);
		}
		public CharInGroupContext charInGroup(int i) {
			return getRuleContext(CharInGroupContext.class,i);
		}
		public CharacterRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCharacterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCharacterRange(this);
		}
	}

	public final CharacterRangeContext characterRange() throws RecognitionException {
		CharacterRangeContext _localctx = new CharacterRangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_characterRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			charInGroup();
			setState(105);
			match(T__6);
			setState(106);
			charInGroup();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterClassContext extends ParserRuleContext {
		public TerminalNode CharacterClassAnyWord() { return getToken(regexParser.CharacterClassAnyWord, 0); }
		public TerminalNode CharacterClassAnyWordInverted() { return getToken(regexParser.CharacterClassAnyWordInverted, 0); }
		public TerminalNode CharacterClassAnyDecimalDigit() { return getToken(regexParser.CharacterClassAnyDecimalDigit, 0); }
		public TerminalNode CharacterClassAnyDecimalDigitInverted() { return getToken(regexParser.CharacterClassAnyDecimalDigitInverted, 0); }
		public TerminalNode CharacterClassAnyBlank() { return getToken(regexParser.CharacterClassAnyBlank, 0); }
		public TerminalNode CharacterClassAnyBlankInverted() { return getToken(regexParser.CharacterClassAnyBlankInverted, 0); }
		public CharacterClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCharacterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCharacterClass(this);
		}
	}

	public final CharacterClassContext characterClass() throws RecognitionException {
		CharacterClassContext _localctx = new CharacterClassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_characterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierContext extends ParserRuleContext {
		public QuantifierTypeContext quantifierType() {
			return getRuleContext(QuantifierTypeContext.class,0);
		}
		public LazyModifierContext lazyModifier() {
			return getRuleContext(LazyModifierContext.class,0);
		}
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitQuantifier(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			quantifierType();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZeroOrOneQuantifier) {
				{
				setState(111);
				lazyModifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LazyModifierContext extends ParserRuleContext {
		public TerminalNode ZeroOrOneQuantifier() { return getToken(regexParser.ZeroOrOneQuantifier, 0); }
		public LazyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterLazyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitLazyModifier(this);
		}
	}

	public final LazyModifierContext lazyModifier() throws RecognitionException {
		LazyModifierContext _localctx = new LazyModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lazyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ZeroOrOneQuantifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierTypeContext extends ParserRuleContext {
		public TerminalNode ZeroOrMoreQuantifier() { return getToken(regexParser.ZeroOrMoreQuantifier, 0); }
		public TerminalNode OneOrMoreQuantifier() { return getToken(regexParser.OneOrMoreQuantifier, 0); }
		public TerminalNode ZeroOrOneQuantifier() { return getToken(regexParser.ZeroOrOneQuantifier, 0); }
		public RangeQuantifierContext rangeQuantifier() {
			return getRuleContext(RangeQuantifierContext.class,0);
		}
		public QuantifierTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifierType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterQuantifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitQuantifierType(this);
		}
	}

	public final QuantifierTypeContext quantifierType() throws RecognitionException {
		QuantifierTypeContext _localctx = new QuantifierTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_quantifierType);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZeroOrMoreQuantifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(ZeroOrMoreQuantifier);
				}
				break;
			case OneOrMoreQuantifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(OneOrMoreQuantifier);
				}
				break;
			case ZeroOrOneQuantifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(ZeroOrOneQuantifier);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				rangeQuantifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeQuantifierContext extends ParserRuleContext {
		public RangeQuantifierLowerBoundContext rangeQuantifierLowerBound() {
			return getRuleContext(RangeQuantifierLowerBoundContext.class,0);
		}
		public RangeDelimiterContext rangeDelimiter() {
			return getRuleContext(RangeDelimiterContext.class,0);
		}
		public RangeQuantifierUpperBoundContext rangeQuantifierUpperBound() {
			return getRuleContext(RangeQuantifierUpperBoundContext.class,0);
		}
		public RangeQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterRangeQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitRangeQuantifier(this);
		}
	}

	public final RangeQuantifierContext rangeQuantifier() throws RecognitionException {
		RangeQuantifierContext _localctx = new RangeQuantifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rangeQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__7);
			setState(123);
			rangeQuantifierLowerBound();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(124);
				rangeDelimiter();
				}
			}

			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Digit) {
				{
				setState(127);
				rangeQuantifierUpperBound();
				}
			}

			setState(130);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeDelimiterContext extends ParserRuleContext {
		public RangeDelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeDelimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterRangeDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitRangeDelimiter(this);
		}
	}

	public final RangeDelimiterContext rangeDelimiter() throws RecognitionException {
		RangeDelimiterContext _localctx = new RangeDelimiterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rangeDelimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeQuantifierLowerBoundContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RangeQuantifierLowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeQuantifierLowerBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterRangeQuantifierLowerBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitRangeQuantifierLowerBound(this);
		}
	}

	public final RangeQuantifierLowerBoundContext rangeQuantifierLowerBound() throws RecognitionException {
		RangeQuantifierLowerBoundContext _localctx = new RangeQuantifierLowerBoundContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rangeQuantifierLowerBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeQuantifierUpperBoundContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RangeQuantifierUpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeQuantifierUpperBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterRangeQuantifierUpperBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitRangeQuantifierUpperBound(this);
		}
	}

	public final RangeQuantifierUpperBoundContext rangeQuantifierUpperBound() throws RecognitionException {
		RangeQuantifierUpperBoundContext _localctx = new RangeQuantifierUpperBoundContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rangeQuantifierUpperBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(regexParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(regexParser.Digit, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(138);
					match(Digit);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnchorContext extends ParserRuleContext {
		public TerminalNode AnchorStartOfString() { return getToken(regexParser.AnchorStartOfString, 0); }
		public TerminalNode AnchorEndOfString() { return getToken(regexParser.AnchorEndOfString, 0); }
		public TerminalNode AnchorWordBoundary() { return getToken(regexParser.AnchorWordBoundary, 0); }
		public TerminalNode AnchorNonWordBoundary() { return getToken(regexParser.AnchorNonWordBoundary, 0); }
		public AnchorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anchor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitAnchor(this);
		}
	}

	public final AnchorContext anchor() throws RecognitionException {
		AnchorContext _localctx = new AnchorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_anchor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends ParserRuleContext {
		public TerminalNode EscapedChar() { return getToken(regexParser.EscapedChar, 0); }
		public TerminalNode Digit() { return getToken(regexParser.Digit, 0); }
		public TerminalNode Char() { return getToken(regexParser.Char, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitChar(this);
		}
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234882192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharInGroupContext extends ParserRuleContext {
		public TerminalNode EscapedChar() { return getToken(regexParser.EscapedChar, 0); }
		public TerminalNode Digit() { return getToken(regexParser.Digit, 0); }
		public TerminalNode Char() { return getToken(regexParser.Char, 0); }
		public TerminalNode AnyCharacter() { return getToken(regexParser.AnyCharacter, 0); }
		public TerminalNode AnchorStartOfString() { return getToken(regexParser.AnchorStartOfString, 0); }
		public TerminalNode AnchorEndOfString() { return getToken(regexParser.AnchorEndOfString, 0); }
		public TerminalNode ZeroOrMoreQuantifier() { return getToken(regexParser.ZeroOrMoreQuantifier, 0); }
		public TerminalNode OneOrMoreQuantifier() { return getToken(regexParser.OneOrMoreQuantifier, 0); }
		public TerminalNode ZeroOrOneQuantifier() { return getToken(regexParser.ZeroOrOneQuantifier, 0); }
		public CharInGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charInGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).enterCharInGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexListener ) ((regexListener)listener).exitCharInGroup(this);
		}
	}

	public final CharInGroupContext charInGroup() throws RecognitionException {
		CharInGroupContext _localctx = new CharInGroupContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_charInGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 255594302L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u0096\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u00002\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0001\u0004\u00018\b\u0001"+
		"\u000b\u0001\f\u00019\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001"+
		"\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004I\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006U\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007Y\b\u0007\u0001\u0007\u0004\u0007\\\b\u0007\u000b\u0007\f"+
		"\u0007]\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\tg\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0003\fq\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000ey\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f~\b\u000f\u0001\u000f\u0003\u000f\u0081\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u008c\b\u0013\u000b\u0013"+
		"\f\u0013\u008d\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0004\u0001\u0000\f\u0011\u0001\u0000\u0015\u0018\u0004\u0000\u0004\u0004"+
		"\u0007\u0007\n\n\u0019\u001b\u0004\u0000\u0001\u0005\b\u000b\u0012\u0015"+
		"\u0018\u001b\u0092\u0000.\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000"+
		"\u0000\u0004@\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\b"+
		"F\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fT\u0001\u0000\u0000"+
		"\u0000\u000eV\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012"+
		"f\u0001\u0000\u0000\u0000\u0014h\u0001\u0000\u0000\u0000\u0016l\u0001"+
		"\u0000\u0000\u0000\u0018n\u0001\u0000\u0000\u0000\u001ar\u0001\u0000\u0000"+
		"\u0000\u001cx\u0001\u0000\u0000\u0000\u001ez\u0001\u0000\u0000\u0000 "+
		"\u0084\u0001\u0000\u0000\u0000\"\u0086\u0001\u0000\u0000\u0000$\u0088"+
		"\u0001\u0000\u0000\u0000&\u008b\u0001\u0000\u0000\u0000(\u008f\u0001\u0000"+
		"\u0000\u0000*\u0091\u0001\u0000\u0000\u0000,\u0093\u0001\u0000\u0000\u0000"+
		".3\u0003\u0002\u0001\u0000/0\u0005\u0001\u0000\u000002\u0003\u0002\u0001"+
		"\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u00004\u0001\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000068\u0003\u0004\u0002\u000076\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:\u0003\u0001\u0000\u0000\u0000;=\u0003\u0006\u0003\u0000"+
		"<>\u0003\u0018\f\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?A\u0003(\u0014\u0000@;\u0001\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BE\u0003\f\u0006"+
		"\u0000CE\u0003\b\u0004\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000E\u0007\u0001\u0000\u0000\u0000FH\u0005\u0002\u0000\u0000GI\u0003"+
		"\n\u0005\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0003\u0000\u0000\u0000KL\u0005\u0003\u0000\u0000"+
		"L\t\u0001\u0000\u0000\u0000MN\u0005\u0014\u0000\u0000NO\u0005\u0004\u0000"+
		"\u0000O\u000b\u0001\u0000\u0000\u0000PU\u0003*\u0015\u0000QU\u0003\u0016"+
		"\u000b\u0000RU\u0005\u000b\u0000\u0000SU\u0003\u000e\u0007\u0000TP\u0001"+
		"\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000VX\u0005\u0005\u0000"+
		"\u0000WY\u0003\u0010\b\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y[\u0001\u0000\u0000\u0000Z\\\u0003\u0012\t\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000"+
		"`\u000f\u0001\u0000\u0000\u0000ab\u0005\u0015\u0000\u0000b\u0011\u0001"+
		"\u0000\u0000\u0000cg\u0003,\u0016\u0000dg\u0003\u0016\u000b\u0000eg\u0003"+
		"\u0014\n\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000g\u0013\u0001\u0000\u0000\u0000hi\u0003,\u0016\u0000"+
		"ij\u0005\u0007\u0000\u0000jk\u0003,\u0016\u0000k\u0015\u0001\u0000\u0000"+
		"\u0000lm\u0007\u0000\u0000\u0000m\u0017\u0001\u0000\u0000\u0000np\u0003"+
		"\u001c\u000e\u0000oq\u0003\u001a\r\u0000po\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u0019\u0001\u0000\u0000\u0000rs\u0005\u0014\u0000"+
		"\u0000s\u001b\u0001\u0000\u0000\u0000ty\u0005\u0012\u0000\u0000uy\u0005"+
		"\u0013\u0000\u0000vy\u0005\u0014\u0000\u0000wy\u0003\u001e\u000f\u0000"+
		"xt\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000y\u001d\u0001\u0000\u0000\u0000z{\u0005"+
		"\b\u0000\u0000{}\u0003\"\u0011\u0000|~\u0003 \u0010\u0000}|\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0003$\u0012\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\t\u0000\u0000\u0083\u001f\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\n\u0000\u0000\u0085!\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"&\u0013\u0000\u0087#\u0001\u0000\u0000\u0000\u0088\u0089\u0003&\u0013"+
		"\u0000\u0089%\u0001\u0000\u0000\u0000\u008a\u008c\u0005\u001a\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\'\u0001\u0000\u0000\u0000\u008f\u0090\u0007\u0001\u0000\u0000\u0090"+
		")\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0002\u0000\u0000\u0092+\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0007\u0003\u0000\u0000\u0094-\u0001\u0000"+
		"\u0000\u0000\u000f39=@DHTX]fpx}\u0080\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
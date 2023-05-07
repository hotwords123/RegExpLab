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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, GroupNonCapturingModifier=8, 
		AnyCharacter=9, Hat=10, Hyphen=11, CharacterClassAnyWord=12, CharacterClassAnyWordInverted=13, 
		CharacterClassAnyDecimalDigit=14, CharacterClassAnyDecimalDigitInverted=15, 
		CharacterClassAnyBlank=16, CharacterClassAnyBlankInverted=17, ZeroOrMoreQuantifier=18, 
		OneOrMoreQuantifier=19, ZeroOrOneQuantifier=20, AnchorWordBoundary=21, 
		AnchorNonWordBoundary=22, AnchorEndOfString=23, EscapedChar=24, Digit=25, 
		Char=26;
	public static final int
		RULE_regex = 0, RULE_expression = 1, RULE_expressionItem = 2, RULE_normalItem = 3, 
		RULE_group = 4, RULE_single = 5, RULE_characterGroup = 6, RULE_characterGroupNegativeModifier = 7, 
		RULE_characterGroupItem = 8, RULE_characterRange = 9, RULE_characterClass = 10, 
		RULE_quantifier = 11, RULE_lazyModifier = 12, RULE_quantifierType = 13, 
		RULE_char = 14, RULE_charInGroup = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"regex", "expression", "expressionItem", "normalItem", "group", "single", 
			"characterGroup", "characterGroupNegativeModifier", "characterGroupItem", 
			"characterRange", "characterClass", "quantifier", "lazyModifier", "quantifierType", 
			"char", "charInGroup"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'?:'", "'.'", 
			"'^'", "'-'", "'\\w'", "'\\W'", "'\\d'", "'\\D'", "'\\s'", "'\\S'", "'*'", 
			"'+'", "'?'", "'\\b'", "'\\B'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "GroupNonCapturingModifier", 
			"AnyCharacter", "Hat", "Hyphen", "CharacterClassAnyWord", "CharacterClassAnyWordInverted", 
			"CharacterClassAnyDecimalDigit", "CharacterClassAnyDecimalDigitInverted", 
			"CharacterClassAnyBlank", "CharacterClassAnyBlankInverted", "ZeroOrMoreQuantifier", 
			"OneOrMoreQuantifier", "ZeroOrOneQuantifier", "AnchorWordBoundary", "AnchorNonWordBoundary", 
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
			setState(32);
			expression();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(33);
				match(T__0);
				setState(34);
				expression();
				}
				}
				setState(39);
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				expressionItem();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 117701140L) != 0) );
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
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			normalItem();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) {
				{
				setState(46);
				quantifier();
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
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case AnyCharacter:
			case Hyphen:
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
				setState(49);
				single();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__1);
			setState(54);
			regex();
			setState(55);
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
		enterRule(_localctx, 10, RULE_single);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Hyphen:
			case EscapedChar:
			case Digit:
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
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
				setState(58);
				characterClass();
				}
				break;
			case AnyCharacter:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(AnyCharacter);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
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
		enterRule(_localctx, 12, RULE_characterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(64);
				characterGroupNegativeModifier();
				}
				break;
			}
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				characterGroupItem();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 127923934L) != 0) );
			setState(72);
			match(T__4);
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
		public TerminalNode Hat() { return getToken(regexParser.Hat, 0); }
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
		enterRule(_localctx, 14, RULE_characterGroupNegativeModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(Hat);
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
		enterRule(_localctx, 16, RULE_characterGroupItem);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				charInGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				characterClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
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
		public TerminalNode Hyphen() { return getToken(regexParser.Hyphen, 0); }
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
		enterRule(_localctx, 18, RULE_characterRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			charInGroup();
			setState(82);
			match(Hyphen);
			setState(83);
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
		enterRule(_localctx, 20, RULE_characterClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 22, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			quantifierType();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZeroOrOneQuantifier) {
				{
				setState(88);
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
		enterRule(_localctx, 24, RULE_lazyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 26, RULE_quantifierType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
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
		public TerminalNode Hyphen() { return getToken(regexParser.Hyphen, 0); }
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
		enterRule(_localctx, 28, RULE_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117442560L) != 0)) ) {
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
		public TerminalNode Hat() { return getToken(regexParser.Hat, 0); }
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
		enterRule(_localctx, 30, RULE_charInGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 127665886L) != 0)) ) {
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
		"\u0004\u0001\u001ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0001\u0004\u0001*\b\u0001\u000b\u0001\f\u0001+\u0001"+
		"\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u00034\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005>\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006B\b\u0006\u0001\u0006\u0004\u0006E\b\u0006"+
		"\u000b\u0006\f\u0006F\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\bP\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000bZ\b\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0004\u0001\u0000\f\u0011"+
		"\u0001\u0000\u0012\u0014\u0002\u0000\u000b\u000b\u0018\u001a\u0005\u0000"+
		"\u0001\u0004\u0006\u0007\t\n\u0012\u0014\u0017\u001a_\u0000 \u0001\u0000"+
		"\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000"+
		"\u00063\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n=\u0001\u0000"+
		"\u0000\u0000\f?\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000"+
		"\u0010O\u0001\u0000\u0000\u0000\u0012Q\u0001\u0000\u0000\u0000\u0014U"+
		"\u0001\u0000\u0000\u0000\u0016W\u0001\u0000\u0000\u0000\u0018[\u0001\u0000"+
		"\u0000\u0000\u001a]\u0001\u0000\u0000\u0000\u001c_\u0001\u0000\u0000\u0000"+
		"\u001ea\u0001\u0000\u0000\u0000 %\u0003\u0002\u0001\u0000!\"\u0005\u0001"+
		"\u0000\u0000\"$\u0003\u0002\u0001\u0000#!\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\u0001\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(*\u0003\u0004"+
		"\u0002\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000"+
		"\u0000-/\u0003\u0006\u0003\u0000.0\u0003\u0016\u000b\u0000/.\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"14\u0003\n\u0005\u000024\u0003\b\u0004\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005\u0002"+
		"\u0000\u000067\u0003\u0000\u0000\u000078\u0005\u0003\u0000\u00008\t\u0001"+
		"\u0000\u0000\u00009>\u0003\u001c\u000e\u0000:>\u0003\u0014\n\u0000;>\u0005"+
		"\t\u0000\u0000<>\u0003\f\u0006\u0000=9\u0001\u0000\u0000\u0000=:\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000"+
		">\u000b\u0001\u0000\u0000\u0000?A\u0005\u0004\u0000\u0000@B\u0003\u000e"+
		"\u0007\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001"+
		"\u0000\u0000\u0000CE\u0003\u0010\b\u0000DC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000I\r\u0001\u0000\u0000"+
		"\u0000JK\u0005\n\u0000\u0000K\u000f\u0001\u0000\u0000\u0000LP\u0003\u001e"+
		"\u000f\u0000MP\u0003\u0014\n\u0000NP\u0003\u0012\t\u0000OL\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\u0011"+
		"\u0001\u0000\u0000\u0000QR\u0003\u001e\u000f\u0000RS\u0005\u000b\u0000"+
		"\u0000ST\u0003\u001e\u000f\u0000T\u0013\u0001\u0000\u0000\u0000UV\u0007"+
		"\u0000\u0000\u0000V\u0015\u0001\u0000\u0000\u0000WY\u0003\u001a\r\u0000"+
		"XZ\u0003\u0018\f\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u0017\u0001\u0000\u0000\u0000[\\\u0005\u0014\u0000\u0000\\\u0019\u0001"+
		"\u0000\u0000\u0000]^\u0007\u0001\u0000\u0000^\u001b\u0001\u0000\u0000"+
		"\u0000_`\u0007\u0002\u0000\u0000`\u001d\u0001\u0000\u0000\u0000ab\u0007"+
		"\u0003\u0000\u0000b\u001f\u0001\u0000\u0000\u0000\t%+/3=AFOY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
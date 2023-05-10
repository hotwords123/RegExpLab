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
		AnyCharacter=10, CharacterClassAnyWord=11, CharacterClassAnyWordInverted=12, 
		CharacterClassAnyDecimalDigit=13, CharacterClassAnyDecimalDigitInverted=14, 
		CharacterClassAnyBlank=15, CharacterClassAnyBlankInverted=16, ZeroOrMoreQuantifier=17, 
		OneOrMoreQuantifier=18, ZeroOrOneQuantifier=19, AnchorStartOfString=20, 
		AnchorWordBoundary=21, AnchorNonWordBoundary=22, AnchorEndOfString=23, 
		EscapedChar=24, Digit=25, Char=26;
	public static final int
		RULE_regex = 0, RULE_expression = 1, RULE_expressionItem = 2, RULE_normalItem = 3, 
		RULE_group = 4, RULE_groupNonCapturingModifier = 5, RULE_single = 6, RULE_characterGroup = 7, 
		RULE_characterGroupNegativeModifier = 8, RULE_characterGroupItem = 9, 
		RULE_characterRange = 10, RULE_characterClass = 11, RULE_quantifier = 12, 
		RULE_lazyModifier = 13, RULE_quantifierType = 14, RULE_char = 15, RULE_charInGroup = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"regex", "expression", "expressionItem", "normalItem", "group", "groupNonCapturingModifier", 
			"single", "characterGroup", "characterGroupNegativeModifier", "characterGroupItem", 
			"characterRange", "characterClass", "quantifier", "lazyModifier", "quantifierType", 
			"char", "charInGroup"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'('", "')'", "':'", "'['", "']'", "'-'", "'{'", "'}'", 
			"'.'", "'\\w'", "'\\W'", "'\\d'", "'\\D'", "'\\s'", "'\\S'", "'*'", "'+'", 
			"'?'", "'^'", "'\\b'", "'\\B'", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "AnyCharacter", 
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
			setState(34);
			expression();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(35);
				match(T__0);
				setState(36);
				expression();
				}
				}
				setState(41);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				expressionItem();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 117570740L) != 0) );
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
			setState(47);
			normalItem();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				setState(48);
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__6:
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
				setState(51);
				single();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
			setState(55);
			match(T__1);
			setState(56);
			regex();
			setState(57);
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
			setState(59);
			match(ZeroOrOneQuantifier);
			setState(60);
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case EscapedChar:
			case Digit:
			case Char:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
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
				setState(63);
				characterClass();
				}
				break;
			case AnyCharacter:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(AnyCharacter);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
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
			setState(68);
			match(T__4);
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(69);
				characterGroupNegativeModifier();
				}
				break;
			}
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				characterGroupItem();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 127926078L) != 0) );
			setState(77);
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
			setState(79);
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				charInGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				characterClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
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
			setState(86);
			charInGroup();
			setState(87);
			match(T__6);
			setState(88);
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
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
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
			setState(92);
			quantifierType();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZeroOrOneQuantifier) {
				{
				setState(93);
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
			setState(96);
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
		enterRule(_localctx, 28, RULE_quantifierType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440656L) != 0)) ) {
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
		enterRule(_localctx, 32, RULE_charInGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 127797054L) != 0)) ) {
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
		"\u0004\u0001\u001ai\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0001\u0004\u0001,\b\u0001\u000b"+
		"\u0001\f\u0001-\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u00036\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006C\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007G\b\u0007\u0001\u0007\u0004\u0007J\b\u0007\u000b\u0007\f\u0007"+
		"K\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\tU\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\f_\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \u0000\u0004\u0001\u0000\u000b\u0010\u0001\u0000\u0011\u0013"+
		"\u0003\u0000\u0004\u0004\u0007\u0007\u0018\u001a\u0004\u0000\u0001\u0005"+
		"\b\n\u0011\u0014\u0017\u001ac\u0000\"\u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000"+
		"\u0000\b7\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\fB\u0001"+
		"\u0000\u0000\u0000\u000eD\u0001\u0000\u0000\u0000\u0010O\u0001\u0000\u0000"+
		"\u0000\u0012T\u0001\u0000\u0000\u0000\u0014V\u0001\u0000\u0000\u0000\u0016"+
		"Z\u0001\u0000\u0000\u0000\u0018\\\u0001\u0000\u0000\u0000\u001a`\u0001"+
		"\u0000\u0000\u0000\u001cb\u0001\u0000\u0000\u0000\u001ed\u0001\u0000\u0000"+
		"\u0000 f\u0001\u0000\u0000\u0000\"\'\u0003\u0002\u0001\u0000#$\u0005\u0001"+
		"\u0000\u0000$&\u0003\u0002\u0001\u0000%#\u0001\u0000\u0000\u0000&)\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(\u0001\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*,\u0003\u0004"+
		"\u0002\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/1\u0003\u0006\u0003\u000002\u0003\u0018\f\u000010\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u000036\u0003"+
		"\f\u0006\u000046\u0003\b\u0004\u000053\u0001\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u00006\u0007\u0001\u0000\u0000\u000078\u0005\u0002\u0000"+
		"\u000089\u0003\u0000\u0000\u00009:\u0005\u0003\u0000\u0000:\t\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0013\u0000\u0000<=\u0005\u0004\u0000\u0000=\u000b"+
		"\u0001\u0000\u0000\u0000>C\u0003\u001e\u000f\u0000?C\u0003\u0016\u000b"+
		"\u0000@C\u0005\n\u0000\u0000AC\u0003\u000e\u0007\u0000B>\u0001\u0000\u0000"+
		"\u0000B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000C\r\u0001\u0000\u0000\u0000DF\u0005\u0005\u0000\u0000EG\u0003"+
		"\u0010\b\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001"+
		"\u0000\u0000\u0000HJ\u0003\u0012\t\u0000IH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0005\u0006\u0000\u0000N\u000f\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0014\u0000\u0000P\u0011\u0001\u0000\u0000\u0000"+
		"QU\u0003 \u0010\u0000RU\u0003\u0016\u000b\u0000SU\u0003\u0014\n\u0000"+
		"TQ\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000U\u0013\u0001\u0000\u0000\u0000VW\u0003 \u0010\u0000WX\u0005\u0007"+
		"\u0000\u0000XY\u0003 \u0010\u0000Y\u0015\u0001\u0000\u0000\u0000Z[\u0007"+
		"\u0000\u0000\u0000[\u0017\u0001\u0000\u0000\u0000\\^\u0003\u001c\u000e"+
		"\u0000]_\u0003\u001a\r\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_\u0019\u0001\u0000\u0000\u0000`a\u0005\u0013\u0000\u0000a\u001b"+
		"\u0001\u0000\u0000\u0000bc\u0007\u0001\u0000\u0000c\u001d\u0001\u0000"+
		"\u0000\u0000de\u0007\u0002\u0000\u0000e\u001f\u0001\u0000\u0000\u0000"+
		"fg\u0007\u0003\u0000\u0000g!\u0001\u0000\u0000\u0000\t\'-15BFKT^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from regex.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class regexLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "GroupNonCapturingModifier", 
			"AnyCharacter", "Hat", "Hyphen", "CharacterClassAnyWord", "CharacterClassAnyWordInverted", 
			"CharacterClassAnyDecimalDigit", "CharacterClassAnyDecimalDigitInverted", 
			"CharacterClassAnyBlank", "CharacterClassAnyBlankInverted", "ZeroOrMoreQuantifier", 
			"OneOrMoreQuantifier", "ZeroOrOneQuantifier", "AnchorWordBoundary", "AnchorNonWordBoundary", 
			"AnchorEndOfString", "EscapedChar", "Digit", "Char"
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


	public regexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "regex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001as\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000"+
		"\u0001\u0001\u000009r\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u0003"+
		"7\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;\u0001"+
		"\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000b?\u0001\u0000\u0000"+
		"\u0000\rA\u0001\u0000\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011"+
		"F\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015J\u0001"+
		"\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019O\u0001\u0000\u0000"+
		"\u0000\u001bR\u0001\u0000\u0000\u0000\u001dU\u0001\u0000\u0000\u0000\u001f"+
		"X\u0001\u0000\u0000\u0000![\u0001\u0000\u0000\u0000#^\u0001\u0000\u0000"+
		"\u0000%`\u0001\u0000\u0000\u0000\'b\u0001\u0000\u0000\u0000)d\u0001\u0000"+
		"\u0000\u0000+g\u0001\u0000\u0000\u0000-j\u0001\u0000\u0000\u0000/l\u0001"+
		"\u0000\u0000\u00001o\u0001\u0000\u0000\u00003q\u0001\u0000\u0000\u0000"+
		"56\u0005|\u0000\u00006\u0002\u0001\u0000\u0000\u000078\u0005(\u0000\u0000"+
		"8\u0004\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000:\u0006\u0001\u0000"+
		"\u0000\u0000;<\u0005[\u0000\u0000<\b\u0001\u0000\u0000\u0000=>\u0005]"+
		"\u0000\u0000>\n\u0001\u0000\u0000\u0000?@\u0005{\u0000\u0000@\f\u0001"+
		"\u0000\u0000\u0000AB\u0005}\u0000\u0000B\u000e\u0001\u0000\u0000\u0000"+
		"CD\u0005?\u0000\u0000DE\u0005:\u0000\u0000E\u0010\u0001\u0000\u0000\u0000"+
		"FG\u0005.\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005^\u0000\u0000"+
		"I\u0014\u0001\u0000\u0000\u0000JK\u0005-\u0000\u0000K\u0016\u0001\u0000"+
		"\u0000\u0000LM\u0005\\\u0000\u0000MN\u0005w\u0000\u0000N\u0018\u0001\u0000"+
		"\u0000\u0000OP\u0005\\\u0000\u0000PQ\u0005W\u0000\u0000Q\u001a\u0001\u0000"+
		"\u0000\u0000RS\u0005\\\u0000\u0000ST\u0005d\u0000\u0000T\u001c\u0001\u0000"+
		"\u0000\u0000UV\u0005\\\u0000\u0000VW\u0005D\u0000\u0000W\u001e\u0001\u0000"+
		"\u0000\u0000XY\u0005\\\u0000\u0000YZ\u0005s\u0000\u0000Z \u0001\u0000"+
		"\u0000\u0000[\\\u0005\\\u0000\u0000\\]\u0005S\u0000\u0000]\"\u0001\u0000"+
		"\u0000\u0000^_\u0005*\u0000\u0000_$\u0001\u0000\u0000\u0000`a\u0005+\u0000"+
		"\u0000a&\u0001\u0000\u0000\u0000bc\u0005?\u0000\u0000c(\u0001\u0000\u0000"+
		"\u0000de\u0005\\\u0000\u0000ef\u0005b\u0000\u0000f*\u0001\u0000\u0000"+
		"\u0000gh\u0005\\\u0000\u0000hi\u0005B\u0000\u0000i,\u0001\u0000\u0000"+
		"\u0000jk\u0005$\u0000\u0000k.\u0001\u0000\u0000\u0000lm\u0005\\\u0000"+
		"\u0000mn\b\u0000\u0000\u0000n0\u0001\u0000\u0000\u0000op\u0007\u0000\u0000"+
		"\u0000p2\u0001\u0000\u0000\u0000qr\t\u0000\u0000\u0000r4\u0001\u0000\u0000"+
		"\u0000\u0001\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
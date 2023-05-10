grammar regex;

regex : expression ('|' expression)* ;

expression : expressionItem+ ;

expressionItem
    : normalItem quantifier?
//    | anchor // anchor字符，例如^ $ \b等，不匹配实际的字符、而是匹配一种特定的位置 // 本次实验不要求
    ;

normalItem
    : single // 能匹配一个字符的Item，包括普通的单字符、元字符、字符区间等
	| group // 括号分组
//	| backreference // 重复此前已经匹配到的某一分组内容一次 // 本次实验不要求
	;

/* Group */
group :
    '('
//    groupNonCapturingModifier? // 非捕获分组，不占用括号分组捕获的序号 // 本次实验不要求
    regex
    ')'
    ;

groupNonCapturingModifier : '?'':';

/* Single */
single
	: char // 单个字符（普通字符或转义字符）
	| characterClass // \d \w等表示一类字符的元字符
	| AnyCharacter // .，匹配任意字符
	| characterGroup // 中括号字符组，如[012a-z]
	;

AnyCharacter : '.';

/* Character Group & Class */
characterGroup : '[' characterGroupNegativeModifier? characterGroupItem+ ']';

characterGroupNegativeModifier : '^'; // 取反，不匹配后面所列的字符

characterGroupItem
	: charInGroup // 单个字符（普通字符或转义字符），除了-（在group中，-表示字符区间的连字符）
	| characterClass // \d \w等表示一类字符的元字符
	| characterRange // 字符区间，例如a-z
	;

characterRange : charInGroup '-' charInGroup;

characterClass // 以下是本实验要求支持的所有表示一类字符的元字符
	: CharacterClassAnyWord
	| CharacterClassAnyWordInverted
	| CharacterClassAnyDecimalDigit
	| CharacterClassAnyDecimalDigitInverted
	| CharacterClassAnyBlank
	| CharacterClassAnyBlankInverted
	;

CharacterClassAnyWord : '\\w';
CharacterClassAnyWordInverted : '\\W';
CharacterClassAnyDecimalDigit : '\\d';
CharacterClassAnyDecimalDigitInverted : '\\D';
CharacterClassAnyBlank: '\\s';
CharacterClassAnyBlankInverted: '\\S';

/* Quantifiers */
quantifier : quantifierType lazyModifier? ;

lazyModifier: ZeroOrOneQuantifier; // 表示非贪婪匹配的问号

quantifierType
	: ZeroOrMoreQuantifier
	| OneOrMoreQuantifier
	| ZeroOrOneQuantifier
//	| rangeQuantifier // 匹配若干次数范围，如 {2,4} // 本次实验不要求
	;

ZeroOrMoreQuantifier : '*';
OneOrMoreQuantifier : '+';
ZeroOrOneQuantifier : '?';

/* rangeQuantifier 本次实验不要求 */
//rangeQuantifier : '{' rangeQuantifierLowerBound ( ',' rangeQuantifierUpperBound )? '}';
//rangeQuantifierLowerBound : integer;
//rangeQuantifierUpperBound : integer;
//
//integer: Digit+ ;

/* Backreferences 本次实验不要求 */
//backreference : '\\' integer; // 如\2表示，此处应当匹配的内容，与之前已经匹配到的第2个分组内的内容完全相同。
//                              // 若此前未匹配到第2个分组，则直接中止匹配。

/* Anchors 本次实验不要求 */
//anchor // 以下是本实验要求支持的所有anchor字符
//    : AnchorStartOfString
//    | AnchorEndOfString
//	| AnchorWordBoundary
//	| AnchorNonWordBoundary
//	;

AnchorStartOfString: '^';
AnchorWordBoundary : '\\b';
AnchorNonWordBoundary : '\\B';
AnchorEndOfString : '$';

/* 字符列表 */
EscapedChar : '\\' ~[0-9]; // 数字的情况不要做为EscapedChar处理，否则，会造成backreference规则无法被正确解析
Digit : [0-9];
Char: . ;

char // 在普通位置（指不在中括号字符组[]当中）可以出现的一般字符
    : EscapedChar | Digit | Char | ':' // 在任何位置都一定被解析成一般字符的类型
    | '-' // 当-不在[]中时，就算不转义，也可以作为一般的字符处理。
    ;

charInGroup // 在中括号字符组[]当中可以出现的一般字符
    : EscapedChar | Digit | Char | ':' // 在任何位置都一定被解析成一般字符的类型
    | '|' | '(' | ')' | '[' | '{' | '}' | '.' | '^' | '$' | '*' | '+' | '?' // 这些字符如果出现在[]中，就算不转义，也可以作为一般的字符处理。
    ;

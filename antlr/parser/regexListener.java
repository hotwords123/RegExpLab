// Generated from regex.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link regexParser}.
 */
public interface regexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link regexParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(regexParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(regexParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(regexParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(regexParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#expressionItem}.
	 * @param ctx the parse tree
	 */
	void enterExpressionItem(regexParser.ExpressionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#expressionItem}.
	 * @param ctx the parse tree
	 */
	void exitExpressionItem(regexParser.ExpressionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#normalItem}.
	 * @param ctx the parse tree
	 */
	void enterNormalItem(regexParser.NormalItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#normalItem}.
	 * @param ctx the parse tree
	 */
	void exitNormalItem(regexParser.NormalItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(regexParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(regexParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#groupNonCapturingModifier}.
	 * @param ctx the parse tree
	 */
	void enterGroupNonCapturingModifier(regexParser.GroupNonCapturingModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#groupNonCapturingModifier}.
	 * @param ctx the parse tree
	 */
	void exitGroupNonCapturingModifier(regexParser.GroupNonCapturingModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(regexParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(regexParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#characterGroup}.
	 * @param ctx the parse tree
	 */
	void enterCharacterGroup(regexParser.CharacterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#characterGroup}.
	 * @param ctx the parse tree
	 */
	void exitCharacterGroup(regexParser.CharacterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#characterGroupNegativeModifier}.
	 * @param ctx the parse tree
	 */
	void enterCharacterGroupNegativeModifier(regexParser.CharacterGroupNegativeModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#characterGroupNegativeModifier}.
	 * @param ctx the parse tree
	 */
	void exitCharacterGroupNegativeModifier(regexParser.CharacterGroupNegativeModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#characterGroupItem}.
	 * @param ctx the parse tree
	 */
	void enterCharacterGroupItem(regexParser.CharacterGroupItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#characterGroupItem}.
	 * @param ctx the parse tree
	 */
	void exitCharacterGroupItem(regexParser.CharacterGroupItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#characterRange}.
	 * @param ctx the parse tree
	 */
	void enterCharacterRange(regexParser.CharacterRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#characterRange}.
	 * @param ctx the parse tree
	 */
	void exitCharacterRange(regexParser.CharacterRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#characterClass}.
	 * @param ctx the parse tree
	 */
	void enterCharacterClass(regexParser.CharacterClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#characterClass}.
	 * @param ctx the parse tree
	 */
	void exitCharacterClass(regexParser.CharacterClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(regexParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(regexParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#lazyModifier}.
	 * @param ctx the parse tree
	 */
	void enterLazyModifier(regexParser.LazyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#lazyModifier}.
	 * @param ctx the parse tree
	 */
	void exitLazyModifier(regexParser.LazyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#quantifierType}.
	 * @param ctx the parse tree
	 */
	void enterQuantifierType(regexParser.QuantifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#quantifierType}.
	 * @param ctx the parse tree
	 */
	void exitQuantifierType(regexParser.QuantifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#char}.
	 * @param ctx the parse tree
	 */
	void enterChar(regexParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#char}.
	 * @param ctx the parse tree
	 */
	void exitChar(regexParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexParser#charInGroup}.
	 * @param ctx the parse tree
	 */
	void enterCharInGroup(regexParser.CharInGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexParser#charInGroup}.
	 * @param ctx the parse tree
	 */
	void exitCharInGroup(regexParser.CharInGroupContext ctx);
}
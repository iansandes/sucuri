// Generated from .\grammarSucuri.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarSucuriParser}.
 */
public interface grammarSucuriListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(grammarSucuriParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(grammarSucuriParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(grammarSucuriParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(grammarSucuriParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(grammarSucuriParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(grammarSucuriParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#declTip}.
	 * @param ctx the parse tree
	 */
	void enterDeclTip(grammarSucuriParser.DeclTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#declTip}.
	 * @param ctx the parse tree
	 */
	void exitDeclTip(grammarSucuriParser.DeclTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListId(grammarSucuriParser.ListIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListId(grammarSucuriParser.ListIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(grammarSucuriParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(grammarSucuriParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void enterCmdComp(grammarSucuriParser.CmdCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void exitCmdComp(grammarSucuriParser.CmdCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void enterListCmd(grammarSucuriParser.ListCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void exitListCmd(grammarSucuriParser.ListCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(grammarSucuriParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(grammarSucuriParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(grammarSucuriParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(grammarSucuriParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(grammarSucuriParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(grammarSucuriParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(grammarSucuriParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(grammarSucuriParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(grammarSucuriParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(grammarSucuriParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#listW}.
	 * @param ctx the parse tree
	 */
	void enterListW(grammarSucuriParser.ListWContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#listW}.
	 * @param ctx the parse tree
	 */
	void exitListW(grammarSucuriParser.ListWContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#elemW}.
	 * @param ctx the parse tree
	 */
	void enterElemW(grammarSucuriParser.ElemWContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#elemW}.
	 * @param ctx the parse tree
	 */
	void exitElemW(grammarSucuriParser.ElemWContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(grammarSucuriParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(grammarSucuriParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(grammarSucuriParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(grammarSucuriParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#minExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinExpr(grammarSucuriParser.MinExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#minExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinExpr(grammarSucuriParser.MinExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(grammarSucuriParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(grammarSucuriParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarSucuriParser#fat}.
	 * @param ctx the parse tree
	 */
	void enterFat(grammarSucuriParser.FatContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarSucuriParser#fat}.
	 * @param ctx the parse tree
	 */
	void exitFat(grammarSucuriParser.FatContext ctx);
}
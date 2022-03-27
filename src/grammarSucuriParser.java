// Generated from .\grammarSucuri.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarSucuriParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, INTEGER=2, BOOLEAN=3, BEGIN=4, END=5, WHILE=6, DO=7, READ=8, 
		VAR=9, FALSE=10, TRUE=11, WRITE=12, IF=13, THEN=14, ELSE=15, INT=16, SOMA=17, 
		SUB=18, MULTI=19, DIV=20, MAIORQ=21, MENORQ=22, MAIOREQ=23, MENOREQ=24, 
		IGUAL=25, DIFF=26, OR=27, AND=28, NOT=29, PONTOV=30, ABPAR=31, FCPAR=32, 
		ATTR=33, VIRG=34, DBPONTO=35, PONTO=36, COMENT=37, STRING=38, WS=39, ID=40;
	public static final int
		RULE_prog = 0, RULE_decls = 1, RULE_listDecl = 2, RULE_declTip = 3, RULE_listId = 4, 
		RULE_tip = 5, RULE_cmdComp = 6, RULE_listCmd = 7, RULE_cmd = 8, RULE_cmdIf = 9, 
		RULE_cmdWhile = 10, RULE_cmdRead = 11, RULE_cmdWrite = 12, RULE_listW = 13, 
		RULE_elemW = 14, RULE_cmdAtrib = 15, RULE_expr = 16, RULE_minExpr = 17, 
		RULE_term = 18, RULE_fat = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decls", "listDecl", "declTip", "listId", "tip", "cmdComp", "listCmd", 
			"cmd", "cmdIf", "cmdWhile", "cmdRead", "cmdWrite", "listW", "elemW", 
			"cmdAtrib", "expr", "minExpr", "term", "fat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'INTEGER'", "'BOOLEAN'", "'BEGIN'", "'END'", "'WHILE'", 
			"'DO'", "'READ'", "'VAR'", "'FALSE'", "'TRUE'", "'WRITE'", "'IF'", "'THEN'", 
			"'ELSE'", null, "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'<>'", "'OR'", "'AND'", "'~'", "';'", "'('", "')'", "':='", 
			"','", "':'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "INTEGER", "BOOLEAN", "BEGIN", "END", "WHILE", "DO", 
			"READ", "VAR", "FALSE", "TRUE", "WRITE", "IF", "THEN", "ELSE", "INT", 
			"SOMA", "SUB", "MULTI", "DIV", "MAIORQ", "MENORQ", "MAIOREQ", "MENOREQ", 
			"IGUAL", "DIFF", "OR", "AND", "NOT", "PONTOV", "ABPAR", "FCPAR", "ATTR", 
			"VIRG", "DBPONTO", "PONTO", "COMENT", "STRING", "WS", "ID"
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
	public String getGrammarFileName() { return "grammarSucuri.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarSucuriParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(grammarSucuriParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(grammarSucuriParser.ID, 0); }
		public TerminalNode PONTOV() { return getToken(grammarSucuriParser.PONTOV, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(grammarSucuriParser.PONTO, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PROGRAM);
			setState(41);
			match(ID);
			setState(42);
			match(PONTOV);
			setState(43);
			decls();
			setState(44);
			cmdComp();
			setState(45);
			match(PONTO);
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

	public static class DeclsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(grammarSucuriParser.VAR, 0); }
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitDecls(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decls);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(VAR);
				setState(48);
				listDecl();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ListDeclContext extends ParserRuleContext {
		public DeclTipContext declTip() {
			return getRuleContext(DeclTipContext.class,0);
		}
		public ListDeclContext listDecl() {
			return getRuleContext(ListDeclContext.class,0);
		}
		public ListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitListDecl(this);
		}
	}

	public final ListDeclContext listDecl() throws RecognitionException {
		ListDeclContext _localctx = new ListDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listDecl);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				declTip();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				declTip();
				setState(54);
				listDecl();
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

	public static class DeclTipContext extends ParserRuleContext {
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode DBPONTO() { return getToken(grammarSucuriParser.DBPONTO, 0); }
		public TipContext tip() {
			return getRuleContext(TipContext.class,0);
		}
		public TerminalNode PONTOV() { return getToken(grammarSucuriParser.PONTOV, 0); }
		public DeclTipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declTip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterDeclTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitDeclTip(this);
		}
	}

	public final DeclTipContext declTip() throws RecognitionException {
		DeclTipContext _localctx = new DeclTipContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declTip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			listId();
			setState(59);
			match(DBPONTO);
			setState(60);
			tip();
			setState(61);
			match(PONTOV);
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

	public static class ListIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarSucuriParser.ID, 0); }
		public TerminalNode VIRG() { return getToken(grammarSucuriParser.VIRG, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public ListIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterListId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitListId(this);
		}
	}

	public final ListIdContext listId() throws RecognitionException {
		ListIdContext _localctx = new ListIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listId);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(ID);
				setState(65);
				match(VIRG);
				setState(66);
				listId();
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

	public static class TipContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(grammarSucuriParser.INTEGER, 0); }
		public TerminalNode TRUE() { return getToken(grammarSucuriParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(grammarSucuriParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(grammarSucuriParser.STRING, 0); }
		public TipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterTip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitTip(this);
		}
	}

	public final TipContext tip() throws RecognitionException {
		TipContext _localctx = new TipContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FALSE) | (1L << TRUE) | (1L << STRING))) != 0)) ) {
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

	public static class CmdCompContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(grammarSucuriParser.BEGIN, 0); }
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public TerminalNode END() { return getToken(grammarSucuriParser.END, 0); }
		public CmdCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterCmdComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitCmdComp(this);
		}
	}

	public final CmdCompContext cmdComp() throws RecognitionException {
		CmdCompContext _localctx = new CmdCompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(BEGIN);
			setState(72);
			listCmd();
			setState(73);
			match(END);
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

	public static class ListCmdContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode PONTOV() { return getToken(grammarSucuriParser.PONTOV, 0); }
		public ListCmdContext listCmd() {
			return getRuleContext(ListCmdContext.class,0);
		}
		public ListCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterListCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitListCmd(this);
		}
	}

	public final ListCmdContext listCmd() throws RecognitionException {
		ListCmdContext _localctx = new ListCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listCmd);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				cmd();
				setState(77);
				match(PONTOV);
				setState(78);
				listCmd();
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

	public static class CmdContext extends ParserRuleContext {
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
		}
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdCompContext cmdComp() {
			return getRuleContext(CmdCompContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				cmdIf();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				cmdWhile();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				cmdRead();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				cmdWrite();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				cmdAtrib();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				cmdComp();
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

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(grammarSucuriParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(grammarSucuriParser.THEN, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(grammarSucuriParser.ELSE, 0); }
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdIf);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(IF);
				setState(91);
				expr();
				setState(92);
				match(THEN);
				setState(93);
				cmd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(IF);
				setState(96);
				expr();
				setState(97);
				match(THEN);
				setState(98);
				cmd();
				setState(99);
				match(ELSE);
				setState(100);
				cmd();
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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(grammarSucuriParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(grammarSucuriParser.DO, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(WHILE);
			setState(105);
			expr();
			setState(106);
			match(DO);
			setState(107);
			cmd();
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

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(grammarSucuriParser.READ, 0); }
		public TerminalNode ABPAR() { return getToken(grammarSucuriParser.ABPAR, 0); }
		public ListIdContext listId() {
			return getRuleContext(ListIdContext.class,0);
		}
		public TerminalNode FCPAR() { return getToken(grammarSucuriParser.FCPAR, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitCmdRead(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(READ);
			setState(110);
			match(ABPAR);
			setState(111);
			listId();
			setState(112);
			match(FCPAR);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(grammarSucuriParser.WRITE, 0); }
		public TerminalNode ABPAR() { return getToken(grammarSucuriParser.ABPAR, 0); }
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public TerminalNode FCPAR() { return getToken(grammarSucuriParser.FCPAR, 0); }
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitCmdWrite(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WRITE);
			setState(115);
			match(ABPAR);
			setState(116);
			listW();
			setState(117);
			match(FCPAR);
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

	public static class ListWContext extends ParserRuleContext {
		public ElemWContext elemW() {
			return getRuleContext(ElemWContext.class,0);
		}
		public TerminalNode VIRG() { return getToken(grammarSucuriParser.VIRG, 0); }
		public ListWContext listW() {
			return getRuleContext(ListWContext.class,0);
		}
		public ListWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterListW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitListW(this);
		}
	}

	public final ListWContext listW() throws RecognitionException {
		ListWContext _localctx = new ListWContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listW);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				elemW();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				elemW();
				setState(121);
				match(VIRG);
				setState(122);
				listW();
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

	public static class ElemWContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(grammarSucuriParser.STRING, 0); }
		public ElemWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemW; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterElemW(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitElemW(this);
		}
	}

	public final ElemWContext elemW() throws RecognitionException {
		ElemWContext _localctx = new ElemWContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elemW);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
			case INT:
			case NOT:
			case ABPAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				expr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(STRING);
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

	public static class CmdAtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarSucuriParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(grammarSucuriParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterCmdAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitCmdAtrib(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
			match(ATTR);
			setState(132);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public List<MinExprContext> minExpr() {
			return getRuleContexts(MinExprContext.class);
		}
		public MinExprContext minExpr(int i) {
			return getRuleContext(MinExprContext.class,i);
		}
		public TerminalNode MAIORQ() { return getToken(grammarSucuriParser.MAIORQ, 0); }
		public TerminalNode MENORQ() { return getToken(grammarSucuriParser.MENORQ, 0); }
		public TerminalNode MAIOREQ() { return getToken(grammarSucuriParser.MAIOREQ, 0); }
		public TerminalNode MENOREQ() { return getToken(grammarSucuriParser.MENOREQ, 0); }
		public TerminalNode IGUAL() { return getToken(grammarSucuriParser.IGUAL, 0); }
		public TerminalNode DIFF() { return getToken(grammarSucuriParser.DIFF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				minExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				minExpr();
				setState(136);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIORQ) | (1L << MENORQ) | (1L << MAIOREQ) | (1L << MENOREQ) | (1L << IGUAL) | (1L << DIFF))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(137);
				minExpr();
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

	public static class MinExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MinExprContext minExpr() {
			return getRuleContext(MinExprContext.class,0);
		}
		public TerminalNode SOMA() { return getToken(grammarSucuriParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(grammarSucuriParser.SUB, 0); }
		public MinExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterMinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitMinExpr(this);
		}
	}

	public final MinExprContext minExpr() throws RecognitionException {
		MinExprContext _localctx = new MinExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_minExpr);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				term();
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==SOMA || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				minExpr();
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

	public static class TermContext extends ParserRuleContext {
		public FatContext fat() {
			return getRuleContext(FatContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULTI() { return getToken(grammarSucuriParser.MULTI, 0); }
		public TerminalNode DIV() { return getToken(grammarSucuriParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				fat();
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==MULTI || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				fat();
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

	public static class FatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(grammarSucuriParser.ID, 0); }
		public TerminalNode INT() { return getToken(grammarSucuriParser.INT, 0); }
		public TerminalNode ABPAR() { return getToken(grammarSucuriParser.ABPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FCPAR() { return getToken(grammarSucuriParser.FCPAR, 0); }
		public TerminalNode TRUE() { return getToken(grammarSucuriParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(grammarSucuriParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(grammarSucuriParser.NOT, 0); }
		public FatContext fat() {
			return getRuleContext(FatContext.class,0);
		}
		public FatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).enterFat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarSucuriListener ) ((grammarSucuriListener)listener).exitFat(this);
		}
	}

	public final FatContext fat() throws RecognitionException {
		FatContext _localctx = new FatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fat);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(INT);
				}
				break;
			case ABPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(ABPAR);
				setState(158);
				expr();
				setState(159);
				match(FCPAR);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				match(FALSE);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				match(NOT);
				setState(164);
				fat();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\6F\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tS\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13i\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\177\n\17\3\20"+
		"\3\20\5\20\u0083\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u008e\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0095\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u009c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00a8\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(\2\6\5\2\4\4\f\r((\3\2\27\34\3\2\23\24\3\2\25\26\2\u00a9\2*\3"+
		"\2\2\2\4\64\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16I\3"+
		"\2\2\2\20R\3\2\2\2\22Z\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30o\3\2\2\2\32"+
		"t\3\2\2\2\34~\3\2\2\2\36\u0082\3\2\2\2 \u0084\3\2\2\2\"\u008d\3\2\2\2"+
		"$\u0094\3\2\2\2&\u009b\3\2\2\2(\u00a7\3\2\2\2*+\7\3\2\2+,\7*\2\2,-\7 "+
		"\2\2-.\5\4\3\2./\5\16\b\2/\60\7&\2\2\60\3\3\2\2\2\61\62\7\13\2\2\62\65"+
		"\5\6\4\2\63\65\3\2\2\2\64\61\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66;\5"+
		"\b\5\2\678\5\b\5\289\5\6\4\29;\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2;\7\3\2"+
		"\2\2<=\5\n\6\2=>\7%\2\2>?\5\f\7\2?@\7 \2\2@\t\3\2\2\2AF\7*\2\2BC\7*\2"+
		"\2CD\7$\2\2DF\5\n\6\2EA\3\2\2\2EB\3\2\2\2F\13\3\2\2\2GH\t\2\2\2H\r\3\2"+
		"\2\2IJ\7\6\2\2JK\5\20\t\2KL\7\7\2\2L\17\3\2\2\2MS\5\22\n\2NO\5\22\n\2"+
		"OP\7 \2\2PQ\5\20\t\2QS\3\2\2\2RM\3\2\2\2RN\3\2\2\2S\21\3\2\2\2T[\5\24"+
		"\13\2U[\5\26\f\2V[\5\30\r\2W[\5\32\16\2X[\5 \21\2Y[\5\16\b\2ZT\3\2\2\2"+
		"ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\23\3\2\2\2\\]\7\17"+
		"\2\2]^\5\"\22\2^_\7\20\2\2_`\5\22\n\2`i\3\2\2\2ab\7\17\2\2bc\5\"\22\2"+
		"cd\7\20\2\2de\5\22\n\2ef\7\21\2\2fg\5\22\n\2gi\3\2\2\2h\\\3\2\2\2ha\3"+
		"\2\2\2i\25\3\2\2\2jk\7\b\2\2kl\5\"\22\2lm\7\t\2\2mn\5\22\n\2n\27\3\2\2"+
		"\2op\7\n\2\2pq\7!\2\2qr\5\n\6\2rs\7\"\2\2s\31\3\2\2\2tu\7\16\2\2uv\7!"+
		"\2\2vw\5\34\17\2wx\7\"\2\2x\33\3\2\2\2y\177\5\36\20\2z{\5\36\20\2{|\7"+
		"$\2\2|}\5\34\17\2}\177\3\2\2\2~y\3\2\2\2~z\3\2\2\2\177\35\3\2\2\2\u0080"+
		"\u0083\5\"\22\2\u0081\u0083\7(\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2"+
		"\2\2\u0083\37\3\2\2\2\u0084\u0085\7*\2\2\u0085\u0086\7#\2\2\u0086\u0087"+
		"\5\"\22\2\u0087!\3\2\2\2\u0088\u008e\5$\23\2\u0089\u008a\5$\23\2\u008a"+
		"\u008b\t\3\2\2\u008b\u008c\5$\23\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2"+
		"\2\2\u008d\u0089\3\2\2\2\u008e#\3\2\2\2\u008f\u0095\5&\24\2\u0090\u0091"+
		"\5&\24\2\u0091\u0092\t\4\2\2\u0092\u0093\5$\23\2\u0093\u0095\3\2\2\2\u0094"+
		"\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0095%\3\2\2\2\u0096\u0097\5(\25\2"+
		"\u0097\u0098\t\5\2\2\u0098\u0099\5&\24\2\u0099\u009c\3\2\2\2\u009a\u009c"+
		"\5(\25\2\u009b\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\'\3\2\2\2\u009d"+
		"\u00a8\7*\2\2\u009e\u00a8\7\22\2\2\u009f\u00a0\7!\2\2\u00a0\u00a1\5\""+
		"\22\2\u00a1\u00a2\7\"\2\2\u00a2\u00a8\3\2\2\2\u00a3\u00a8\7\r\2\2\u00a4"+
		"\u00a8\7\f\2\2\u00a5\u00a6\7\37\2\2\u00a6\u00a8\5(\25\2\u00a7\u009d\3"+
		"\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8)\3\2\2\2\16\64:ERZh~\u0082\u008d"+
		"\u0094\u009b\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
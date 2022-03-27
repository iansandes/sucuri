grammar grammarSucuri;

import lexerSucuri;

prog: PROGRAM ID PONTOV decls cmdComp PONTO;

decls: VAR listDecl | ;

listDecl: declTip | declTip listDecl;

declTip: listId DBPONTO tip PONTOV;

listId: ID | ID VIRG listId;

tip: INTEGER | TRUE | FALSE | STRING;

cmdComp: BEGIN listCmd END;

listCmd: cmd | cmd PONTOV listCmd;

cmd: cmdIf | cmdWhile | cmdRead | cmdWrite | cmdAtrib | cmdComp;

cmdIf: IF expr THEN cmd | IF expr THEN cmd ELSE cmd;

cmdWhile: WHILE expr DO cmd;

cmdRead: READ ABPAR listId FCPAR;

cmdWrite: WRITE ABPAR listW FCPAR;

listW: elemW | elemW VIRG listW;

elemW: expr | STRING;

cmdAtrib: ID ATTR expr ;

expr: minExpr | minExpr (MAIORQ | MENORQ | MAIOREQ | MENOREQ | IGUAL | DIFF) minExpr;

minExpr: term | term (SOMA | SUB) minExpr;

term: fat (MULTI | DIV) term | fat;

fat: ID | INT | ABPAR expr FCPAR | TRUE | FALSE | NOT fat;
grammar grammarSucuri;

import lexerSucuri;

prog: PROGRAM ID PONTOV decls cmdComp PONTO;

decls: VAR listDecl; /* FALTA O VAZIO */

listDecl: declTip | declTip listDecl;

declTip: listId | DBPONTO tip PONTOV;

listId: ID | ID VIRG listId;

tip: INT | TRUE | FALSE | STRING;

cmdComp: BEGIN listCmd END;

listCmd: cmd | cmd PONTOV listCmd;

cmd: cmdIf | cmdWhile | cmdRead | cmdWrite | cmdAtrib | cmdComp;

cmdIf: IF expr THEN cmd | IF expr THEN cmd ELSE cmd;

cmdWhile: WHILE expr DO cmd;

cmdRead: READ (listId);

cmdWrite: WRITE (listW);

listW: elemW | elemW VIRG listW;

elemW: expr | STRING;

cmdAtrib: ID ATTR expr;

expr: expr (MAIORQ | MENORQ | MAIOREQ | MENOREQ | IGUAL | DIFF) expr
     |  expr (SOMA | SUB ) expr | expr (MULTI | DIV) expr
     |  ID | ABPAR expr FCPAR | TRUE | FALSE | NOT expr; /* FALTA O CTE*/
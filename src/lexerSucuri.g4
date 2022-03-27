lexer grammar lexerSucuri;

/* Palavras Reservadas */

PROGRAM: 'PROGRAM';
INTEGER: 'INTEGER';
BOOLEAN: 'BOOLEAN';
BEGIN: 'BEGIN';
END: 'END';
WHILE: 'WHILE';
DO: 'DO';
READ: 'READ';
VAR: 'VAR';
FALSE: 'FALSE';
TRUE: 'TRUE';
WRITE: 'WRITE';
IF: 'IF';
THEN: 'THEN';
ELSE: 'ELSE';

/* Números inteiros */

INT: ('+' | '-')* ('0' .. '9') +;

/* Sinais Aritmeticos */

SOMA: '+';
SUB: '-';
MULTI: '*';
DIV: '/';


/* Operadores Relacionais */

MAIORQ: '>';
MENORQ: '<';
MAIOREQ: '>=';
MENOREQ: '<=';
IGUAL: '==';
DIFF: '<>';


/* Operadores Logicos */

OR: 'OR';
AND: 'AND';

/* Operador de Negação */

NOT: '~';

/* Simbolos */

PONTOV: ';';
ABPAR: '(';
FCPAR: ')';
ATTR: ':=';
VIRG: ',';
DBPONTO: ':';
PONTO: '.';

/* Comentários */

COMENT: '//' ~[\r\n]* -> skip;

/* STRING */

STRING: '\'' ('\'\'' | ~ ('\''))* '\'';

WS: [ \t\r\n]+ -> skip;


ID: ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
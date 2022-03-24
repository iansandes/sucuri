lexer grammar lexerSucuri;

/* Palavras Reservadas */

PROGRAM: 'program';
INTEGER: 'integer';
BOOLEAN: 'boolean';
BEGIN: 'begin';
END: 'end';
WHILE: 'while';
DO: 'do';
READ: 'read';
VAR: 'var';
FALSE: 'false';
TRUE: 'true';
WRITE: 'write';
IF: 'if';
THEN: 'then';
ELSE: 'else';

/* Números inteiros */

INT: ('+' | '-')* [0-9]+;

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

STRING: '"' [a-zA-Z][a-zA-Z0-9]* '"';

WS: [ \t\r\n]+ -> skip;


ID: [a-zA-Z0-9]+;
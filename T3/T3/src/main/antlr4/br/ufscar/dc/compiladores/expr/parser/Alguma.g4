grammar Alguma;

// Regra principal do programa
programa
    : declaracoes ALGORITMO corpo FIM_ALGORITMO
    ;

// Declarações globais e locais
declaracoes
    : decl_local_global*
    ;

decl_local_global
    : declaracao_local
    | declaracao_global
    ;

declaracao_local
    : DECLARE variavel
    | CONSTANTE IDENT ':' tipo_basico '-' valor_constante
    | TIPO IDENT ':' tipo
    ;

// Variáveis com possíveis dimensões
variavel
    : identificador (',' identificador)* ':' tipo
    ;

identificador
    : IDENT ('.' IDENT)* dimensao
    ;

dimensao
    : ('[' exp_aritmetica ']')*
    ;

// Tipos básicos e registros
tipo
    : registro
    | tipo_estendido
    ;

registro
    : REGISTRO variavel* FIM_REGISTRO
    ;

tipo_estendido
    : PONTEIRO? tipo_basico_ident
    ;

tipo_basico_ident
    : tipo_basico
    | IDENT
    ;

tipo_basico
    : LITERAL
    | INTEIRO
    | REAL
    | LOGICO
    ;

valor_constante
    : CADEIA
    | NUM_INT
    | NUM_REAL
    | VERDADEIRO
    | FALSO
    ;

// Declarações de procedimentos e funções
declaracao_global
    : PROCEDIMENTO IDENT '(' parametros? ')' declaracao_local* cmd* FIM_PROCEDIMENTO
    | FUNCAO IDENT '(' parametros? ')' ':' tipo_estendido declaracao_local* cmd* FIM_FUNCAO
    ;

parametros
    : parametro (',' parametro)*
    ;

parametro
    : VAR? identificador (',' identificador)* ':' tipo_estendido
    ;

// Corpo com comandos
corpo
    : declaracao_local* cmd*
    ;

cmd
    : cmdLeia
    | cmdEscreva
    | cmdSe
    | cmdCaso
    | cmdPara
    | cmdEnquanto
    | cmdFaca
    | cmdAtribuicao
    | cmdChamada
    | cmdRetorne
    ;

cmdLeia
    : LEIA '(' PONTEIRO? identificador (',' PONTEIRO? identificador)* ')'
    ;

cmdEscreva
    : ESCREVA '(' expressao (',' expressao)* ')'
    ;

cmdSe
    : SE expressao ENTAO cmd* (SENAO cmd*)? FIM_SE
    ;

cmdCaso
    : CASO exp_aritmetica SEJA selecao (SENAO cmd*)? FIM_CASO
    ;

cmdPara
    : PARA IDENT ATRIBUICAO exp_aritmetica ATE exp_aritmetica FACA cmd* FIM_PARA
    ;

cmdEnquanto
    : ENQUANTO expressao FACA cmd* FIM_ENQUANTO
    ;

cmdFaca
    : FACA cmd* ATE expressao
    ;

cmdAtribuicao
    : PONTEIRO? identificador ATRIBUICAO expressao
    ;

cmdChamada
    : IDENT '(' expressao (',' expressao)* ')'
    ;

cmdRetorne
    : RETORNE expressao
    ;

// Seleção de casos
selecao
    : item_selecao*
    ;

item_selecao
    : constantes ':' cmd*
    ;

constantes
    : numero_intervalo (',' numero_intervalo)*
    ;

numero_intervalo
    : op_unario? NUM_INT ('..' op_unario? NUM_INT)?
    ;

op_unario
    : MENOS
    ;

// EXPRESSÃO ARITMÉTICA
exp_aritmetica
    : termo (op1 termo)*
    ;

termo
    : fator (op2 fator)*
    ;

// Achata Fator, incluindo direto literais, variáveis e operações
// Comentário: Tiramos as regras parcela/parcela_unario para que em FatorContext
// já existam ctx.NUM_INT(), ctx.NUM_REAL() e ctx.identificador() diretamente.
fator
    : NUM_INT                            # LiteralInteiro
    | NUM_REAL                           # LiteralReal
    | identificador                     # FatorIdentificador
    | IDENT '(' expressao (',' expressao)* ')'  # ChamadaFuncao
    | '(' expressao ')'                  # Agrupamento
    | '#' identificador                  # Referencia
    | CADEIA                             # LiteralString
    ;

// Operadores aritméticos
op1
    : MAIS
    | MENOS
    ;

op2
    : MULT
    | DIV
    ;

// EXPRESSÃO RELACIONAL e LÓGICA
exp_relacional
    : exp_aritmetica (op_relacional exp_aritmetica)?
    ;

op_relacional
    : IGUAL
    | DIFERENTE
    | MAIOR_IGUAL
    | MENOR_IGUAL
    | MAIOR
    | MENOR
    ;

expressao
    : termo_logico (op_logico_1 termo_logico)*
    ;

termo_logico
    : fator_logico (op_logico_2 fator_logico)*
    ;

fator_logico
    : NAO? parcela_logica
    ;

parcela_logica
    : VERDADEIRO
    | FALSO
    | exp_relacional
    ;

op_logico_1
    : OU
    ;

op_logico_2
    : E
    ;

// Tokens literais e símbolos
ALGORITMO     : 'algoritmo';
DECLARE       : 'declare';
FIM_ALGORITMO : 'fim_algoritmo';
LEIA          : 'leia';
ESCREVA       : 'escreva';
LITERAL       : 'literal';
INTEIRO       : 'inteiro';
REAL          : 'real';
LOGICO        : 'logico';
E             : 'e';
OU            : 'ou';
NAO           : 'nao';
SE            : 'se';
ENTAO         : 'entao';
SENAO         : 'senao';
FIM_SE        : 'fim_se';
CASO          : 'caso';
SEJA          : 'seja';
FIM_CASO      : 'fim_caso';
PARA          : 'para';
ATE           : 'ate';
FACA          : 'faca';
FIM_PARA      : 'fim_para';
ENQUANTO      : 'enquanto';
FIM_ENQUANTO  : 'fim_enquanto';
REGISTRO      : 'registro';
FIM_REGISTRO  : 'fim_registro';
TIPO          : 'tipo';
PROCEDIMENTO  : 'procedimento';
FIM_PROCEDIMENTO : 'fim_procedimento';
VAR           : 'var';
FUNCAO        : 'funcao';
FIM_FUNCAO    : 'fim_funcao';
RETORNE       : 'retorne';
CONSTANTE     : 'constante';
FALSO         : 'falso';
VERDADEIRO    : 'verdadeiro';

DOIS_PONTOS   : ':';
ABRE_PAR      : '(';
FECHA_PAR     : ')';
VIRGULA       : ',';
INTERVALO     : '..';
ATRIBUICAO    : '<-';
PONTEIRO      : '^';
REFERENCIA    : '&';
PONTO         : '.';
ABRE_COLCH    : '[';
FECHA_COLCH   : ']';

MAIS          : '+';
MENOS         : '-';
MULT          : '*';
DIV           : '/';
MOD           : '%';
MENOR         : '<';
MAIOR         : '>';
MENOR_IGUAL   : '<=';
MAIOR_IGUAL   : '>=';
IGUAL         : '=';
DIFERENTE     : '<>';

NUM_INT       : [0-9]+;
NUM_REAL      : [0-9]+'.'[0-9]+;
CADEIA_INACABADO    : '"' (~["\r\n])*? ('\r'|'\n'|'EOF');
CADEIA        : '"' (~[\r\n"\\])* '"';
IDENT         : [a-zA-Z] [a-zA-Z0-9_]*;

// COMENTÁRIOS E ESPAÇOS EM BRANCO
COMENTARIO_INACABADO    :'{' ~[\r\n}]*?('\r' |'\n'|'EOF');
COMENTARIO    : '{' ~[\r\n}]* '}' -> skip;
WS            : [ \t\r\n]+ -> skip;

// ERRO
ERROR         : . ;


%%
%public
%class BlufferLexer
%final
%unicode
%char
%standalone
%{
	
%}

EndOfLine = \r|\n|\r\n
NonLineTerminator = [^\r\n]

Comment = {MultiComment} | {SingleComment}

MultiComment ="/*" [^*] ~ "*/" | "/*" "*" +"/"
SingleComment = "//" {NonLineTerminator}* {EndOfLine}?

CIdentifiers = {simpleConstantIdentifiers}

simpleConstantIdentifiers = [A-Z0-9_]+

Identifier = [:jletter:][:jletterdigit:]*

DecLiteral = 0 | [1-9][0-9]* {IntegerSuffix}

HexLiteral    = 0 [xX] 0* {HexDigit}* {IntegerSuffix}
HexDigit      = [0-9a-fA-F]

OctLiteral    = 0+ {OctDigit}* {IntegerSuffix}
OctDigit          = [0-7]

IntegerSuffix = [uU]? [lL]? [uU]?
	
/* float literals */

FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}|{FLit4}) ([fF]|[dD])?

FLit1 = [0-9]+ \. [0-9]* {Exponent}?
FLit2 = \. [0-9]+ {Exponent}?
FLit3 = [0-9]+ {Exponent}
FLit4 = [0-9]+ {Exponent}?

Exponent = [eE] [+\-]? [0-9]+

%%

<YYINITIAL>{
	 (\" ( [^\"\n\\] | \\[^\n] )* (\n | \\\n | \")) | 
	 (\' ( [^\'\n\\] | \\[^\n] )* (\n | \\\n | \'))      { System.out.println("String:"+yytext()); }
}

<<EOF>>  {return -1;}
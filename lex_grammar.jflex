
package com.bluff.compiler.phases;
import com.bluff.compiler.phases.Helper.Token;
import com.bluff.compiler.phases.Helper.TT;
import java.util.ArrayList;
import com.bluff.util.RegexTool;
import com.bluff.compiler.ErrorHandler;
import static com.bluff.compiler.phases.RegexTokenizer.SUPPORTED_KEYWORDS;

%%
%public
%class BlufferLexer
%final
%unicode
%char
%standalone
%line
%column
%{
	public final ArrayList<Token> tokens=new ArrayList();
	String fileName="";
	String sourceCode="";
	public int getCurrentPos(){
		return zzCurrentPos;
	}
	public void setFileName(String fileName){
		this.fileName=fileName;
	}
	public void setSourceCode(String sourceCode){
		this.sourceCode=sourceCode;
	}
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

IntegerSuffix = [lL]?
	
/* float literals */

FloatLiteral  = ({FLit1}|{FLit2}|{FLit3}|{FLit4}) ([fF]|[dD])?

FLit1 = [0-9]+ \. [0-9]* {Exponent}?
FLit2 = \. [0-9]+ {Exponent}?
FLit3 = [0-9]+ {Exponent}
FLit4 = [0-9]+ {Exponent}?

Exponent = [eE] [+\-]? [0-9]+

%%

<YYINITIAL>{
	{MultiComment}  {}
	{SingleComment}  {}
	 (\" ( [^\"\n\\] | \\[^\n] )* (\n | \\\n | \")) | 
	 (\' ( [^\'\n\\] | \\[^\n] )* (\n | \\\n | \'))      {
			tokens.add(new Token(RegexTool.performEscaping(yytext(),sourceCode.getBytes(),0,0,0)
				,TT.STRING_LITERAL,fileName,yyline+1,yycolumn,zzCurrentPos));
	 }
	 
	 {Identifier}  {
		if (SUPPORTED_KEYWORDS.get(yytext())!=null){
			tokens.add(new Token(yytext(),SUPPORTED_KEYWORDS.get(yytext()),fileName,yyline+1,yycolumn,zzCurrentPos));
		}else{
			tokens.add(new Token(yytext(),TT.IDENTIFIER,fileName,yyline+1,yycolumn,zzCurrentPos));
		}
	 }
	 
	 
	 {DecLiteral}  {
			try{
				long val=Long.parseLong(yytext().replaceAll("l|L",""));
				tokens.add(new Token(yytext(),RegexTool.getIntType(val),fileName,yyline+1,yycolumn,zzCurrentPos));
			}catch(NumberFormatException e){
				System.err.println("Integer overflow:"+yytext());
			}
	 }
	 
	 {OctLiteral} {
			try{
				long val=Long.parseLong(yytext().replaceAll("l|L",""),8);
				tokens.add(new Token(yytext(),RegexTool.getIntType(val),fileName,yyline+1,yycolumn,zzCurrentPos));
			}catch(NumberFormatException e){
				System.err.println("Integer overflow:"+yytext());
			}
	 }
	 
	 
	 {FloatLiteral} {			
			double val=Double.parseDouble(yytext());
			if (val>Double.MAX_VALUE){
				System.err.println("Floating number too large:"+yytext());
			}else{
				tokens.add(new Token(yytext(),RegexTool.getFloatType(val),fileName,yyline+1,yycolumn,zzCurrentPos));
			}
	 }
	 
	 {HexLiteral} {
			try{
				long val=Long.parseLong(yytext().replaceAll("l|L|x|X",""),16);
				tokens.add(new Token(yytext(),RegexTool.getIntType(val),fileName,yyline+1,yycolumn,zzCurrentPos));
			}catch(NumberFormatException e){
				System.err.println("Integer overflow:"+yytext());
				System.out.println(e.getMessage());
			}
	 }
	 
	 
	 [\w+]						{}
	 \s|\n		{}
	 [^]  {
			if (RegexTokenizer.getType(yytext())!=TT.EOF){
				tokens.add(new Token(yytext(),RegexTokenizer.getType(yytext()),fileName,yyline+1,yycolumn,zzCurrentPos));
			}else{
				ErrorHandler.InvalidCharacter(Helper.getBackTraceOneLine(sourceCode.getBytes(),zzCurrentPos),yyline+1,yycolumn);
			}
	 }
}
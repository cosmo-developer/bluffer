package com.bluff;

import com.bluff.compiler.phases.BlufferLexer;
import com.bluff.compiler.phases.BlufferParser;
import com.bluff.expr.AntlrToExpression;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class BlufferMain {

    static void gen(){
        Tool.main(new String[]{"src/com/bluff/compiler/grammar/Bluffer.g4"
                ,"-o","src/com/bluff/compiler/phases"
                ,"-package","com.bluff.compiler.phases","-visitor","-no-listener"});
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        CharStream stream = CharStreams.fromFileName("test.java");
        BlufferLexer lexer = new BlufferLexer(stream);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        BlufferParser parser = new BlufferParser(cts);
        BlufferParser.ProgramBodyContext programBody = parser.programBody();
        AntlrToExpression expression=new AntlrToExpression();
        programBody.programBodyDeclaration().forEach((ctx) -> {
        });
        
    }
}

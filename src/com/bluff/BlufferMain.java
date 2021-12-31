package com.bluff;

import com.bluff.compiler.phases.AvagadroLexer;
import com.bluff.compiler.phases.AvagadroParser;
import java.util.List;
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
        Tool.main(new String[]{"src/com/bluff/compiler/grammar/Avagadro.g4"
                ,"-o","src/com/bluff/compiler/phases"
                ,"-package","com.bluff.compiler.phases","-visitor","-no-listener"});
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
//        gen();
        CharStream stream = CharStreams.fromFileName("test.java");
        AvagadroLexer lexer = new AvagadroLexer(stream);
        CommonTokenStream cts = new CommonTokenStream(lexer);
        AvagadroParser parser = new AvagadroParser(cts);
        List<AvagadroParser.MethodDeclarationContext> list=parser.statementList().methodDeclaration();
        AvagadroParser.MethodDeclarationContext get = list.get(0);
        AvagadroParser.BlockContext block = get.block();
        AvagadroParser.StatementContext statement = block.statement(0);
        System.out.println(statement.createConstantNewArray().expression());
        
//        AntlrToExpression expression=new AntlrToExpression();
//        AntlrToProgramBody body=new AntlrToProgramBody(expression);
//        body.visit(programBody);
        
    }
}

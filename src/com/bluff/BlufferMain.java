package com.bluff;

import com.bluff.compiler.phases.BlufferLexer;
import com.bluff.compiler.phases.BlufferParser;
import com.bluff.compiler.phases.ByteCodeGenerator;
import com.bluff.compiler.phases.ExpressionBuilder;
import com.bluff.expr.Expression;
import java.io.File;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class BlufferMain {

    static void gen() {
        Tool.main(new String[]{"src/com/bluff/compiler/grammar/Bluffer.g4",
             "-o", "src/com/bluff/compiler/phases",
             "-package", "com.bluff.compiler.phases", "-visitor", "-no-listener"});
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
//        gen();
        if (args.length < 1) {
            System.err.println("<filename>");
        } else {
            File file=new File(args[0]);
            CharStream stream = CharStreams.fromFileName(file.getAbsolutePath());
            BlufferLexer lexer = new BlufferLexer(stream);
            CommonTokenStream token = new CommonTokenStream(lexer);
            BlufferParser parser = new BlufferParser(token);
            BlufferParser.StatementListContext statementList = parser.statementList();
            ExpressionBuilder builder = new ExpressionBuilder();
            Expression visit = builder.visit(statementList);

            ByteCodeGenerator generator = new ByteCodeGenerator(file.getName().split("\\.")[0],file, builder.gtable);
            visit.accept(generator);
        }
    }
}

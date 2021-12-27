package com.bluff;

import com.bluff.compiler.phases.BlufferLexer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class BlufferMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {

        BlufferLexer lexer = new BlufferLexer(new FileReader("test.java"));
        while(!lexer.yyatEOF()){
            lexer.yylex();
        }
        System.out.println(lexer.tokens);
    }

}

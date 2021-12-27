package com.bluff;

import com.bluff.compiler.phases.BlufferLexer;
import com.bluff.compiler.phases.Parser;
import java.io.File;
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
        FileReader reader=new FileReader("test.java");
        File file=new File("test.java");
        FileReader readercopy=new FileReader("test.java");
        BlufferLexer lexer = new BlufferLexer(reader);
        int size=(int) file.length();
        char[] sourceBuffer=new char[size];
        readercopy.read(sourceBuffer);
        lexer.setFileName("test.java");
        readercopy.close();
        lexer.setSourceCode(new String(sourceBuffer));
        while(!lexer.yyatEOF()){
            lexer.yylex();
        }
        
        Parser parser=new Parser(lexer.tokens,new String(sourceBuffer));
        parser.parse();
        
    }

}

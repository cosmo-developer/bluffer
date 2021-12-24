package com.bluff;

import com.bluff.compiler.ErrorHandler;
import com.bluff.compiler.phases.Lexer;
import com.bluff.compiler.phases.RegexTokenizer;
import com.bluff.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

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
        RegexTokenizer lexer=new RegexTokenizer();
        Pair<Byte[], ArrayList<Lexer.Token>> pairs = lexer.genTokens();
        if (ErrorHandler.errorCount==0){
            pairs.getValue().forEach((p) -> {
                System.out.println(p);
            });
        }else{
            throw new Exception("Compilation terminated![Error:"+ErrorHandler.errorCount+"]");
        }
        
    }

}

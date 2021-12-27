package com.bluff;

import org.antlr.v4.Tool;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class BlufferMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Tool.main(new String[]{"src/com/bluff/compiler/grammar/Bluffer.g4"
                ,"-o","src/com/bluff/compiler/phases"
                ,"-package","com.bluff.compiler.phases","-visitor"});
    }
}

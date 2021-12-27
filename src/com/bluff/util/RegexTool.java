/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.util;

import com.bluff.compiler.ErrorHandler;
import com.bluff.compiler.phases.Helper;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class RegexTool {
    static Pattern escapeMatching=Pattern.compile("\\[^nbrf'\"]");
    static Pattern unicodePattern = Pattern.compile("\\[uU]+[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]");
    public static String performEscaping(String anyliteral,byte[] source,int curpos,int line,int col){
        if (anyliteral.length() >=3){
            
        }
        String result= anyliteral
                .replace("\\n", "\n")
                .replace("\\b", "\b")
                .replace("\\r", "\r")
                .replace("\\f", "\f")
                .replace("\\\"", "\"")
                .replace("\\\\", "\\")
                .replace("\\t", "\t")
                ;
        if (anyliteral.charAt(0)=='\''){
            result=result.replace("\\'", "'");
        }
        
        Matcher matcher = escapeMatching.matcher(anyliteral);
        while (matcher.find()){
            ErrorHandler.InvalidEscapeCharacter(null, Helper.getBackTraceOneLine(source, curpos), curpos, line, col);
            
        }
        if (ErrorHandler.errorCount!=0)
            return null;
        return result;
    }
}

package com.bluff;

import com.bluff.compiler.ErrorHandler;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        try (BufferedReader br = new BufferedReader(new FileReader("bluffer_lexer.re"))) {
            String line;
            String source="";
            while((line=br.readLine())!=null){
                source+=line;
            }
            br.close();
            Pattern p=Pattern.compile(source);
            String text="void avoid voida 'H' $ ''asdf230xFF'' ' =230xFFabcdefaaaaaaaaaaa=2343 078 98987 +87987--8798 33e-2 0b111";
            Matcher matcher=p.matcher(text);
            while (matcher.find()){
                if (matcher.group("terminatedchar")!=null){
                    System.out.println(matcher.group());
                }else if (matcher.group("unterminatedchar")!=null){
                    ErrorHandler.UnclosedCharLiteral(text.getBytes(), text, matcher.start(), 1, matcher.start());
                }else if(matcher.group("emptychar")!=null){
                    ErrorHandler.EmptyCharLiteral(text, 1, matcher.start());
                }else if(matcher.group("hexnumber")!=null){
                    System.out.println("Hexadecimal:"+matcher.group());
                }else if(matcher.group("integer")!=null){
                    System.out.println(matcher.group());
                }else if(matcher.group("octal")!=null){
                    System.out.println("Octal:"+matcher.group());
                    Integer.parseInt(matcher.group(), 8);
                }else if(matcher.group("invalid")!=null){
                    System.out.println("Invalid:"+matcher.group());
                }
                
            }
        }
    }

}

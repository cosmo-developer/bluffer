/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ErrorHandler {
    public static int errorCount=0;
    public static void ThrowIllegalStartOfExpression(byte[] src,String msg,int currpos,int line,int col){
        System.err.printf("Illegal Start of Expression (line:%d,col:%d)\n%s\n",line,col,msg);
        for (int i=1;i<=col;i++){
            System.err.print(" ");
        }
        System.err.println("^");
    }
    public static void UnclosedComment(byte[] src,String msg,int currpos,int line,int col){
        System.err.printf("Unclosed Comment (line:%d,col:%d)\n%s\n",line,col,msg);
        for (int i=1;i<=col;i++){
            System.err.print(" ");
        }
        System.err.println("^");
    }
    public static void UnclosedCharLiteral(byte[] src,String msg,int currpos,int line,int col){
        System.err.printf("Unclosed CharLiteral (line:%d,col:%d)\n%s\n",line,col,msg);
        for (int i=1;i<=col;i++){
            System.err.print(" ");
        }
        System.err.println("^");
        errorCount++;
    }
    public static void InvalidEscapeCharacter(byte[] src,String msg,int currpos,int line,int col){
        System.err.printf("Invalid Escape Character (line:%d,col:%d)\n%s\n",line,col,msg);
        for (int i=1;i<=col;i++){
            System.err.print(" ");
        }
        System.err.println("^");
        errorCount++;
    }
    
    
    public static void EndOfFile(byte[] src,String msg,int line){
        System.err.printf("EOF at line:%d\n", line);
    }
    public static void InvalidCharacter(String msg,int line,int col){
        System.err.printf("Invalid Character (line:%d,col:%d)\n%s\n",line,col,msg);
        for (int i=1;i<=col;i++){
            System.err.print(" ");
        }
        System.err.println("^");
        errorCount++;
    }
    
    public static void EmptyCharLiteral(String msg,int line,int col){
        System.err.printf("Empty Char Literal (line:%d,col:%d)\n%s\n",line,col,msg);
        for (int i=1;i<=col;i++){
            System.err.print(" ");
        }
        System.err.println("^");
        errorCount++;
    }
    public static void UnclosedStringLiteral(String msg,int line,int col){
        System.err.printf("Unclosed String Literal (line:%d,col:%d)\n%s\n",line,col,msg);
        for (int i=1;i<=col;i++){
            System.err.print(" ");
        }
        System.err.println("^");
        errorCount++;
    }
    
}

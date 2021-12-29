/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class SymbolTable {
    
    public static enum Type{
        INT,CHAR,DOUBLE,FLOAT,
        SHORT,LONG,BOOL,STRING,
        BYTE,METHODNAME
    }
    public class Symbol{
        public final Token id;
        public final Type type;
        public final Object extra;

        public Symbol(Token id, Type type,String extra) {
            this.id = id;
            this.type = type;
            this.extra=extra;
        }
        
    }
    public final SymbolTable parent;
    private final HashMap<String,Symbol> symbols;
    public SymbolTable(SymbolTable parent){
        this.parent=parent;
        this.symbols=new HashMap<>();
    }
    public boolean addSymbol(Token id,Type type,String extra){
        if (symbols.get(id.getText())!=null){
            return false;
        }
        this.symbols.put(id.getText(), new Symbol(id,type,extra));
        return true;
    }
    public Symbol getSymbol(Token id){
        Set<Map.Entry<String, Symbol>> entrySet = symbols.entrySet();
        for (Map.Entry<String,Symbol> sym:entrySet){
            if (sym.getKey().equals(id.getText())){
              return sym.getValue();
            }
        }
        if (parent!=null){
            return parent.getSymbol(id);
        }else{
            System.err.printf("Undefined Keyword/Identifier:{%s} at line:%d column:%d\n", id.getText(),id.getLine(),id.getCharPositionInLine()+1);
        }
        return null;
    }
}
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
    public int counter=0;
    
    public class Symbol{
        public final Token id;
        public final String type;
        public final Object extra;
        public  int lidx;
        public Symbol(Token id, String type,String extra) {
            this.id = id;
            this.type = type;
            this.extra=extra;
        }
        void setIdx(int lidx){
            this.lidx=lidx;
        }

        @Override
        public String toString() {
            return "Symbol{" + "id=" + id + ", type=" + type + ", extra=" + extra + ", lidx=" + lidx + '}';
        }
        
    }
    public final SymbolTable parent;
    public final HashMap<String,Symbol> symbols;
    public SymbolTable(SymbolTable parent){
        this.parent=parent;
        this.symbols=new HashMap<>();
        counter=0;
    }
    public boolean addSymbol(Token id,String type,String extra){
        if (symbols.get(id.getText())!=null){
            System.err.printf("Redefinitiion of symbol:%s, at line:%d, column:%d | "
                    + "Previousely defined at line:%d column:%d\n", id.getText(),
                        id.getLine(),id.getCharPositionInLine(),
                        symbols.get(id.getText()).id.getLine(),
                        symbols.get(id.getText()).id.getCharPositionInLine()
                    );
            return false;
        }
        Symbol sym=new Symbol(id,type,extra);
        sym.setIdx(counter++);
        this.symbols.put(id.getText(), sym);
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
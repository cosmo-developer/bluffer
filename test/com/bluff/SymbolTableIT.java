/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff;

import com.bluff.SymbolTable.Symbol;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class SymbolTableIT {
    
    class SampleTestToken implements Token{
        String text;
        int type;
        int line;
        int column;

        public SampleTestToken(String text, int type, int line, int column) {
            this.text = text;
            this.type = type;
            this.line = line;
            this.column = column;
        }
        
        @Override
        public String getText() {
            return this.text;
        }

        @Override
        public int getType() {
            return this.type;
        }

        @Override
        public int getLine() {
            return this.line;
        }

        @Override
        public int getCharPositionInLine() {
            return this.column;
        }

        @Override
        public int getChannel() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getTokenIndex() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getStartIndex() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getStopIndex() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public TokenSource getTokenSource() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public CharStream getInputStream() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public SymbolTableIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addSymbol method, of class SymbolTable.
     */
    @Test
    public void testAddSymbol() {
        System.out.println("addSymbol");
        Token id = new SampleTestToken("id",1,1,1);
        SymbolTable.Type type = SymbolTable.Type.BOOL;
        String extra = "";
        SymbolTable instance = new SymbolTable(null);
        assertTrue("Value should be true",instance.addSymbol(id, type, extra)==true);
        
    }

    /**
     * Test of getSymbol method, of class SymbolTable.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Token id = new SampleTestToken("id",1,1,1);
        SymbolTable instance = new SymbolTable(null);
        SymbolTable.Symbol expResult = null;
        SymbolTable.Symbol result = instance.getSymbol(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

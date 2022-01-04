/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 * @param <I> first element
 * @param <J> second element
 * @param <K> third element
 */
public class TriPair<I,J,K> {
    public final I a;
    public final J b;
    public final K c;

    public TriPair(I a, J b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "TriPair{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.util;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class Pair<K,V> {
    final K key;
    final V value;
    public Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}

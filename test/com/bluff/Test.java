/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class Test {

    static int mult(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a + mult(a, b - 1);
        }
    }

    static int div(int a, int b) {
        if (a == b) {
            return 1;
        } else if (b > a) {
            return 0;
        } else {
            return 1 + div(a - b, b);
        }
    }

    static int fib(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void main(String[] args) {
        int p = 3;
        int q = 13;
        int res = mult(p, q);
        System.out.println(res);

        res = div(q, p);
        System.out.println(res);

        int n = 8;
        res = fib(8);
        System.out.println(res);
    }
}

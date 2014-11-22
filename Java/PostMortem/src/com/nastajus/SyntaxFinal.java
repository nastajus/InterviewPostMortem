package com.nastajus;

/**
 * Created by IAN on 22/11/14.
 */
public class SyntaxFinal {
    void bar() {
        final int a;
        a = 10;
        //a = 11;   //not allowed again
    }
}
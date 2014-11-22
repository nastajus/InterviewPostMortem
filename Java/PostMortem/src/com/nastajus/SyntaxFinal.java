package com.nastajus;

/**
 * Created by IAN on 22/11/14.
 */
public class SyntaxFinal {

    //test #2
    //static final int a;     //"variable a might not have been initialized" == must initialize here.
    static final int a = 10;

    void bar() {
        //test #1
        final int a;
        a = 10;
        //a = 11;   //not allowed again
    }
}
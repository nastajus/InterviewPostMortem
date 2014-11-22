package com.nastajus;

/**
 * Created by IAN on 22/11/14.
 */
public class SyntaxFinal {

    //test #2
    //static final int a;     //must initialize here.
    static final int a = 10;

    //test #3
    //final SyntaxFinalBuddy b;       //final's trait of delayed assignment doesn't work
    //b = new SyntaxFinalBuddy();


    void bar() {
        //test #1
        final int a;
        a = 10;
        //a = 11;   //not allowed again
    }
}
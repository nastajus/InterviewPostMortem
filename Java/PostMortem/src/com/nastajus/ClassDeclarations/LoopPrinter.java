package com.nastajus.ClassDeclarations;

/**
 * Created by IAN on 04/12/14.
 */
public class LoopPrinter implements Runnable {

    String s;

    LoopPrinter(String s){
        this.s = s;
    }

    @Override
    public void run() {
        while( true ) {
            System.out.println(this.s);
        }
    }
}

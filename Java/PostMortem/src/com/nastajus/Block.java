package com.nastajus;

/**
 * Created by IAN on 27/11/14.
 */
public class Block {

    //all three variables are in scope
    int a = 2;

    //anonymous code blocks
    {
        int a = 22;
    }
    {
        int a = 23;
    }
}

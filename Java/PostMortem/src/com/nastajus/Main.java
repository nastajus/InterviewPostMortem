package com.nastajus;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        SyntaxFinal foo = new SyntaxFinal();
        System.out.println("test");

        App.read();


        Fizzbuzz.run();

        int[] shit = {3,5,7,9};
        int target = 10;
        SumOfTwo.run(shit, target);
    }

}

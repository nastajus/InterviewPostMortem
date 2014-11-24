package com.nastajus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by IAN on 24/11/14.
 */
public abstract class App {

    static void read() throws IOException {

        FileReader testFileReader = new FileReader("blooms-verbs.txt");
        BufferedReader bf = new BufferedReader(testFileReader);
        String line;

        while((line = bf.readLine())!=null){
            bf.read();
            System.out.println(line);
        }

    }
}

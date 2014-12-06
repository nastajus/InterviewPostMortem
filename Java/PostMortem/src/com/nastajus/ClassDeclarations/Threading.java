package com.nastajus.ClassDeclarations;

/**
 * Created by IAN on 04/12/14.
 */
public class Threading {
    public static void main(String args[]){
        //start 3 threads
        //thread 1: fill a queue
        //thread 2: consume a queue
        //thread 3: main thread, reports to the user


        Thread thread = new Thread( new Runnable() {
            @Override
            public void run() {
                //System.out.println("started thread! O_O ");

                while( true ) {
                    System.out.println("bar");
                }
            }
        }); //awesome lambdas


        Thread thread2 = new Thread(
            new LoopPrinter("foo")
        );

        Thread thread3 = new Thread(
             new LoopPrinter("bar")
        );



        Thread thread4 = new Thread( new LoopPrinter("bugs") {
            int count = 0;
            @Override
            public void run() {

                while( true ) {
                    count++;
                    System.out.println(s + " " + count);
                }
            }
        }); //awesome lambdas


        //thread.start();
//        thread2.start();
//        thread3.start();
        thread4.start();






    }
}

package com.nastajus.ClassDeclarations;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by IAN on 04/12/14.
 */
public class Threading {

    static ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
    static int maxQueue = 20;
    static int minMS = 0;
    static int maxMS = 1000;
    static Random r = new Random();

    public static void main(String args[]){
        //start 3 threads
        //thread 1: fill a queue
        //thread 2: consume a queue
        //thread 3: main thread, reports to the user

        //determine which is the "main" thread.
        //the main thread is supposed to receive all the messages.
        //main thread has to produce three messages: started, done producing, done consuming

        //thread_produce
        Thread tp = new Thread( new Runnable() {

            public boolean ready = false;

            @Override
            public void run() {
                System.out.println("START.");
                for (int i = 0; i < maxQueue; i++){
                    clq.add(i);
                    ready = true;

                    int rand = r.nextInt(maxMS - minMS + 1) + minMS;

                    try {
                        Thread.sleep(rand);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("PROD: " + i);
                }
            }
        });


        //thread_consume
        Runnable x = new Runnable() {
            public boolean ready = false;
            int count = 0;

            @Override
            public void run() {

                int rand = r.nextInt(maxMS - minMS + 1) + minMS;

                while (true) {
                    try {
                        Thread.sleep(rand);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (clq.size() > 0) {
                        count++;
                        System.out.println("CONS: " + clq.remove());
                    }
                    if (count == maxQueue) break;
                }
                System.out.println("DONE.");
            }
        };
        Thread tc = new Thread(x);

        tp.start();
        tc.start();

        //I AM THE MAIN THREAD.
        //I WILL HAS CONCURRENCY CONTROL

        //Cannot resolve symbol 'ready'
        //because the compiler will only see that x is of type Runnable, and in order for it to know it's of type
        //that Runnable anonymous class, it would need to be cast to it. Which is impossible.
        x.ready;


    }
}

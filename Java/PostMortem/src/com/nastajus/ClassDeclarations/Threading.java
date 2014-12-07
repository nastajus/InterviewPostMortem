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
    static int currentp = -1;
    static int currentc = -1;
    static boolean done = false;


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
            @Override
            public void run() {
                System.out.println("START.");
                for (int i = 0; i < maxQueue; i++){
                    clq.add(i);
                    currentp = i;

                    int rand = r.nextInt(maxMS - minMS + 1) + minMS;

                    try {
                        Thread.sleep(rand);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        });


        //thread_consume
        Thread tc = new Thread( new Runnable() {
            int count = 0;
            @Override
            public void run() {

                int rand = r.nextInt(maxMS - minMS + 1) + minMS;

                while( true ) {
                    try {
                        Thread.sleep(rand);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (clq.size()>0){
                        count++;
                        currentc = clq.remove();
                    }
                    if (count == maxQueue) { done = true; break; }
                }
            }
        });

        tp.start();
        tc.start();

        //I AM THE MAIN THREAD.
        //I WILL HAS CONCURRENCY CONTROL

        while ( !done ){
            if (currentp != -1){
                System.out.println("PRO: " + currentp);
                currentp = -1;
            }
            if (currentc != -1) {
                System.out.println("CONSUME: " + currentc );
                currentc = -1;
            }
        }

        System.out.println("DONE.");

    }
}

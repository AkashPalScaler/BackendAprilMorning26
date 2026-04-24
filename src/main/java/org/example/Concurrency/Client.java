package org.example.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        // Main thread
        System.out.println("Hello World -> " + Thread.currentThread().getName());
        HelloWorldPrinter printer = new HelloWorldPrinter();
        Runnable printer1 = new HelloWorldPrinter();
//        printer.run();

        Thread thread = new Thread(printer1); // creates new thread and assigns a task
        thread.start(); // Asks thread to running the task function



        //Task of 1-100 print - Without Thread pool
//        for(int i=1;i<=1000000;i++){
//            Runnable runnable = new NumberPrint(i);
//            Thread thread1 = new Thread(runnable);
//            thread1.start();
//        }

        // //Task of 1-100 print - Fixed Thread pool
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=10000;i++){
//            Runnable runnable = new NumberPrint(i);
//            es.execute(runnable);
//
//            if(i == 6000){
//                System.out.println();
//            }
//        }

        // //Task of 1-100 print - Cached Thread pool
        ExecutorService es1 = Executors.newCachedThreadPool();
        for(int i=1;i<=1000000;i++){
            Runnable runnable = new NumberPrint(i);
            es1.execute(runnable);

            if(i == 600000){
                System.out.println();
            }
        }
    }
}

// Thread thread = new Thread(printer1);
// Class Thread {
//    public Thread(Runnable r){
            // r.run();
//    }
// }


package org.example.Concurrency;

public class Client {
    public static void main(String[] args) {
        // Main thread
        System.out.println("Hello World -> " + Thread.currentThread().getName());
        HelloWorldPrinter printer = new HelloWorldPrinter();
        Runnable printer1 = new HelloWorldPrinter();
//        printer.run();

        Thread thread = new Thread(printer1); // creates new thread and assigns a task
        thread.start(); // Asks thread to running the task function
    }
}

// Thread thread = new Thread(printer1);
// Class Thread {
//    public Thread(Runnable r){
            // r.run();
//    }
// }


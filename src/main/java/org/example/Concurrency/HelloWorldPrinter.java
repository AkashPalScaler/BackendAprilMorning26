package org.example.Concurrency;

public class HelloWorldPrinter implements Runnable{
    String name="Akash";
    @Override
    public void run() { // Entry Point
        // Whatever code needs to run on a thread
        System.out.println("Hello World Printer->" +"Akash"+ Thread.currentThread().getName());
        something();
    }
    public void something(){
        System.out.println("Something else ->" + Thread.currentThread().getName());
    }
}
// The interface reference can point to object which implements it.

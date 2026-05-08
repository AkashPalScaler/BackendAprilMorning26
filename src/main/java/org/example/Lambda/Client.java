package org.example.Lambda;


import java.lang.classfile.attribute.RuntimeInvisibleAnnotationsAttribute;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Client {
    public static void main(String[] args) {
        Runnable task0 = new NumberPrinter();
        Thread thread = new Thread(task0);
        thread.start();

        //Anonymous class
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        };
        Thread thread1 = new Thread(task);

        thread1.start();


        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world 2");
            }
        };

        TestInterface testObj = new TestInterface() {
            @Override
            public void run() {
                System.out.println("hbsdb");
            }

            @Override
            public void something() {
                System.out.println(";shbkjdn");
            }
        };

        // Lambda implementation - (Removing even more redundant data from anonymous class implementation)
        // Java creates a lambda class internally
        // Then it implements Runnable interface based on left handside reference
        // It takes only the one function def required (that is why lambda is only supported for functional interface)
        Runnable task3 = () -> {
            System.out.println("Hello world");
        };
        // Left = right | void func(left) .... func(right)
        Thread thread2 = new Thread(task3);

        Thread thread3 = new Thread(()-> {
            System.out.println("Hello world");
        });
        thread3.start();


//        TestInterface test2 = () -> {
//            System.out.println("Hello");
//        };

        ExecutorService es = Executors.newCachedThreadPool();


        es.submit(() -> {
            System.out.println("Hello world!");
        });

    // Break till 8:15

        System.out.println("DEBUG");

    }
}

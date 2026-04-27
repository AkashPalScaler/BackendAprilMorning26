package org.example.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SharedValue svalue = new SharedValue();
        ExecutorService es = Executors.newFixedThreadPool(10);
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();

        Future<Void> addFuture = es.submit(new AdderTask(svalue, lock2));
        Future<Void> subtractFuture = es.submit(new SubtractorTask(svalue,lock2));

        addFuture.get();
        subtractFuture.get();

        System.out.println(svalue.i);
    }
}

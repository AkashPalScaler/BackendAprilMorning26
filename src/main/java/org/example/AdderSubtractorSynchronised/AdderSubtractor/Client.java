package org.example.AdderSubtractorSynchronised.AdderSubtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SharedValue svalue = new SharedValue();
        ExecutorService es = Executors.newFixedThreadPool(10);
        Object ob = new Object();

        Future<Void> addFuture = es.submit(new AdderTask(svalue, ob));
        Future<Void> subtractFuture = es.submit(new SubtractorTask(svalue, ob));

        addFuture.get();
        subtractFuture.get();

        System.out.println(svalue.i);
    }
}

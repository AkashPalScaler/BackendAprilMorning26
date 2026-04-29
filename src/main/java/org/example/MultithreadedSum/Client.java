package org.example.MultithreadedSum;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,6,3,23,2,2,4,4,3,32,21,3,2,2,24,2,23));
        Integer cores = Runtime.getRuntime().availableProcessors();

        Integer chunkSize = arr.size()/cores;

        ExecutorService es = Executors.newFixedThreadPool(cores);
        List<Future<Long>> resFutures = new ArrayList<>();

        for(int i=0;i<cores;i++){
            resFutures.add(es.submit(new SumAnArray(arr, i*chunkSize, (i+1)* chunkSize)));
        }
        Long sum = 0l;
        for(Future<Long> resFuture : resFutures){
            sum += resFuture.get();
        }

        System.out.println("Result sum : " + sum);

    }
}

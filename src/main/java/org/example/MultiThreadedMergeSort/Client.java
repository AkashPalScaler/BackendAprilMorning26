package org.example.MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrToSort = new ArrayList<>(List.of(2,4,5,8,7,1,3,6));
        ExecutorService es = Executors.newFixedThreadPool(10);

        Callable<List<Integer>> mergeTask = new MergeSort(arrToSort, es);

        Future<List<Integer>> resultFuture = es.submit(mergeTask); // Submitting the task the thread and getting a token

        // You can do other things
        // may be Db call, may be API call

        List<Integer> result = resultFuture.get(); // You wait for the result

        System.out.println(result.toString());


    }
}

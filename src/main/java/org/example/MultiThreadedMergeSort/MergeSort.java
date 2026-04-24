package org.example.MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> arrToSort;
    ExecutorService es;

    public MergeSort(List<Integer> arrToSort, ExecutorService es) {
        this.arrToSort = arrToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        //base case
        if(arrToSort.size() == 1){
            return arrToSort;
        }
        int size = arrToSort.size();
        int mid = size/2;

        List<Integer> leftArrayToSort = new ArrayList<>();
        List<Integer> rightArrayToSort = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArrayToSort.add(arrToSort.get(i));
        }

        for(int i=mid;i<size;i++){
            rightArrayToSort.add(arrToSort.get(i));
        }

        Future<List<Integer>> leftSortedArrFuture = es.submit(new MergeSort(leftArrayToSort, es)); //9:33:31:123 msecs
        Future<List<Integer>> rightSortedArrFuture = es.submit(new MergeSort(rightArrayToSort, es)); // 9:33:31:125 msecs

        List<Integer> leftSortedArr = leftSortedArrFuture.get(); // 29 secs wait // 30 secs
        List<Integer> rightSortedArr = rightSortedArrFuture.get(); // 1 sec wait // 0 secs

        return merge(leftSortedArr, rightSortedArr);
    }

    public List<Integer> merge(List<Integer> sortedLeftArray, List<Integer> sortedRightArray){
        // Merging the two sorted arrays
        int i= 0; // start of left
        int j = 0; //start of right

        ArrayList<Integer> sortedArray = new ArrayList();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }


}

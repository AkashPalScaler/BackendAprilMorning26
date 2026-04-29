package org.example.MultithreadedSum;

import java.util.List;
import java.util.concurrent.Callable;

public class SumAnArray implements Callable<Long> {
    List<Integer> arr;
    Integer start;
    Integer end;

    public SumAnArray(List<Integer> arr, Integer start, Integer end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        Long sum = 0L;
        for(int i=start;i<end;i++){
            sum += arr.get(i);
        }
        return sum;
    }
}

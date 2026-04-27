package org.example.AdderSubtractorSynchronised.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class AdderTask implements Callable<Void> {
    SharedValue val;
    Object ob;

    public AdderTask(SharedValue val, Object ob) {
        this.val = val;
        this.ob = ob;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            synchronized (ob){ // Basically uses val's internal lock
                val.i += i;
            }
        }
        return null;
    }
}

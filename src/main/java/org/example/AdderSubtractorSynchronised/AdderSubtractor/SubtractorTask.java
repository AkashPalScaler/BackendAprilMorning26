package org.example.AdderSubtractorSynchronised.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class SubtractorTask implements Callable<Void> {
    SharedValue val;
    Object ob;

    public SubtractorTask(SharedValue val, Object ob) {
        this.val = val;
        this.ob = ob;
    }

    @Override
    public Void call() throws Exception {

        for(int i=1;i<=10000;i++){
            // Some other tasks which are not critical sections(shares any memory)
            synchronized (ob){ // Basically uses val's internal lock - val.internalLock.lock()
                val.i -= i;
            } //val.internalLock.unlock()


            //Some other tasks
        }

        return null;
    }
}

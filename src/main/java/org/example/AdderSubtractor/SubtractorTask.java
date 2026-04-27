package org.example.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class SubtractorTask implements Callable<Void> {
    SharedValue val;
    ReentrantLock lock;

    public SubtractorTask(SharedValue val, ReentrantLock lock) {
        this.val = val;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {

        for(int i=1;i<=10000;i++){
            // Some other tasks which are not critical sections(shares any memory)
            lock.lock(); //  T2
            val.i -= i;
            lock.unlock();// T1 executes this line
            //Some other tasks
        }

        return null;
    }
}

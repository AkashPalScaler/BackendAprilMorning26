package org.example.AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class AdderTask implements Callable<Void> {
    SharedValue val;
    ReentrantLock lock;

    public AdderTask(SharedValue val, ReentrantLock lock) {
        this.val = val;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            lock.lock();
            val.i += i;
            lock.unlock();
        }
        return null;
    }
}

package org.example.Concurrency;
//Print 1-100 each number with a new thread
public class NumberPrint implements Runnable{
    int i;

    public NumberPrint(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i + " -> " + Thread.currentThread().getName());
    }
}

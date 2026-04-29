package org.example.ProducerConsumer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize; //Number of shelves present
    private ConcurrentLinkedDeque<Object> items; //Actual shelves

    Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        //100 producer threads -> all of them called DB to fetch -> Db can handle 10 connections (queries) -> after all this each 100 producer will have to wait on each other
        // Producer might do pre-processing of item - we don't want more 5 threads doing (Consumer + Producer included)
        System.out.println("Producer producing, current size " + this.items.size());
        this.items.add(new Object());
    }

    public void removeItem() {
        // We can still have multiple consumer threads
        items.removeLast();
        System.out.println("Consumer consuming, current size " + this.items.size());
        // Consumer might do post-processing - we don't want more than 5 threads (Consumer + Producer included)
    }
}
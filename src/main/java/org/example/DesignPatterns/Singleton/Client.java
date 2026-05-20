package org.example.DesignPatterns.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);

        List<PrintDBConnectionObject> taskList = new ArrayList<>();
        for(int i=0;i<1000;i++){
            taskList.add(new PrintDBConnectionObject());
        }

        for(int i=0;i<1000;i++){
            es.execute(taskList.get(i));
        }
    }
}

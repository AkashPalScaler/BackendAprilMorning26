package org.example.DesignPatterns.Singleton;

public class PrintDBConnectionObject implements Runnable{
    @Override
    public void run() {
        DBConnection db = DBConnection.getInstance();
        System.out.println(db);
    }
}

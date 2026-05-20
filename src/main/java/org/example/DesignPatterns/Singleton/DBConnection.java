package org.example.DesignPatterns.Singleton;

import java.util.List;

public class DBConnection {
    String url;
    String username;
    String password;
    List<Object> connections;

    private static DBConnection instance = null;

    private DBConnection(){};

    public static DBConnection getInstance(){
//        if(instance == null){
//            synchronized (DBConnection.class){
                if(instance == null){
                    instance = new DBConnection();
                }
//            }
//        }
        return instance;
    }
}

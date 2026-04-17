package org.example.Inheritance;

import org.example.Constructors.Batch;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        Student s = new Student("Akash", 23, 10.0f);
        s.getPhone();
        System.out.println("DEBUG");
//        Batch batch = new Batch(); // importing from other package
    }
}

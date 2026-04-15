package org.example.Inheritance;

public class User {
    String name;
    int age;

    public User() {
        System.out.println("User : Default constructor");
    }

    public User(String name, int age) {
        System.out.println("User : Parameterised constructor");
        this.name = name;
        this.age = age;
    }
}

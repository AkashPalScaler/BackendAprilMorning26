package org.example.Inheritance;

public class User {
    String name;
    int age;
    private int phone;

    public User() {
        System.out.println("User : Default constructor");
    }

    public User(String name, int age, int phone) {
        System.out.println("User : Parameterised constructor");
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

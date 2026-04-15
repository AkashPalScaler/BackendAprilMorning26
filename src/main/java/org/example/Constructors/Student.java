package org.example.Constructors;

public class Student {
    String name;
    int age;
    float psp;
    Batch batch;

    Student(){
        name = "Temp";
    }
    public Student(String name, int age, float psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batch = batch;
    }

    public Student(String name, int age, float psp, Batch batch) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batch = batch;
    }

    public Student(Student other){// Student this;
        System.out.println("Inside constructor "+ this);
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
//        this.batch = other.batch// Reference variable - whenever we copy variable like this it is a shallow copy
        this.batch = new Batch(other.batch);
        //return this; - unwritten line
    }

    void printHello(){
        System.out.println(this);
        System.out.println("Hello " + this.name);
    }
}
// This refers to the current instance/object which is invoking the methods
// object.function -> this refers to the object
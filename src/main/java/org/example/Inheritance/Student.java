package org.example.Inheritance;

public class Student extends User {
    float psp;

    public Student() {
        // (Unwritten)The fist line calls parent constructor - super()
//        super(); // Just like java does it - it always needs to be called on the first line of the constructor
        System.out.println("Student: Default constructor");
    }

    public Student(String name, int age, float psp) {
        super(name, age);
        this.psp = psp;
        System.out.println("Student: Parameterised constructor");
    }
}

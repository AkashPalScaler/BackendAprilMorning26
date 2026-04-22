package org.example.Inheritance;

public class Student extends User {
    float psp;
    private int iq;

    public Student() {
        // (Unwritten)The fist line calls parent constructor - super()
//        super(); // Just like java does it - it always needs to be called on the first line of the constructor
        System.out.println("Student: Default constructor");
    }

    public Student(String name, int age, float psp) {
        super(name, age, 12334);
//        this.name = "AKAHS"; //non-private properties can be accessed just like own property
        this.psp = psp;
        this.iq = 12;
//        this.phone = 1234; // Parent private properties are not inherited directly - they can be used by child through parent class contructors or functions
        this.setPhone(12334);
        System.out.println("Student: Parameterised constructor");
    }
}

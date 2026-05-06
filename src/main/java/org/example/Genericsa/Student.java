package org.example.Genericsa;

// Bad example for use of generics - student params are almost always the same
public class Student <T, V> {
    V roll;
    T name;
    T email;
    V count;
    Float psp;
}

// Student<String, Integer, Float> st = new Student()

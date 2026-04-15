package org.example.Constructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
//        Student s2 = new Student("Aka", 23, 10.0f);
//
//        Student s2ShallowCopy = s2;
//
//        Student s2Copy = new Student(s2);
//        System.out.println("After creation s2Copy" + s2Copy);
//        s2Copy.name = "AkaCopy";
//        System.out.println("S2 : " + s2);
//        s2.printHello();
//
//        System.out.println("S2Copy : " + s2Copy);
//        s2Copy.printHello();


        Batch batch = new Batch("AprMorningLLD26", 30);

        Student s3 = new Student("Akash", 26, 90.0f, batch);

        Student s3Copy = new Student(s3);

        System.out.println("DEBUG");
    }
}

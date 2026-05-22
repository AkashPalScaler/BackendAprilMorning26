package org.example.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        //Approach 1
//        StudentBuilder builder = new StudentBuilder();
//        builder.setName("Akash");
//        builder.setEmail("akash.pal@gmail.com");
//        builder.setAge(30);
//
//        Student s = new Student(builder);

        //Approach 2
//        StudentBuilder builder = Student.getBuilder();
//        builder.setName("Akash");
//        builder.setEmail("akash.pal@gmail.com");
//        builder.setAge(30);
//
//        Student s = new Student(builder);

        //Approach 3
//        StudentBuilder builder = Student.getBuilder()
//                .setName("Akash")
//                .setAge(30)
//                .setEmail("akas.pal@bp.com")
//                .setPsp(23.0f);
//
//        Student s = new Student(builder);

        //Approach 4

        Student s = Student.getBuilder() // -> Student builder object
                .setName("Akash")
                .setAge(30)
                .setEmail("akas.pal@bp.com")
                .setPsp(23.0f)
                .build();


        System.out.println("DEBUG");

    }
}

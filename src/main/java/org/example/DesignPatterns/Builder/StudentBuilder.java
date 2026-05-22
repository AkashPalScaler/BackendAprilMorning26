//package org.example.DesignPatterns.Builder;
//
//public class StudentBuilder {
//    private String name;
//    private String email;
//    private String branch;
//    private Integer age;
//    private Integer roll;
//    private Float psp;
//
//    private StudentBuilder(){};
//
//    public String getName() {
//        return name;
//    }
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public StudentBuilder setEmail(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//
//    public StudentBuilder setBranch(String branch) {
//        this.branch = branch;
//        return this;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public StudentBuilder setAge(Integer age) {
//        this.age = age;
//        return this;
//    }
//
//    public Integer getRoll() {
//        return roll;
//    }
//
//    public StudentBuilder setRoll(Integer roll) {
//        this.roll = roll;
//        return this;
//    }
//
//    public Float getPsp() {
//        return psp;
//    }
//
//    public StudentBuilder setPsp(Float psp) {
//        this.psp = psp;
//        return this;
//    }
//    public Student build(){
//        // Validations can be done here also
////        if(this.getEmail() == null){
////            throw new RuntimeException("Email is mandatory");
////        }
////        if(this.getAge() != null && this.getAge() < 18){
////            throw new RuntimeException("You need to be an adult");
////        }
//        return new Student(this);
//    }
//}

package org.example.DesignPatterns.Builder;

public class Student {
    private String name;
    private String email;
    private String branch;
    private Integer age;
    private Integer roll;
    private Float psp;

    public Student(StudentBuilder data) {
        if(data.getEmail() == null){
            throw new RuntimeException("Email is mandatory");
        }
        if(data.getAge() != null && data.getAge() < 18){
            throw new RuntimeException("You need to be an adult");
        }
        // As many validations

        this.name = data.getName();
        this.age= data.getAge();
        this.email = data.getEmail();
        this.psp = data.getPsp();
        this.branch = data.getBranch();

    }

    // Imagine all getters and setter are present

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private String email;
        private String branch;
        private Integer age;
        private Integer roll;
        private Float psp;

        private StudentBuilder(){};

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getBranch() {
            return branch;
        }

        public StudentBuilder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Integer getRoll() {
            return roll;
        }

        public StudentBuilder setRoll(Integer roll) {
            this.roll = roll;
            return this;
        }

        public Float getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(Float psp) {
            this.psp = psp;
            return this;
        }
        public Student build(){
            // Validations can be done here also
//        if(this.getEmail() == null){
//            throw new RuntimeException("Email is mandatory");
//        }
//        if(this.getAge() != null && this.getAge() < 18){
//            throw new RuntimeException("You need to be an adult");
//        }
            return new Student(this);
        }
    }
}

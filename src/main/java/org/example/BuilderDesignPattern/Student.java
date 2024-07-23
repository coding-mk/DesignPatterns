package org.example.BuilderDesignPattern;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int psp;
    private int rollNumber;
    private int gradYear;

    private Student (Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.psp = builder.psp;
        this.rollNumber = builder.rollNumber;
        this.gradYear = builder.gradYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPsp() {
        return psp;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getGradYear() {
        return gradYear;
    }

    public static Builder getBuilderInstance() {
        return new Builder();
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private int psp;
        private int rollNumber;
        private int gradYear;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}

package org.example.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilderInstance()
                                .setFirstName("Manish")
                                .setLastName("Kshetrapal")
                                .setAge(28)
                                .setPsp(90)
                                .setRollNumber(49)
                                .setGradYear(2019)
                                .build();

        System.out.println("My name is " +student.getFirstName() + " " + student.getLastName() + " I am " + student.getAge() + " years old.");
    }
}

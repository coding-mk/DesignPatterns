package org.example.SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student student1 = Student.getStudentInstance("First Student object");
        Student student2 = Student.getStudentInstance("Second Student object");
        System.out.println("End of code");
    }
}

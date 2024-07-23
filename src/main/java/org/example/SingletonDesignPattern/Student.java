package org.example.SingletonDesignPattern;

import com.sun.source.tree.SynchronizedTree;

public class Student {
    private String name;
    private int marks;
    private int rollNumber;
    private static Student instance;

    private Student(String message) {
        System.out.println(message);
    }

    public static synchronized Student getStudentInstance(String message) {
        if(instance == null){
            synchronized(Student.class) {
                if (instance == null) {
                    instance = new Student(message);
                }
            }
        }
        return instance;
    }

    public void clearInstance(){
        if(instance != null) {
            instance = null;
        }
    }
}

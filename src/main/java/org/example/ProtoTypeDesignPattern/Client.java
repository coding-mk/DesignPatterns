package org.example.ProtoTypeDesignPattern;

public class Client {

    private static void fillRegistry(StudentRegistry studentRegistry){
        Student apr23BeginnerBatch = new Student();
        apr23BeginnerBatch.setBatch("Apr23 Beginner Batch");
        apr23BeginnerBatch.setAveragePsp(70.0);

        IntelligentStudent apr23IntelligentStudent = new IntelligentStudent();
        apr23IntelligentStudent.setBatch("Apr23 Beginner Batch");
        apr23IntelligentStudent.setAveragePsp(70.0);
        apr23IntelligentStudent.setIq(160);

        Student apr24BeginnerBatch = new Student();
        apr23BeginnerBatch.setBatch("Apr24 Beginner Batch");
        apr23BeginnerBatch.setAveragePsp(75.0);


        studentRegistry.register("apr23Beginner", apr23BeginnerBatch);
        studentRegistry.register("apr23Intelligent", apr23IntelligentStudent);
        studentRegistry.register("apr24Beginner", apr24BeginnerBatch);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        fillRegistry(studentRegistry);

        Student aditya = studentRegistry.get("apr23Beginner").clone();
        aditya.setName("Aditya");
        aditya.setAge(27);
        aditya.setPsp(80.9);
        aditya.setCity("Nagpur");


        Student manish = studentRegistry.get("apr23Intelligent").clone();
        manish.setName("Manish");
        manish.setAge(27);
        manish.setPsp(85.9);
        manish.setCity("Nagpur");

        System.out.println("Debug");
    }
}

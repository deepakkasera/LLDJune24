package org.example.prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student june23BeginnerMonMorningStudent = new Student();
        june23BeginnerMonMorningStudent.setAvgBatchPsp(75.0);
        june23BeginnerMonMorningStudent.setBatch("June23 Beginner Monday Morning");

        studentRegistry.register("june23BeginnerMonMorningStudent",
                june23BeginnerMonMorningStudent);


        IntelligentStudent june23BeginnerMonMorningIntStudent = new IntelligentStudent();
        june23BeginnerMonMorningIntStudent.setAvgBatchPsp(75.0);
        june23BeginnerMonMorningIntStudent.setBatch("June23 Beginner Monday Morning");
        june23BeginnerMonMorningIntStudent.setIq(170);

        studentRegistry.register("intelligentStudent", june23BeginnerMonMorningIntStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student siddhesh = studentRegistry.get("june23BeginnerMonMorningStudent").clone();
        siddhesh.setName("Siddhesh");
        siddhesh.setAge(25);
        siddhesh.setPsp(90.0);

        Student alok = studentRegistry.get("intelligentStudent").clone();
        alok.setName("Alok");
        alok.setAge(26);
        alok.setPsp(99.99);

        System.out.println("DEBUG");
    }
}

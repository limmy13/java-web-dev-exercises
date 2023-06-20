package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {

        //instantiate student class
        Student student = new Student();

        //use setters to set values
        student.setName("Jasmine");
        student.setStudentId(12);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);
    //create a course with at least three fields

        System.out.println(student);

    }
}

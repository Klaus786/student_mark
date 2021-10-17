package za.ac.mycput.studentmarks.factory.student;

import za.ac.mycput.studentmarks.entity.student.Student;

public class StudentFactory {
    public static Student createStudent(  long studentNumber, String  studentName, long  studentPhoneNumber, String  studentEmail, String  studentPassword, String  studentAddress){
        return new Student.Builder().setStudentNumber(studentNumber)
                .setStudentName(studentName)
                .setStudentEmail(studentEmail)
                .setStudentAddress(studentAddress)
                .setStudentPassword(studentPassword).setStudentPhoneNumber(studentPhoneNumber).build();
    }
}

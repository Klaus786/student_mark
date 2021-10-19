package za.ac.mycput.studentmarks.factory.student;

import za.ac.mycput.studentmarks.entity.student.Student;

public class StudentFactory {
    public static Student createStudent( String  studentName, long  studentPhoneNumber, String  studentEmail, String  studentPassword, String  studentAddress){
        return new Student.Builder()
                .setStudentName(studentName)
                .setStudentEmail(studentEmail)
                .setStudentAddress(studentAddress)
                .setStudentPassword(studentPassword)
                .setStudentPhoneNumber(studentPhoneNumber)
                .build();
    }
}

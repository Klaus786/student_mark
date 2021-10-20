package za.ac.mycput.studentmarks.factory.student;
import za.ac.mycput.studentmarks.entity.student.Student;
/*
 * author:marco Mulondayi
 * 219049505
 *
 */
public class StudentFactory {
    public static Student createStudent(  long studentNumber, String  studentName, long  studentPhoneNumber, String  studentEmail, String  studentAddress){
        return new Student.Builder().setStudentNumber(studentNumber)
                .setStudentName(studentName)
                .setStudentEmail(studentEmail)
                .setStudentAddress(studentAddress)
                .setStudentPhoneNumber(studentPhoneNumber).build();
    }
}

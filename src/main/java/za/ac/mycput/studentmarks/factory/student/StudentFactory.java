package za.ac.mycput.studentmarks.factory.student;
import za.ac.mycput.studentmarks.entity.student.Student;
/*
 * author:marco Mulondayi
 * 219049505
 *
 */
public class StudentFactory {
    public static Student createStudent(int studentId,long studentNumber, String  studentName, long  studentPhoneNumber, String  studentEmail, String  studentPassword, String  studentAddress){
        return new Student.Builder()
                .setStudentId(studentId)
                .setStudentNumber(studentNumber)
                .setStudentName(studentName)
                .setStudentEmail(studentEmail)
                .setStudentAddress(studentAddress)
                .setStudentPassword(studentPassword)
                .setStudentPhoneNumber(studentPhoneNumber)
                .build();
    }
}

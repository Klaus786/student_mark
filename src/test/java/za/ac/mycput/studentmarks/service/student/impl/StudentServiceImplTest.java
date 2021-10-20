package za.ac.mycput.studentmarks.service.student.impl;

import org.junit.jupiter.api.Test;
import za.ac.mycput.studentmarks.entity.student.Student;
import za.ac.mycput.studentmarks.factory.student.StudentFactory;
import za.ac.mycput.studentmarks.service.student.StudentService;


import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    private static Student student= StudentFactory.createStudent(21904595,"marco",727408325,"tshimanaga@gmail.com","80 campground rondebosch");
    private static StudentService service;
//    @Test
//    public void create() {
//        Student created = service.create(student);
//        assertEquals(created, student);
//        System.out.println("Create: " + created);
//    }
}
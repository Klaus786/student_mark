package za.ac.mycput.studentmarks.factory;

import org.junit.jupiter.api.Test;
import za.ac.mycput.studentmarks.entity.student.Student;
import za.ac.mycput.studentmarks.factory.student.StudentFactory;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    @Test
    public void createStudent() {
        Student student1 = StudentFactory.createStudent(219049505,"marco",62,"tshimangamarco@gmail.com","123 arum");
        Student student2  = StudentFactory.createStudent(219049505,"marco",62,"tshimangamarco@gmail.com","123 arum");
        assertNotEquals(student1, student2);

    }

}
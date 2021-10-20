package za.ac.mycput.studentmarks.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.studentmarks.entity.student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
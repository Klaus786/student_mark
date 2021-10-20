package za.ac.mycput.studentmarks.repository.grade;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.mycput.studentmarks.entity.grade.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}

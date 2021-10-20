package za.ac.mycput.studentmarks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.studentmarks.entity.Marks;
@Repository
public interface MarkRepository extends JpaRepository<Marks, Integer> {
}

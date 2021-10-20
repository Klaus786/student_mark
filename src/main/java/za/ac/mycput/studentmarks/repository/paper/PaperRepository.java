package za.ac.mycput.studentmarks.repository.paper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.studentmarks.entity.paper.Paper;

@Repository
public interface PaperRepository extends JpaRepository<Paper, Integer> {
}

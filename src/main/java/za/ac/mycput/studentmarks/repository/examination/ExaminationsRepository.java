package za.ac.mycput.studentmarks.repository.examination;
/* student_mark.java
 Repository for Examinations

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.studentmarks.entity.examination.Examinations;

@Repository
public interface ExaminationsRepository  extends JpaRepository<Examinations, Integer> {
}

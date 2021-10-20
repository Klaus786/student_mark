/*
    Author: MMC Tshikuna (218319363)
    Date: 15 October 2021
 */

package za.ac.mycput.studentmarks.repository.subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.studentmarks.entity.subject.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}

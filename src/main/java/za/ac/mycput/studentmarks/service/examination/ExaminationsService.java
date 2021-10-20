package za.ac.mycput.studentmarks.service.examination;
/* student_mark.java
 Service for Examinations

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */

import za.ac.mycput.studentmarks.entity.examination.Examinations;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface ExaminationsService extends IService<Examinations, Integer> {
    Set<Examinations> getAll();
}


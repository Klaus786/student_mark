package za.ac.mycput.studentmarks.service.grade;

import za.ac.mycput.studentmarks.entity.grade.Grade;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface GradeService extends IService<Grade,Integer> {
    Set<Grade>getAll();
}

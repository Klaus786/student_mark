package za.ac.mycput.studentmarks.service.subject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import za.ac.mycput.studentmarks.entity.subject.Subject;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface SubjectService extends IService<Subject, Integer> {

    Set<Subject> getAll();
}

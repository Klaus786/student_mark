package za.ac.mycput.studentmarks.service.subject.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import za.ac.mycput.studentmarks.entity.subject.Subject;
import za.ac.mycput.studentmarks.repository.subject.SubjectRepository;
import za.ac.mycput.studentmarks.service.subject.SubjectService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository repository;
    private Integer subjectId;


    @Override
    public Subject create(Subject subject) {
        return this.repository.save(subject);

    }

    @Override
    public Subject read(Integer subjectId) {
        return this.repository.findById(subjectId).orElse(null);
    }

    @Override
    public Subject update(Subject subjectId) {
        return create (subjectId);
    }

  @Override
    public boolean delete(Integer subjectId) {
        repository.deleteById(subjectId);
        return!repository.existsById(subjectId);
    }

    @Override
    public Set<Subject> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}

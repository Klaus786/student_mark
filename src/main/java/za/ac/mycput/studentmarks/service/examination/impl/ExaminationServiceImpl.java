package za.ac.mycput.studentmarks.service.examination.impl;
/* student_mark.java
 Service Impl for Examinations

 Author: Siyamtanda Tonjeni (217107958)
 Date: 20 October 2021
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.studentmarks.entity.examination.Examinations;
import za.ac.mycput.studentmarks.repository.examination.ExaminationsRepository;
import za.ac.mycput.studentmarks.service.examination.ExaminationsService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ExaminationServiceImpl implements ExaminationsService {

    @Autowired
    private ExaminationsRepository repository;
    @Override
    public Examinations create(Examinations examinations){
        return this.repository.save(examinations);
    }

    @Override
    public Examinations read(Integer examId) {
        return this.repository.findById(examId).orElse(null);
    }

    @Override
    public Examinations update(Examinations examId) {
        return create(examId);
    }

    @Override
    public boolean delete(Integer examId) {
        repository.deleteById(examId);
        return !repository.existsById(examId);
    }

    @Override
    public Set<Examinations> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}


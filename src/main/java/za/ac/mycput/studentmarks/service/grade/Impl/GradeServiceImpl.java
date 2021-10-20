
/*
    Author: MMC Tshikuna (218319363)
    Date: 15 October 2021
 */package za.ac.mycput.studentmarks.service.grade.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.studentmarks.entity.grade.Grade;
import za.ac.mycput.studentmarks.repository.grade.GradeRepository;
import za.ac.mycput.studentmarks.service.grade.GradeService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeRepository repository;
    private Integer gradeId;


    @Override
    public Grade create(Grade grade) {
        return this.repository.save(grade);
    }

    @Override
    public Grade read(Integer gradeId) {
        return this.repository.findById(gradeId).orElse(null);
    }

    @Override
    public Grade update(Grade gradeId) {
        return create(gradeId);
    }

    @Override
    public boolean delete(Integer gradeId) {
        repository.deleteById(gradeId);
        return!repository.existsById(gradeId);
    }

    @Override
    public Set<Grade> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}

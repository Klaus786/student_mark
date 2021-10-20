package za.ac.mycput.studentmarks.service.paper.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.studentmarks.entity.paper.Paper;
import za.ac.mycput.studentmarks.repository.paper.PaperRepository;
import za.ac.mycput.studentmarks.service.paper.PaperService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperRepository repository;

    @Override
    public Paper create(Paper paper) {
        return this.repository.save(paper);
    }

    @Override
    public Paper read(Integer paper_Id) {
        return this.repository.findById(paper_Id).orElse(null);
    }

    @Override
    public Paper update(Paper paper_Id) {
        return create(paper_Id);
    }

    @Override
    public boolean delete(Integer paper_Id) {
        repository.deleteById(paper_Id);
        return !repository.existsById(paper_Id);
    }

    @Override
    public Set<Paper> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}

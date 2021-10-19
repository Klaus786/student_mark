package za.ac.mycput.studentmarks.service.mark.impl.impl;
/**
 * Klaus Traubner
 * 218009496
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.mycput.studentmarks.entity.Marks;
import za.ac.mycput.studentmarks.repository.MarkRepository;
import za.ac.mycput.studentmarks.service.mark.impl.MarkService;


import java.util.Set;
import java.util.stream.Collectors;
@Service
public class MarkServiceImpl implements MarkService {
    @Autowired
    private MarkRepository repository;
    @Override
    public Marks create(Marks mark){
        return this.repository.save(mark);
    }

    @Override
    public Marks read(Integer markId) {
        return this.repository.findById(markId).orElse(null);
    }

    @Override
    public Marks update(Marks markId) {
        return create(markId);
    }



    @Override
    public boolean delete(Integer markId) {
        repository.deleteById(markId);
        return !repository.existsById(markId);
    }




    @Override
    public Set<Marks> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}

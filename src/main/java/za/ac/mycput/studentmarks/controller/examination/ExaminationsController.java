package za.ac.mycput.studentmarks.controller.examination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.examination.Examinations;
import za.ac.mycput.studentmarks.service.examination.ExaminationsService;

import java.util.Set;

@RestController
public class ExaminationsController {

    @Autowired
    private ExaminationsService service;
    @GetMapping("examinations/list")
    public Set<Examinations> list(){
        return  service.getAll();
    }

    @PostMapping("examinations/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Examinations create(@RequestBody Examinations examinations){
        return service.create(examinations);
    }

    @DeleteMapping(value = "examinations/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }
    @PutMapping(value = "examinations/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) int id, @RequestBody Examinations examinations) {
        service.update(examinations);
    }

}

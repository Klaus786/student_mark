package za.ac.mycput.studentmarks.controller.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.grade.Grade;
import za.ac.mycput.studentmarks.entity.student.Student;
import za.ac.mycput.studentmarks.service.grade.GradeService;


import java.util.Set;

@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService service;
    @GetMapping("/list")
    public Set<Grade> list(){

        return service.getAll();
    }

    @PostMapping(value="/grade/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Grade create(@RequestBody Grade grade){ return service.create(grade);

    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {

        service.delete(id);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) int id, @RequestBody Grade grade) {
        // Preconditions.checkNotNull(resource);
        //service.getById(resource.getId()));
        service.update(grade);
    }
}

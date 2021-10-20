/*
    Author: MMC Tshikuna (218319363)
    Date: 15 October 2021
 */
package za.ac.mycput.studentmarks.controller.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.grade.Grade;
import za.ac.mycput.studentmarks.entity.subject.Subject;
import za.ac.mycput.studentmarks.service.subject.SubjectService;


import java.util.Set;

@RestController
@RequestMapping("/subject")

public class SubjectController {

    @Autowired
    private SubjectService service;
    @GetMapping("/list")
    public Set<Subject> list(){

        return service.getAll();
    }

    @PostMapping(value="/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Subject create(@RequestBody Subject subject){ return service.create(subject);

    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {

        service.delete(id);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) int id, @RequestBody Subject subject) {
        service.update(subject);
    }
}

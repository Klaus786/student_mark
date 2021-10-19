package za.ac.mycput.studentmarks.controller.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.student.Student;
import za.ac.mycput.studentmarks.service.student.StudentService;
import java.util.Set;


@RestController
public class StudentController {
    @Autowired
    private StudentService service;
    @GetMapping("student/list")
    public Set<Student> list(){
     return  service.getAll();
    }

    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@RequestBody Student student){
        return service.create(student);
    }

    @DeleteMapping(value = "student/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }
    @PutMapping(value = "student/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) int id, @RequestBody Student student) {
       // Preconditions.checkNotNull(resource);
        //service.getById(resource.getId()));
        service.update(student);
    }

}

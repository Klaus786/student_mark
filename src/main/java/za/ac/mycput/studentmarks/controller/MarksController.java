/**
 * Klaus Traubner
 * 218009496
 */
package za.ac.mycput.studentmarks.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.Marks;
import za.ac.mycput.studentmarks.service.mark.impl.MarkService;
;

import java.util.Set;
@RestController
public class MarksController {
    private final MarkService service;

    public MarksController(MarkService service) {
        this.service = service;
    }

    @GetMapping("marks/list")
    public Set<Marks> list() {return service.getAll();}

    @PostMapping("marks/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Marks Create(@RequestBody Marks marks) {return service.create(marks);}

    @DeleteMapping(value = "marks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {service.delete(id);}
    @PutMapping(value = "marks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") int id, @RequestBody Marks marks) {
        service.update(marks);
    }

}

package za.ac.mycput.studentmarks.controller.paper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.paper.Paper;
import za.ac.mycput.studentmarks.factory.paper.PaperFactory;
import za.ac.mycput.studentmarks.service.paper.PaperService;

import java.util.Set;


@RestController
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    private PaperService service;

    @GetMapping("paper/list")
    public Set<Paper> list() {
        return service.getAll();
    }

    @PostMapping("paper/create")
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Paper create(@RequestBody Paper paper) {
        Paper paper1 = PaperFactory.buildPaper(paper.getPaper_name(), paper.getPaper_subject(), paper.getPaper_time());
        return service.create(paper1);
    }

    @GetMapping("/paper{id}")
    public Paper read(@PathVariable Integer id) {
        return service.read(id);
    }

    @PutMapping(value = "paper/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") int id, @RequestBody Paper paper) {
        service.update(paper);
    }

    @DeleteMapping(value = "paper/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }
}


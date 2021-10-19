package za.ac.mycput.studentmarks.controller.results;


/*
    Author: Lwazi Tomson (218204493)
    Date: 10 October 2021
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.factory.results.ResultsFactory;
import za.ac.mycput.studentmarks.service.results.impl.ResultsServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/results")
public class ResultsController {

    @Autowired
    public ResultsServiceImpl resultsService;

    @RequestMapping(value="/create", method= RequestMethod.POST)
    public Results create(@RequestBody Results results){
        Results newResults = ResultsFactory.build(results.getResultId(),
                results.getResultDesc(),
                results.getResultType());

        return resultsService.create(newResults);
    }

    @GetMapping("/read{id}")
    public Results read(@PathVariable String id){
        return resultsService.read(id);
    }

    @PostMapping("/update")
    public Results update(@RequestBody Results results){
        return resultsService.update(results);
    }

    @PostMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return resultsService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Results> getAll(){
        return resultsService.getAll();
    }
}

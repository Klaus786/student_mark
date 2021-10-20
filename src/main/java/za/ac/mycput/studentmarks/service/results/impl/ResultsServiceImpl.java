package za.ac.mycput.studentmarks.service.results.impl;

/*
    Author: Lwazi Tomson (218204493)
    Date: 10 October 2021
 */
<<<<<<< HEAD
import org.springframework.stereotype.Service;
=======
import za.ac.mycput.studentmarks.entity.grade.Grade;
>>>>>>> 3a06c547baf29ad89aa5175950c4ae176a119222
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.repository.results.ResultsRepository;
import za.ac.mycput.studentmarks.service.results.IResultsService;

import java.util.Set;
@Service
public class ResultsServiceImpl implements IResultsService {

    private static ResultsServiceImpl resultsService = null;
    private ResultsRepository resultsRepository;

    public ResultsServiceImpl(){
        this.resultsRepository=ResultsRepository.getResultsRepository();
    }
    public static ResultsServiceImpl getResultsService(){
        if(resultsService==null){
            resultsService = new ResultsServiceImpl();
        }
        return resultsService;
    }

    @Override
    public Results create(Results results) {
        return this.resultsRepository.create(results);
    }

    @Override
    public Results read(String s) {
        return this.resultsRepository.read(s);
    }

    @Override
    public Results update(Results results) {
        return this.resultsRepository.update(results);
    }

    @Override
    public boolean delete(String s) {
        return this.resultsRepository.delete(s);
    }

    @Override
    public Set<Results> getAll() {
        return this.resultsRepository.getAll();
    }
}

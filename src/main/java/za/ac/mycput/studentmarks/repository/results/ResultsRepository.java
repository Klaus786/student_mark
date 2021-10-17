package za.ac.mycput.studentmarks.repository.results;


/*
    CRUD implementation for the Results.
    Author: Lwazi Tomson (218204493)
    Date: 10 October 2021
 */
import za.ac.mycput.studentmarks.entity.results.Results;

import java.util.HashSet;
import java.util.Set;


public class ResultsRepository implements IResultsRepository {

    private static ResultsRepository resultsRepository = null;
    private Set<Results> resultsDB = null;

    private ResultsRepository(){
        resultsDB = new HashSet<Results>();
    }

    public static ResultsRepository getResultsRepository() {
        if(resultsRepository == null) {
            resultsRepository = new ResultsRepository();
        }
        return resultsRepository;
    }

    @Override
    public Results create(Results results) {
        boolean success = resultsDB.add(results);
        if (!success){
            return null;
        }
        return results;
    }

    @Override
    public Results read(String resultId) {
        for (Results results : resultsDB)
            if (results.getResultId().equals(resultId)){
                return results;
            }
        return null;
    }

    @Override
    public Results update(Results results) {
        Results results1 = read(results.getResultId());
        if (results1 != null){
            resultsDB.remove(results1);
            resultsDB.add(results);
            return results;
        }
        return null;
    }

    @Override
    public boolean delete(String resultId) {
        Results resultsToDelete = read(resultId);
        if (resultsToDelete == null){
            return false;
        }
        resultsDB.remove(resultsToDelete);
        return true;
    }

    @Override
    public Set<Results> getAll() {
        return resultsDB;
    }
}
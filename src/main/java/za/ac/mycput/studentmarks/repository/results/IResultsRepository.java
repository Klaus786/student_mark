package za.ac.mycput.studentmarks.repository.results;

/*
    Repository for the Results.
    Author: Lwazi Tomson (218204493)
    Date: 10 October 2021
 */
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.repository.IRepository;

import java.util.Set;

public interface IResultsRepository extends IRepository<Results, String> {
    public Set<Results> getAll();
}

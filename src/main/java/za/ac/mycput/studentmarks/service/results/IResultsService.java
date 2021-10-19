package za.ac.mycput.studentmarks.service.results;

/* IUserService.java
    Author: Lunga Tshila (216282934)
    Date: 29 July 2021
 */
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface IResultsService extends IService<Results, String> {
    Set<Results> getAll();
}

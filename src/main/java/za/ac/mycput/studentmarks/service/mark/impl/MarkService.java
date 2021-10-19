/**
 * Klaus Traubner
 * 218009496
 */
package za.ac.mycput.studentmarks.service.mark.impl;

import za.ac.mycput.studentmarks.entity.Marks;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface MarkService extends IService<Marks, Integer> {
    Set<Marks> getAll();
}

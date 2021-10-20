package za.ac.mycput.studentmarks.service.paper;

import za.ac.mycput.studentmarks.entity.paper.Paper;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface PaperService extends IService<Paper, Integer> {
    Set<Paper> getAll();
}

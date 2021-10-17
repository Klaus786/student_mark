package za.ac.mycput.studentmarks.service.results.impl;


/* StudentMarksApplication.java
    Author: Lwazi Tomson (218204493)
    Date: 10 October 2021
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.factory.results.ResultsFactory;
import za.ac.mycput.studentmarks.service.results.IResultsService;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ResultsServiceImplTest {
    private static IResultsService service = ResultsServiceImpl.getResultsService();
    private static  Results results  = ResultsFactory.build(
            "01",
            "Pass",
            "B");

    @Test
    void a_create() {
        Results created = service.create(results);
        assertEquals(results.getResultId(), created.getResultId());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Results read = service.read(results.getResultId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Results updated = new Results.Builder().copy(results).setResultDesc("Fail").build();
        assertNotNull(service.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean _true = service.delete(results.getResultId());
        assertTrue(_true);
        System.out.println("Delete: " + true);
    }

    @Test
    void d_getAll() {
        System.out.println("Display All: \n" + service.getAll());
    }
}
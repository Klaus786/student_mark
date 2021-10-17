package za.ac.mycput.studentmarks.repository.results;

/*
    Interface repository for the Result6s.
    Author: Lwazi Tomson (218204493)
    Date: 10 October 2021
 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.factory.results.ResultsFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ResultsRepositoryTest {
    private static ResultsRepository repository = ResultsRepository.getResultsRepository();
    private static Results results = ResultsFactory.build(
            "01",
            "Pass",
            "B");

    @Test
    void a_create(){
        Results created = repository.create(results);
        assertEquals(created.getResultId(), results.getResultId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read(){
        Results read = repository.read(results.getResultId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update(){
        Results updated = new Results.Builder().copy(results).setResultDesc("Fail").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void e_delete(){
        boolean success = repository.delete(results.getResultId());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void d_getAll(){
        System.out.println("Show All: ");
        System.out.println(repository.getAll());
    }
}


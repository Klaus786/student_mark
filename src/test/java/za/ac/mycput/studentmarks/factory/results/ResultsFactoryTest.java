package za.ac.mycput.studentmarks.factory.results;
/* Student-Marks-Project.java
 Entity for the Results
 Author: Lwazi Tomson (218204493)
 Date: 10 October 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.factory.results.ResultsFactory;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ResultsFactoryTest {

    @Test
    void testNullValues() {

        Results p = ResultsFactory.build(
                "01",
                null,
                "B");

        System.out.println(p);
        String resultId = UUID.randomUUID().toString();
        p = new Results.Builder()
                .setResultId(resultId)
                .setResultDesc("Pass")
                .setResultType("B")
                .build();
        System.out.println(p);

        assertNotNull(p);
    }

    @Test
    void testNotNullValues() {

        Results p1 = ResultsFactory.build(
                "02",
                "Distinction Pass",
                "A");
        System.out.println(p1);

        String resultId = UUID.randomUUID().toString();
        Results p2 = new Results.Builder()
                .setResultId("02")
                .setResultDesc("Distinction Pass")
                .setResultType("A")
                .build();
        System.out.println(p2);

        assertNotNull(p1);
        assertNotNull(p2);

    }
}

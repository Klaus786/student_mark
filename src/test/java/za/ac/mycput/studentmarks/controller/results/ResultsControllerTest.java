package za.ac.mycput.studentmarks.controller.results;


/*
    Author: Lwazi Tomson (218204493)
    Date: 15 July 2021
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.mycput.studentmarks.entity.results.Results;
import za.ac.mycput.studentmarks.factory.results.ResultsFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class ResultsControllerTest {

    private static Results results  = ResultsFactory.build(
            "01",
            "Pass",
            "B");
    @Autowired
    private TestRestTemplate template;
    private final String BASE_URL = "http://localhost:8081/results";

    @Test
    void a_create() {
        String url = BASE_URL + "/create";
        ResponseEntity<Results> postResultsResponse = template.postForEntity(url, results, Results.class);
        assertNotNull(postResultsResponse);
        assertNotNull(postResultsResponse.getBody());
        assertEquals(postResultsResponse.getStatusCode(), HttpStatus.OK);
        results = postResultsResponse.getBody();
        System.out.println("Stored data" + results);
        assertEquals(results.getResultId(), postResultsResponse.getBody().getResultId());
    }

    @Test
    void b_read() {
        String url = BASE_URL + "/read/" + results.getResultId();
        System.out.println("URL: " + url);
        ResponseEntity<Results> response = template.getForEntity(url, Results.class);
        assertEquals(results.getResultId(), response.getBody().getResultId());
    }

    @Test
    void c_update() {
        Results updated = new Results.Builder().copy(results).setResultId("01").build();
        String url = BASE_URL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updated);
        ResponseEntity<Results> response = template.postForEntity(url, updated, Results.class);
        assertNotNull(response.getBody());
    }

    @Test
    void e_delete() {
        String url = BASE_URL + "/delete/" + results.getResultId();
        System.out.println("URL: " + url);;
        template.delete(url);
    }

    @Test
    void d_getAll() {
        String url = BASE_URL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("View All:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}
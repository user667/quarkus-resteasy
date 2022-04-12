package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testGetHelloEndpoint() throws URISyntaxException {
        given()
                .proxy(new URI("http://localhost:8081"))
                .when().get("/hello/g")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

    @Test
    public void testPostHelloEndpoint() throws URISyntaxException {
        given()
                .proxy(new URI("http://localhost:8081"))
                .when().post("/hello/p")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

    @Test
    public void testGetHealthEndpoint() throws URISyntaxException {
        given()
                .proxy(new URI("http://localhost:8081"))
                .when().get("/q/health")
                .then()
                .statusCode(200);
    }

    @Test
    public void testGetMetricsEndpoint() throws URISyntaxException {
        given()
                .proxy(new URI("http://localhost:8081"))
                .when().get("/q/metrics")
                .then()
                .statusCode(200);
    }
}

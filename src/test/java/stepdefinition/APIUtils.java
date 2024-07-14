package stepdefinition;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIUtils {

    private static final String BASE_URI = "http://jsonplaceholder.typicode.com/";

    public static Response getUsers() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .get("/users");
    }

    public static Response getTodosByUserId(int userId) {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .queryParam("userId", userId)
                .get("/todos");
    }

}


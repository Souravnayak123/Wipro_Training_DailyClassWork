package Users;

//package users;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import Base.BaseTest;

public class GetUsersTest extends BaseTest {

    // Get Single User
    @Test(priority = 1)
    public void getSingleUser() {

        given()
        .when()
            .get("/users/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .log().all();

        System.out.println("Get Single User API Done");
    }

    // Search User
    @Test(priority = 2)
    public void searchUser() {

        given()
            .queryParam("q", "John")
        .when()
            .get("/users/search")
        .then()
            .statusCode(200)
            .body("users.size()", greaterThan(0))
            .log().all();

        System.out.println("Search User API Done");
    }

    // Filter User - Return only 2 users
    @Test(priority = 3)
    public void filterUsers() {

        given()
            .queryParam("limit", 2)
        .when()
            .get("/users")
        .then()
            .statusCode(200)
            .body("users.size()", equalTo(2))
            .log().all();

        System.out.println("Filter User API Done - Returned 2 Users");
    }
}
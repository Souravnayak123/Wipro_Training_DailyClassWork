package Users;


import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.restassured.http.ContentType;

public class AddUserTest extends BaseTest {

    @Test(priority = 4)
    public void addUser() {

        JSONObject data = new JSONObject();

        data.put("firstName", "Sourav");
        data.put("lastName", "Nayak");
        data.put("age", 23);

        given()
            .contentType(ContentType.JSON)
            .body(data.toString())
        .when()
            .post("/users/add")
        .then()
            .statusCode(201)
            .log().all();

        System.out.println("Add User API Done - User Added Successfully");
    }
}
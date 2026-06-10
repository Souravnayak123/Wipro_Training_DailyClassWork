package Users;


import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.restassured.http.ContentType;

public class UpdateUserTest extends BaseTest {

    @Test(priority = 5)
    public void updateUser() {

        JSONObject data = new JSONObject();

        data.put("firstName", "Gourav");

        given()
            .contentType(ContentType.JSON)
            .body(data.toString())
        .when()
            .put("/users/1")
        .then()
            .statusCode(200)
            .log().all();
    }
}
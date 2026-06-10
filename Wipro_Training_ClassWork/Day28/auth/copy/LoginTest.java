package auth.copy;


import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import Base.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginTest extends BaseTest {

    public static String token;
    public static String refreshToken;

    @Test(priority = 8)
    public void loginUser() {

        JSONObject data = new JSONObject();

        data.put("username", "emilys");
        data.put("password", "emilyspass");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(data.toString())
            .when()
                .post("/auth/login");

        response.then().statusCode(200);

        token = response.path("accessToken");
        refreshToken = response.path("refreshToken");

        System.out.println(token);
        System.out.println(refreshToken);
    }
}
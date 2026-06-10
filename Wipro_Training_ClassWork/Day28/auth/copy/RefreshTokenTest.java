package auth.copy;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import Base.BaseTest;
import io.restassured.http.ContentType;

public class RefreshTokenTest extends BaseTest {

    @Test(priority = 10)
    public void refreshToken() {

        given()
            .contentType(ContentType.JSON)
            .body("{\"refreshToken\":\"" + LoginTest.refreshToken + "\"}")

        .when()
            .post("/auth/refresh")

        .then()
            .statusCode(200)
            .log().all();
    }
}
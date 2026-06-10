package auth.copy;



import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import Base.BaseTest;

public class CurrentUserTest extends BaseTest {

    @Test(priority = 9)
    public void currentUser() {

        given()
            .header("Authorization",
                    "Bearer " + LoginTest.token)
        .when()
            .get("/auth/me")
        .then()
            .statusCode(200)
            .log().all();
    }
}
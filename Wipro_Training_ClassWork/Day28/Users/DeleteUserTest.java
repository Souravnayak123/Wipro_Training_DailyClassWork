package Users;



import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import Base.BaseTest;

public class DeleteUserTest extends BaseTest {

    @Test(priority = 6)
    public void deleteUser() {

        given()
        .when()
            .delete("/users/2")
        .then()
            .statusCode(200)
            .log().all();
    }
}
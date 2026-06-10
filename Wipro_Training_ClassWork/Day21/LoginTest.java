package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver driver;

    // Constructor
    LoginTest(WebDriver driver) {
        this.driver = driver;
    }

    // Login Method
    public void loginUser() {

        driver.findElement(By.name("username"))
              .sendKeys("souravn21");

        driver.findElement(By.name("password"))
              .sendKeys("soura@123");

        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        System.out.println("Login Successful");
    }
}

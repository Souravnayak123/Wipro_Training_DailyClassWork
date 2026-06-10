package Day21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupTest {

    WebDriver driver;

    // Constructor
    SignupTest(WebDriver driver) {
        this.driver = driver;
    }

    // Signup Method
    public void registerUser() {

        driver.findElement(By.id("customer.firstName"))
              .sendKeys("Sourav");

        driver.findElement(By.id("customer.lastName"))
              .sendKeys("Nayak");

        driver.findElement(By.id("customer.address.street"))
              .sendKeys("Patia Station");

        driver.findElement(By.id("customer.address.city"))
              .sendKeys("Bhubaneswar");

        driver.findElement(By.id("customer.address.state"))
              .sendKeys("Odisha");

        driver.findElement(By.id("customer.address.zipCode"))
              .sendKeys("751024");

        driver.findElement(By.id("customer.phoneNumber"))
              .sendKeys("9556931061");

        driver.findElement(By.id("customer.ssn"))
              .sendKeys("5567");

        driver.findElement(By.id("customer.username"))
              .sendKeys("souravn21");

        driver.findElement(By.id("customer.password"))
              .sendKeys("soura@123");

        driver.findElement(By.id("repeatedPassword"))
              .sendKeys("soura@123");

        driver.findElement(By.xpath("//input[@value='Register']"))
              .click();

        System.out.println("Signup Successful");
    }
}

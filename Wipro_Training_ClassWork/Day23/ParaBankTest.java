package Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParaBankTest {

    WebDriver driver;

    String username = "souravn12";
    String password = "sourav@07";

    @BeforeClass
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    // Register Customer
    @Test(priority = 1)
    public void registerTest() {

        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("customer.firstName"))
                .sendKeys("Sourav");

        driver.findElement(By.id("customer.lastName"))
                .sendKeys("Nayak");

        driver.findElement(By.id("customer.address.street"))
                .sendKeys("Patia");

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
                .sendKeys(username);

        driver.findElement(By.id("customer.password"))
                .sendKeys(password);

        driver.findElement(By.id("repeatedPassword"))
                .sendKeys(password);

        driver.findElement(
                By.xpath("//input[@value='Register']"))
                .click();

        // Check if already registered
        if (driver.getPageSource()
                .contains("This username already exists")) {

            System.out.println(
                    "Registration already done, Go to Login");

        } else {

            Assert.assertTrue(driver.getPageSource()
                    .contains("Welcome"));

            System.out.println(
                    "Registration Successful");

            driver.findElement(By.linkText("Log Out"))
                    .click();
        }
    }

    // Login
    @Test(priority = 2)
    public void loginTest() {

        driver.findElement(By.name("username"))
                .sendKeys(username);

        driver.findElement(By.name("password"))
                .sendKeys(password);

        driver.findElement(
                By.xpath("//input[@value='Log In']"))
                .click();

        Assert.assertTrue(driver.getCurrentUrl()
                .contains("overview"));

        System.out.println("Login Successful");
    }

    // Open New Account
    @Test(priority = 3)
    public void openNewAccountTest() {

        driver.findElement(
                By.linkText("Open New Account"))
                .click();

        driver.findElement(
                By.xpath("//input[@value='Open New Account']"))
                .click();

        Assert.assertTrue(driver.getPageSource()
                .contains("Account Opened"));

        System.out.println(
                "Open New Account Successful");
    }

    // Transfer Funds
    @Test(priority = 4)
    public void transferFundsTest() {

        driver.findElement(
                By.linkText("Transfer Funds"))
                .click();

        driver.findElement(By.id("amount"))
                .sendKeys("100");

        driver.findElement(
                By.xpath("//input[@value='Transfer']"))
                .click();

        Assert.assertTrue(driver.getPageSource()
                .contains("Transfer Complete"));

        System.out.println(
                "Transfer Funds Successful");
    }

    // Logout
    @Test(priority = 5)
    public void logoutTest() {

        driver.findElement(By.linkText("Log Out"))
                .click();

        System.out.println("Logout Successful");
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
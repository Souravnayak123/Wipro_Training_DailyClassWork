package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
              .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://parabank.parasoft.com/parabank/register.htm");

         //Create object of Signup class
        SignupTest signup = new SignupTest(driver);

        signup.registerUser();

        Thread.sleep(3000);

        // Logout after signup
        driver.findElement(By.xpath("//div[@id='leftPanel']//li[8]/a")).click();

        Thread.sleep(2000);

        

        // Create object of Login class
        LoginTest login = new LoginTest(driver);

        login.loginUser();
        
        Thread.sleep(3000);
        
     // Open Savings Account
        OpenSavingsAccount account = new OpenSavingsAccount(driver);

        account.openSavingsAccount();

        Thread.sleep(4000);

        // Fund Transfer
        FundTransfer fund = new FundTransfer(driver);
        fund.transferFund();


        Thread.sleep(5000);

//        driver.quit();
    }
}

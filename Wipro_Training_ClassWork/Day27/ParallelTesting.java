package Day27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting 
{

    @Test
    public void testGoogle() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        System.out.println("Google Opened - " + Thread.currentThread().getId());

        driver.quit();
    }

    @Test
    public void testFacebook() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        System.out.println("Facebook Opened - " + Thread.currentThread().getId());

        driver.quit();
    }
}
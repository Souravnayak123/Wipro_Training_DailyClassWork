package Day22;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    // Open Browser
    public void openBrowser() {

        driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();
    }

    // Close Browser
    public void closeBrowser() {

        driver.quit();
    }
}
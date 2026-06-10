
package Day24;
//import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertButton 
{
    public static void main(String[] args) throws InterruptedException 
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(5000);

        

        Alert alt = driver.switchTo().alert();

        System.out.println(alt.getText());

        alt.accept();

        driver.quit();
    }
}
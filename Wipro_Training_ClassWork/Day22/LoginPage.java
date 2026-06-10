package Day22;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    public void login() throws InterruptedException {

        // Wait for page load
        Thread.sleep(3000);

        // Locate Login Button
        WebElement login =
                driver.findElement(By.xpath("//a[text()='Login']"));

        // JavaScriptExecutor
        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        // Click Login Button
        js.executeScript("arguments[0].click();", login);

        // Wait
        Thread.sleep(3000);

        // Enter Mobile Number
        driver.findElement(
                By.xpath("//input[contains(@class,'c3Bd2c')]"))
              .sendKeys("9556931061");
        driver.findElement(
                By.className("dSM5Ub")).click();
        // Wait
        
        Thread.sleep(2000);
    }
}

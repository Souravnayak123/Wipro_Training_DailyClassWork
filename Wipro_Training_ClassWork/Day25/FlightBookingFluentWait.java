package Day25;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.function.Function;

public class FlightBookingFluentWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://phptravels.net/flights");

        // Search Button
        driver.findElement(By.id("flights-search"))
                .click();

        // Fluent Wait
        FluentWait<WebDriver> wait =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(30))
                        .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(Exception.class);

        // Wait for Flight Result List
        WebElement results =
                wait.until(new Function<WebDriver, WebElement>() {

                    public WebElement apply(WebDriver driver) {

                        return driver.findElement(
                                By.className("theme-search-results-item"));
                    }
                });

        System.out.println("Flight Results Displayed");

        driver.quit();
    }
}
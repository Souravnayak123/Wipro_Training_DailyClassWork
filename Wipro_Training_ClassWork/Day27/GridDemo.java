package Day27;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

    public static void main(String[] args) {

        try {

            ChromeOptions options = new ChromeOptions();

            WebDriver driver = new RemoteWebDriver(
                    new URL("http://192.168.1.5:4444"),
                    options);

            driver.get("https://www.google.com");

            System.out.println(driver.getTitle());

            Thread.sleep(5000);

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package Day22;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class CartPage extends BaseClass {

    public void addToCart() throws InterruptedException {

        // Get all tabs/windows
        ArrayList<String> tabs =
                new ArrayList<>(driver.getWindowHandles());

        // Switch to second tab
        driver.switchTo().window(tabs.get(1));

        // Wait
        Thread.sleep(3000);

        // Click Add to cart Button
        driver.findElement(
                By.xpath("//button[text()='Add to cart']"))
              .click();

        // Wait
        Thread.sleep(3000);
    }
}
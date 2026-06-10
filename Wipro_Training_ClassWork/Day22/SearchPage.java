package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchPage extends BaseClass {

    public void searchProduct() throws InterruptedException {

    	// Search Product
    	driver.findElement(By.name("q"))
    	      .sendKeys("Smart Watch", Keys.ENTER);


        // Wait
        Thread.sleep(2000);

        // Click Search Button
        driver.findElement(By.xpath("//button[@type='submit']"))
              .click();

        // Wait
        Thread.sleep(4000);

        driver.findElement(
                By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a"))
              .click();
       

        // Wait
        Thread.sleep(4000);
    }
}
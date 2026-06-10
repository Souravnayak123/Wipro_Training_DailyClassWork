package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FundTransfer {

    WebDriver driver;

    // Constructor
    FundTransfer(WebDriver driver) {
        this.driver = driver;
    }

    // Fund Transfer Method
    public void transferFund() {

        driver.findElement(By.linkText("Transfer Funds")).click();

        driver.findElement(By.id("amount"))
              .sendKeys("300");

        Select fromAcc = new Select(driver.findElement(By.id("fromAccountId")));
        fromAcc.selectByIndex(0);

        Select toAcc = new Select(driver.findElement(By.id("toAccountId")));
        toAcc.selectByIndex(1);

        driver.findElement(By.xpath("//input[@value='Transfer']"))
              .click();

        System.out.println("Fund Transfer Successful");
    }
}

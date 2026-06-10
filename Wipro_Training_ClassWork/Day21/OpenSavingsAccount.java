package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenSavingsAccount {

    WebDriver driver;

    // Constructor
    OpenSavingsAccount(WebDriver driver) {
        this.driver = driver;
    }

    // Method to Open Savings Account
    public void openSavingsAccount() {

        // Click Open New Account
        driver.findElement(By.linkText("Open New Account")).click();

        // Select SAVINGS account type
        Select accountType = new Select(driver.findElement(By.id("type")));
        accountType.selectByVisibleText("SAVINGS");

        // Select existing account
        Select fromAccount = new Select(driver.findElement(By.id("fromAccountId")));
        fromAccount.selectByIndex(0);

        // Click Open New Account button
        driver.findElement(By.xpath("//input[@value='Open New Account']"))
              .click();

        System.out.println("Savings Account Opened Successfully");
    }
}

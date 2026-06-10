package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingControls {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element;
		element=driver.findElement(By.id("oldSelectMenu"));
		Select select=new Select(element);
		select.selectByVisibleText("Voilet");
		System.out.println("Value is inserted");
		driver.quit();
		
		

	}

}

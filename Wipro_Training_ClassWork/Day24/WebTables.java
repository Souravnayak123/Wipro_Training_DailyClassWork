package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/webtables");
	driver.manage().window().maximize();
	driver.findElement(By.id("addNewRecordButton")).click();
	System.out.println("Data add in the Registration Form");
	driver.findElement(By.id("firstName")).sendKeys("Sourav");
	Thread.sleep(2000);
	driver.findElement(By.id("lastName")).sendKeys("Nayak");
	Thread.sleep(2000);
	driver.findElement(By.id("userEmail")).sendKeys("souravn2003@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("age")).sendKeys("23");
	Thread.sleep(2000);
	driver.findElement(By.id("salary")).sendKeys("22000");
	Thread.sleep(2000);
	driver.findElement(By.id("department")).sendKeys("Computer Scienece");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	driver.quit();
	
	
	}
	
	

}

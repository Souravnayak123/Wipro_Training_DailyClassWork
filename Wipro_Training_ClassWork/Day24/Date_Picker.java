package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Date_Picker {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/date-picker");
		
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("datePickerMonthYearInput")).sendKeys("08/16/2025");
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("dateAndTimePickerInput")).sendKeys("August 16, 2026 10:30 AM");
		
		Thread.sleep(6000);
		
		driver.quit();		
		}
 
}
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestcase {

	public static void main(String[] args) {
		
		// Later if you want to switch to Firefox
		// driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.className("tHlp8d")).click();
		
		if(driver.getTitle().equalsIgnoreCase("Google"))
		{
			System.out.println("Title is as expected. Test Passed");
		}	
		else
		{
			System.out.println("Title is not as expected. Test Failed");
		}
		
		
		driver.findElement(By.className("gLFyf")).sendKeys("Selenium");
		
		//driver.sendKeys(Keys.ENTER).perform();
		
		
		
		//driver.quit();
		//driver.close();
	}

}

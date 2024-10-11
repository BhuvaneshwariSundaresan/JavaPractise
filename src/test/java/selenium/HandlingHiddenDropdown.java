package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		
		//navigating to PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//clicking on dropdown
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		
		//selecting one option from dropdown list
		driver.findElement(By.xpath("//span[normalize-space()='Content Specialist']")).click();
		
		//counting the options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(options.size());
		
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
		
		
		
		
		
		
	}

}

package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		 * //Example1 - Select dropdown driver.get(
		 * "https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/"
		 * ); driver.manage().window().maximize();
		 * 
		 * //clicking on the country dropdown WebElement
		 * drpdwncountry=driver.findElement(By.id("country-list"));
		 * 
		 * //identifying the options List<WebElement>
		 * countryOptions=driver.findElements(By.xpath(
		 * "//select[@id='country-list']/option"));
		 * 
		 * //counting and printing all the options
		 * System.out.println("Number of country options:"+countryOptions.size());
		 * for(WebElement e:countryOptions) { System.out.println(e.getText()); }
		 * 
		 * //select one option Select country=new Select(drpdwncountry);
		 * 
		 * country.selectByVisibleText("USA");
		 * 
		 * driver.quit();
		 */
		
		//Example 2 - Hidden dropdown
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		
		//navigating to PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]")).click();
		
		List<WebElement> drpdwnEmploymentStatus=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(drpdwnEmploymentStatus.size());
		for(WebElement e:drpdwnEmploymentStatus)
		{
			String empStatus=e.getText();
			System.out.println(empStatus);
		}
		
		driver.findElement(By.xpath("//div[@role='listbox']//span[normalize-space()='Full-Time Contract']")).click();
		
	}
	

}

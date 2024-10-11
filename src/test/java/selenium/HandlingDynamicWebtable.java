package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login
		WebElement txtUsername=driver.findElement(By.name("username"));
		txtUsername.clear();
		txtUsername.sendKeys("demo");
		
		WebElement txtPassword=driver.findElement(By.name("password"));
		txtPassword.clear();
		txtPassword.sendKeys("demo");
		driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
		
		//navigating to Customers
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.xpath("a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[normalize-space()='Customers']")).click();
		
		String pageElement=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		int page=Integer.parseInt(pageElement.substring(pageElement.indexOf("(")+1, pageElement.indexOf("Pages")-1));
		
		for(int i=1;i<=5;i++)
		{
			if(i>1)
			{
				WebElement active_element=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='"+i+"']"));
				active_element.click();
			}
			
			
			}
		}
		
		
		
		
		
		
		
		

	}


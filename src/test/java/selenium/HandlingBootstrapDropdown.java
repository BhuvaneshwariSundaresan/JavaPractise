package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBootstrapDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@mode='primary']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown')]")).click();
		
		//selecting single option
		driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		
		//capturing the options and counting them
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		
		//printing options from dropdown
		for(WebElement ele:options)
		{
			System.out.println(ele.getText());
		}
		
		//selecting multiple options
		for(WebElement ele:options)
		{
			String op=ele.getText();
			if(op.equals("Java") || op.equals("Python"))
			{
				ele.click();
			}
		}

	}

}

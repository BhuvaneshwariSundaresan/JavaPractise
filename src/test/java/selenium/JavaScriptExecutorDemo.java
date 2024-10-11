package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Welcome");
		
		//passing text into textbox using javascript- alternative approach to achieve sendkeys
		WebElement txtboxName=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //upcasting - object(driver) of child class(ChromeDriver) stored in variable of parent(JavascriptExecutor) interface 
		js.executeScript("arguments[0].setAttribute('value','John')", txtboxName);
		
		//clicking on element 
		WebElement radioGender=driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click();", radioGender);
		
		
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//Xpath with one attribute
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Tablet");
		
		//Xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tablet");
				
		//Xpath with and/or attribute
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Tablet");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Phone");
		
		//Xpath with innertext
		
		//boolean display = driver.findElement(By.xpath("//a[text()='MacBook']")).isDisplayed();
		//System.out.println(display);

		//xpath with contains
		//driver.findElement(By.xpath("//input[contains(@name,'sea')]")).sendKeys("charger");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'sea')]")).sendKeys("charger");
		
		//xpath with start-with
	}
}

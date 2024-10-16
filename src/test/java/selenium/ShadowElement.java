package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		*driver.get("https://dev.automationtesting.in/shadow-dom");
	    *driver.manage().window().maximize();
		 * SearchContext
		 * shadow=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		 * Thread.sleep(1000); shadow.findElement(By.cssSelector("#shadow-element"));
		 * 
		 * SearchContext
		 * shadow0=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		 * Thread.sleep(1000); SearchContext
		 * shadow1=shadow0.findElement(By.cssSelector("#inner-shadow-dom")).
		 * getShadowRoot(); Thread.sleep(1000);
		 * shadow1.findElement(By.cssSelector("#nest-shadow-element"));
		 */

		
		driver.get("https://books-pwakit.appspot.com/");
	    driver.manage().window().maximize();
	    
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Hello");
	}

}

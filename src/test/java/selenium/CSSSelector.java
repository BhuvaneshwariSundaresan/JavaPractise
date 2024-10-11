package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag and id - tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("phone");
		//tag is optional we can just use the id but # is mandatory
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("phone"); 
		
		//tag and class - tag.class
		driver.findElement(By.cssSelector("button.button-1")).click();
		
		//tag and attribute - tag[attribute='value']
        WebElement currencyelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='customerCurrency']")));
        if (currencyelement != null) {
            System.out.println("Currency Element is visible.");
        }
        
        // tag, class and attribute
        WebElement searchelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.search-text[name='q']")));
        if (searchelement != null) {
            System.out.println("Search Element is visible.");
        }

		driver.close();
		
		

	}

}

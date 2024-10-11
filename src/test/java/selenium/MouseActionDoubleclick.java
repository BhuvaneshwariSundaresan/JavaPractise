package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDoubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement accept=driver.findElement(By.xpath("//div[@id='accept-choices']"));
		
		Actions act=new Actions(driver);
		
		act.click(accept).perform();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement txtField1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement txtField2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btnDoubleClick=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		txtField1.clear();
		txtField1.sendKeys("Selenium");
		
		//Double Click
		act.doubleClick(btnDoubleClick).perform();
		
		//validating Field2
		String copiedValue=txtField2.getAttribute("value");
		
		if(copiedValue.equals("Selenium"))
		{
			System.out.println("Successfully copied value");
		}
		else
		{
			System.out.println("Value not copied properly");
		}

	}

}

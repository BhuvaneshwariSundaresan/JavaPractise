package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);	//switching to frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();	//switching back to page
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		//inner iframe in frame 3
		driver.switchTo().frame(0);	//switcihng to inner i frame using index. since there is only one inner frame in frame 3 we are using 0 index
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
			
		driver.switchTo().defaultContent();
		
		//frame5
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Selenium");
		WebElement link=driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
	        
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed());
				
		
		driver.quit();
	}
	
	

}

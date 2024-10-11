package selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1. Full page screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		File saveScreenshot1=new File(System.getProperty("user.dir")+"\\Screenshot\\image1.png");
		screenshot.renameTo(saveScreenshot1);
		
		//FileUtils.copyFile(screenshot, saveScreenshot);
		
		//2. screenshot of specific area (introduced in Selenium 4)
		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File specificScreenshot=section.getScreenshotAs(OutputType.FILE);
		File saveScreenshot2=new File(System.getProperty("user.dir")+"\\Screenshot\\image2.png");
		specificScreenshot.renameTo(saveScreenshot2);
		
		//3. screenshot of specific element
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File logoScreenshot=logo.getScreenshotAs(OutputType.FILE);
		File saveScreenshot3=new File(System.getProperty("user.dir")+"\\Screenshot\\image3.png");
		logoScreenshot.renameTo(saveScreenshot3);
		
		driver.quit();
	}

}

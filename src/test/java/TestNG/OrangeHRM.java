package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	WebDriver driver;
	
	@Test(priority=1)
	  public void openApp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	  }
	  
	  @Test(priority=2)
	  void testLogo() throws InterruptedException {
		  Thread.sleep(3000);
		  Boolean imgStatus=driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")).isDisplayed();
		  System.out.println("Image Display Status:"+imgStatus);
	  }
	  
	  @Test(priority=3)
	  void Login() {
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  }
	  
	  @Test(priority=4)
	  void closeApp() {
		  driver.quit();
	  }
}

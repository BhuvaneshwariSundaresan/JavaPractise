package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		//1. Normal alert with OK button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		Alert myAlert=driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
		
		//2. Confirmation alert with OK and Cancel button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert mycAlert=driver.switchTo().alert();
		System.out.println(mycAlert.getText());
		mycAlert.dismiss();
		
		//3. Prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert mypAlert=driver.switchTo().alert();
		System.out.println(mypAlert.getText());
		mypAlert.sendKeys("Test");
		mypAlert.accept();
		
		driver.quit();

	}

}

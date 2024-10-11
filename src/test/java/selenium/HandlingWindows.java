package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//https://testautomationpractice.blogspot.com/
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		//Approach 1 - If the number of windows is less
		/*
		List<String> idsList=new ArrayList(windowIds);
		
		String parentId=idsList.get(0);
		String childId=idsList.get(1);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		*/
		
		//Approach 2 - If there are more windows
		
		for(String winId:windowIds)
		{
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(driver.getCurrentUrl());
		}

		driver.quit();
	}

}

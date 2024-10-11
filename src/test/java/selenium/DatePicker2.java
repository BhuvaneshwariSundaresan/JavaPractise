package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		String month="June";
		String date="19";
		String year="2026";
		Thread.sleep(3);
		driver.switchTo().frame(0);
		Thread.sleep(3);
		boolean status = driver.findElement(By.xpath("//span[@class='icon_calendar' and @role='button']")).isDisplayed();
		System.out.println(status);
		driver.findElement(By.xpath("//span[@class='icon_calendar' and @role='button']")).click();
		Thread.sleep(3);
		
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			System.out.println(currentMonth+" "+month);
			if(currentMonth.equals(month))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		WebElement drpdwnYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select currentYear=new Select(drpdwnYear);
		currentYear.selectByVisibleText(year);
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement e:allDates)
		{
			if(e.getText().equals(date))
			{
				e.click();
			}
		}
		
		
	}

}

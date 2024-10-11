package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	static void selectFutureDate(WebDriver driver, String month, String year, String date)
	{
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement e:allDates)
		{
			if(e.getText().equals(date))
			{
				e.click();
			}
		}
	}
	
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Method 1: Sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");	//mm/dd/yyyy
		
		//MEthod 2:Date Picker
		String month="June";
		String date="19";
		String year="2025";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectFutureDate(driver, month, year, date);
	}

}

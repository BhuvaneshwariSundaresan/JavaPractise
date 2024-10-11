package selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countingLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Belfast");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a[starts-with(normalize-space(),'Belfast')]"));
		System.out.println("Numbe of Links:"+links.size());
		
		for(WebElement w:links)
		{
			w.click();
		}
		
		Set<String> winIds=driver.getWindowHandles();
		for(String ids:winIds)
		{
			String title=driver.switchTo().window(ids).getTitle();
			System.out.println(title);
			if(!(title.equals("Automation Testing Practice")))
			{
				driver.close();
			}
		}
	}

}

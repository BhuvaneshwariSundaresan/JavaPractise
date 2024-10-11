package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingSelectDropdowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpdownCountry=driver.findElement(By.xpath("//select[@id='country']"));
		Select country=new Select(drpdownCountry);
		
		//select values from dropdown
		country.selectByVisibleText("China");	//visible text is the options seen in the UI
		country.selectByValue("india");				//Value is the attribute available in the html dom
		country.selectByIndex(3);
		
		//capture options from the dropdown
		List<WebElement> countries=country.getOptions();
		
		System.out.println(countries.size());
		for(int i=0;i<countries.size();i++)
		{
			System.out.println(countries.get(i).getText());
		}
		
		for(WebElement ele:countries)
		{
			System.out.println(ele.getText());
		}

	}

}

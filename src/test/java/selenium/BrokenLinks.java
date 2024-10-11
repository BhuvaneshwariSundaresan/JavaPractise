package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement linkelement:links)
		{
			String hrefValue=linkelement.getAttribute("href");
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("Href attribute is null or empty");
				continue;
			}
			
			try
			{
				URL urlLink=new URL(hrefValue);	//converting href value from String to URL format
				HttpURLConnection conn=(HttpURLConnection) urlLink.openConnection();	//open connection to the server
				conn.connect();	//connect to server and send request
				
				if(conn.getResponseCode()>=400)
				{
					System.out.println("Broken Link =======>"+hrefValue);
				}
				else
				{
					System.out.println("Not a Broken Link =========>"+hrefValue);
				}
			}
			catch(Exception e)
			{
				
			}
		}

	}

}

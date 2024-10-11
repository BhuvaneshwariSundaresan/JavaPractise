package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingusingJavascript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		//1. scroll down page by pixel numer
		/*js.executeAsyncScript("window.scrollBy(0,1600)", "");
		 // Get the vertical scroll position
        Long scrollPosition = (Long) js.executeScript("return window.pageYOffset;");
        System.out.println("Scroll position: " + scrollPosition);*/
        
        //2. scroll down the page till element is visible
       // WebElement element=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
        //js.executeScript("arguments[0].scrollIntoView();", element);
        
        //3. scroll to the page end
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	//vertical scroll bar
        
        Thread.sleep(3000);
        //4. scroll to page start
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");	//vertical scroll bar
        
        js.executeScript("window.scrollTo(document.body.scrollWidth, 0);");	//horizontal scroll bar
	}

}

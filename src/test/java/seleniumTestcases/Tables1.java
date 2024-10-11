package seleniumTestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int noOfPages=driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
		System.out.print("Product Name \t Price");
		for(int p=1;p<=noOfPages;p++)
		{
			if(p>1)
			{
				driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]")).click();
			}
			
			int noOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			int noOfCols=driver.findElements(By.xpath("//table[@id='productTable']//thead//th")).size();
			
			for(int r=1;r<=noOfRows;r++)
			{
				String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
				String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
				System.out.println();
				System.out.print(name+"\t"+price);
				driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input[@type='checkbox']")).click();
			}
		}
		driver.quit();
	}

}

package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticWebtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Finding number of rows in a table
		int tablerows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Number of table rows:"+tablerows);

		//Using tagname to find number of rows in a table - can be used only when there is only one table in the webpage
		int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("Number of table rows:"+rows);
		
		//Finding number of columns in a table
		int tablecols=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		System.out.println("Number of table columns:"+tablecols);
		
		//Using tagname to find number of columns in a table - can be used only when there is only one table in the webpage
		int cols=driver.findElements(By.tagName("th")).size();
		System.out.println("Number of table columns:"+cols);
		
		//Read data from specific row and columns
		
		//Read data from all rows and columns excluding header
		for(int i=2;i<=tablerows;i++) //starting from second row as first row is with header <th>
		{
			for(int j=1;j<=tablecols;j++)
			{
				String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(values+"\t"); // "\t" will add tab space
			}
			System.out.println();
		}
		
		//Reading data based on some condition
		for(int r=2;r<=tablerows;r++)
		{
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName+"\t"+authorName);
			}
		}
		
		//finding total price of all books
		int totalPrice=0;
		for(int r=2;r<=tablerows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			totalPrice=totalPrice+Integer.parseInt(price);
		}
		
		//blazedemo.com
				
	}

}

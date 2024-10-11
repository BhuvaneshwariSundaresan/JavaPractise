package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//1. selecting specific check boxes(one or two)
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//2. selecting multiple checkboxes
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(WebElement e:checkBoxes)
		{
			e.click();
		}*/
		
		//3. selecting last 3 checkbox from a list - this can be done only with normal for loop as enhanced for loop cannot handle indexing
		//say in this case total no of check boxes is 7 so 7-3=4, 4 would be the starting index
		/*
		 * for(int i=4;i<checkBoxes.size();i++) { checkBoxes.get(i).click(); }
		 */

		//4. selecting first 3 checkbox from a list
		for(int i=0;i<3;i++)
		{
			checkBoxes.get(i).click();
		}
		
		//5. unselecting the selected checkboxes
		for(WebElement e:checkBoxes)
		{
			if(e.isSelected())
				e.click();
		}
		
		//6. selecting checkboxes in table based on product
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']//tr[not(th)]"));
		System.out.println(rows.size());
		
		String[] products= {"Product 1", "Product 3", "Product 5"};
		
		for(WebElement row:rows)
		{
			WebElement productName=row.findElement(By.xpath(".//td[2]"));
			System.out.println(productName.getText());
			for(String product:products)
			{
				if((productName.getText()).equals(product))
				{
					WebElement checkbox=row.findElement(By.xpath(".//input[@type='checkbox']"));
					if(!checkbox.isSelected())
					{
						checkbox.click();
					}
				}
			}
		}
		
		
		
	}

}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationAlert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//injection process with username and password are appended along with the url
		//http://username:password@url
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.quit();
	}

}

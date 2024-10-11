package TestNG;

import org.testng.annotations.Test;

public class Day1 {
	
	@Test(priority=1)
	void openApp()
	{
		System.out.println("Openapp");
	}
	
	@Test(priority=2)
	void Login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=3)
	void Logout()
	{
		System.out.println("Logout");
	}

}

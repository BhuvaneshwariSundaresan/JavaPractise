package TestNG;

import org.testng.annotations.Test;

public class LoginTest {
  @Test(priority = 1, groups = {"Sanity"})
  public void loginByEmail() {
	  System.out.println("Login by Email");
  }
  
  @Test(priority = 2, groups = {"Sanity"})
  public void loginByFacebook() {
	  System.out.println("Login by Facebook");
  }
  
  @Test(priority = 3, groups = {"Sanity"})
  public void loginByInstagram() {
	  System.out.println("Login by Instagram");
  }
}

package TestNG;

import org.testng.annotations.Test;

public class SignupTest {
	@Test(priority = 1, groups = {"Regression"})
	  public void signupByEmail() {
		  System.out.println("Signup by Email");
	  }
	  
	  @Test(priority = 2, groups = {"Regression"})
	  public void signupByFacebook() {
		  System.out.println("Signup by Facebook");
	  }
	  
	  @Test(priority = 3, groups = {"Regression"})
	  public void signupByInstagram() {
		  System.out.println("Signup by Instagram");
	  }
}

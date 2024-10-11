package TestNG;

import org.testng.annotations.Test;

public class PaymentTest {
  @Test(priority=1,groups = {"Sanity", "Regression", "functional"})
  public void paymentInRupees() {
	  System.out.println("Payment in rupees");
  }
  @Test(priority=2,groups = {"Sanity", "Regression", "functional"})
  public void paymentInDollars() {
	  System.out.println("Payment in dollars");
  }
}

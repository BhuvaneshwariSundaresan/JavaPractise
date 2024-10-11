package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
  @Test
	/*
	 * public void test_hardassert() {
	 * 
	 * System.out.println("testing"); System.out.println("testing");
	 * 
	 * Assert.assertEquals("xyz", "acs");
	 * 
	 * System.out.println("testing"); System.out.println("testing"); }
	 */
 public void test_softassert() {
	  
	 SoftAssert s=new SoftAssert();
	  System.out.println("testing");
	  System.out.println("testing");
	  
	  s.assertEquals(1, 2);
	  
	  System.out.println("testing");
	  System.out.println("testing");
	  
	  s.assertAll();	//mandatory method 
  }
}

package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
  @Test
  void testTitle()
	{
		String exp_title="XXXX";
		String act_title="YYYY";
		
		/*
		 * if(exp_title.equals(act_title)) { System.out.println("passed"); } else {
		 * System.out.println("failed"); }
		 */
		
		Assert.assertEquals(exp_title, act_title);
	}
}

package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
  @Test
  public void test() {
	  
	  Assert.assertEquals("xyz", "xyz"); //pass - will accept any data format
	  Assert.assertEquals(123, "abc"); 	//fail
	  Assert.assertEquals(123, 123); //pass
	  
	  Assert.assertNotEquals(111, 111); 	//fail
	  Assert.assertNotEquals(123, 456); 	//pass
	  
	  Assert.assertTrue(false); 	//fail
	  Assert.assertTrue(true); 		//pass
	  Assert.assertTrue(1==2);  	//fail
	  Assert.assertTrue(2==2);  	//pass
	  
	  
	  
	  
  }
}


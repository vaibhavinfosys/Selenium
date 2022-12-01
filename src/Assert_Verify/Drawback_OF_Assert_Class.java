package Assert_Verify;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Drawback_OF_Assert_Class {
	@Test
	public void TC1() {
		Reporter.log("Running test",true);
		String expT="hello";
		String actT="hello";
		
		Boolean actResult=true;
		
     // Verification 1
		Assert.assertEquals(expT, actT);
				
     // Verification 2
		Assert.assertNotEquals(expT, actT);
		
	  // verification 3
		Assert.assertTrue(true);
		
	 // verification 4	
	Reporter.log("I am not running bcz 1st verification fail",true);
	
	
	}
}
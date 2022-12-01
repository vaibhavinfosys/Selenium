package Assert_Verify;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_Equals_Method {
	@Test
	public void TC1() {
		Reporter.log("Running test",true);
		String expT="hello";
		String actT="hello";
		
		//Verify using Assert class method
		Assert.assertEquals(expT, actT);
		Reporter.log("test case is pass",true);
				
		
	}
}

package Assert_Verify;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_notEquals_Method {
	@Test
	public void test() {
		Reporter.log("Rinning Test",true);
		
		String expT="hello";
		String actT="hi";
		Assert.assertNotEquals(expT, actT);
	
	}

}

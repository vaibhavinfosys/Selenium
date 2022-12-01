package Assert_Verify;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_False_Method {
	@Test
	public void test() {
		Boolean actResult=false;
		
		//Verify
		Assert.assertFalse(false);
		
	}

}

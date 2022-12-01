package Assert_Verify;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assert_Fails_Method {
	@Test
	public void test1() {
		Reporter.log("Running test1",true);
		Assert.fail();
	}
	@Test
	public void test2() {
		Reporter.log("Running test2",true);
	}

}

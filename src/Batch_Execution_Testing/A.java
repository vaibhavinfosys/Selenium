package Batch_Execution_Testing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void tc1() {
		Reporter.log("Running tc1",true);
	}
	
	@Test
	public void tc2() {
		Assert.fail();
		Reporter.log("Running tc2",true);
	}
	
	@Test(enabled = false)
	public void tc3() {
		Reporter.log("Running tc3",true);
	}

}

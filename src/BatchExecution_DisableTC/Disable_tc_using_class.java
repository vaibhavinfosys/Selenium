package BatchExecution_DisableTC;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_tc_using_class {
	@Test
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("Running TC2",true);
	}

	@Test(enabled = false)
	public void TC3() {
		Reporter.log("Running TC3",true);
	}
}

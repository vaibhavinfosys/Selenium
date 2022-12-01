package BatchExecution_Using_Suit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TC_using_suite {
	@Test
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("Running TC2",true);
	}

	@Test
	public void TC3() {
		Reporter.log("Running TC3",true);
	}
}

package Batch_Execution_Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
	@Test
	public void tc4() {
		Reporter.log("Running tc4",true);
	}
	
	@Test
	public void tc5() {
		Reporter.log("Running tc5",true);
	}
	
	@Test
	public void tc6() {
		Reporter.log("Running tc6",true);
	}
}

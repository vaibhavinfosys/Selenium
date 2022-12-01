package BatchExecution_Failed_XML_file;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failed_xml_file {
	@Test
	public void TC1() {
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2() {
		Reporter.log("Running TC2",true);
	}

	
	//I have intentionally fail the TC3
	@Test
	public void TC3() {
		Assert.fail();
		Reporter.log("Running TC3",true);
	}
}

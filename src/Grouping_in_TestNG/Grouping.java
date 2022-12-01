package Grouping_in_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	@Test (groups = {"userInterface"})
	public void checkingSpelling() {
		Reporter.log("running UI test case 1",true);
		
	}
	
	@Test (groups = {"login functionality"})
	public void enterUserName() {
		Reporter.log("Running login test case1",true);
	}
	@Test (groups = {"login functionality"})
	public void enetrPassword() {
		Reporter.log("Running login test case 2",true);
	}
	@Test (groups = {"userInterface"})
	public void verifyLogo() {
		Reporter.log("running UI test case 2",true);
	}
	@Test (groups = {"login functionality"})
	public void clickOnSubmitButton() {
		Reporter.log("Running login test case 3",true);
	}
	@Test (groups = {"userInterface"})
	public void verifyTitle() {
		Reporter.log("Running UI test case 3",true);
	}

}

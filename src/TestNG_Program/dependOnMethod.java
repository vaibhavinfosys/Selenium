package TestNG_Program;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependOnMethod {
	@Test
	public void login() {
		Assert.fail();
		Reporter.log("runnung login",true);
	}
	@Test(dependsOnMethods = {"login"})
	public void logout() {
		Reporter.log("runnung logOut",true);
	}

}

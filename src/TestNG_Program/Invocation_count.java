package TestNG_Program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {
       //If you run Test cases multiple time the we use only invocation=n number of time....
	@Test(invocationCount = 10)
	public void king() {
		Reporter.log("Hello",true);
	}

}

package Assert_Verify;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softclass {
	@Test
	public void TC1() {
		String expT="Hi";
		String actT="Hello";
		
     // We have to create object of SoftAssert class
		SoftAssert s=new SoftAssert();
		//verification1
		s.assertEquals(expT, actT);
		
		//verification 2
		Reporter.log("I am after failing first verification",true);
		s.assertAll(); // if you don't write assertAll() method at end of verifications it will not executes.
	}
	@Test
	public void TC2() {
		Reporter.log("I am TC2",true);
	}
	
	
	@Test
	public void TC3() {
		Reporter.log("I am TC3",true);
	}
	
	@Test
	public void TC4() {
		Reporter.log("I am TC4",true);
	}
	
	

}

package TestNG_Program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
	@Test
	public void Tc1() {
		Reporter.log("Hi I am running From TC1",true);
	}
	
@Test(enabled = false)
public void Tc2() {
	Reporter.log("Hi I am running From TC2",true);
}

@Test
public void Tc3() {
	Reporter.log("Hi I am running From TC3",true);
}

}

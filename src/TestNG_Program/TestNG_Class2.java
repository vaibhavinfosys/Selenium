package TestNG_Program;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Class2 {
	@Test
	public void Tc1() {
		Reporter.log("Hi I am running From TC1",true);
	}
	
@Test
public void Tc2() {
	Assert.fail();
	Reporter.log("Hi I am running From TC2",true);
}

@Test
public void Tc3() {
	Reporter.log("Hi I am running From TC3",true);
}

}

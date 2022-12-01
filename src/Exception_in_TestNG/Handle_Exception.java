package Exception_in_TestNG;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Handle_Exception {
	@Test (expectedExceptions = {IOException.class})
	 public void test1() throws Exception {
		throw new IOException();
	}
	
	@Test(expectedExceptions = {NullPointerException.class})
	public void test2() throws NullPointerException{
		System.out.println("exception handeled successfully");
		throw new NullPointerException();
	}

}

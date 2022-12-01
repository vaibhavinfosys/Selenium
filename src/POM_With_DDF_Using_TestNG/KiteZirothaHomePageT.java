package POM_With_DDF_Using_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZirothaHomePageT {

	//Declaration
		@FindBy(xpath = "//span[text()='DPG458']")private WebElement ID;
		
		
		
		//initialization
		public KiteZirothaHomePageT(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//implementation
	      public String verifyID() {
	    	  String actID=ID.getText();
	    	  return actID;
	    	  
	    	 
	      }

}

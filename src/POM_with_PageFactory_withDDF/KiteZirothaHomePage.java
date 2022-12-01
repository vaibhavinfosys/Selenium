package POM_with_PageFactory_withDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZirothaHomePage {
	
	//Declaration
		@FindBy(xpath = "//span[text()='DPG458']")private WebElement ID;
		
		
		
		//initialization
		public KiteZirothaHomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//implementation
	      public void verifyID(String expID) {
	    	  String actID=ID.getText();
	    	  
	    	  if(actID.equals(expID)) {
	    		  System.out.println("Test case is Pass");
	    	  }
	    	  else {
	    		  System.out.println("Test case is Fail");
	    	  }
	      }
	      
	    

}

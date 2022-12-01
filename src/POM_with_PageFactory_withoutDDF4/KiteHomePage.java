package POM_with_PageFactory_withoutDDF4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//Declaration
		@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
		
	
	//initialization
		
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
	//implementation/utilization
		
      public void verifyUserID() {
    	  String expID="DPG458";
    	  
    	   String actID = userID.getText();
    	   
    	   if(expID.equals(actID)) {
    		   System.out.println("test case is pass");
    	   }
    	   else {
    		   System.out.println("Test case is fail");
    	   }
    	       
      }

}

package POM_with_Pagefactory_WthoutDDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin4VerifyPage {
	
	//declaration
	
	  @FindBy(xpath = "//div[@class='Wdz6e ZnExKf']")private WebElement verifyEmailId;
	 
	  
	  
	  
	  //initialization
	  public GmailLogin4VerifyPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  
	  //Utilization
	  public void verifyEmail() {
		  String expEmailId="hulwanvaibhav@gmail.com";
		  String actEmailId=verifyEmailId.getText();
		  
		  if(expEmailId.equals(actEmailId)) {
			  System.out.println("Test case is Pass");
		  }
		  else {
			  System.out.println("Test case is Fail");
		  }
		  
		  }
	  

}

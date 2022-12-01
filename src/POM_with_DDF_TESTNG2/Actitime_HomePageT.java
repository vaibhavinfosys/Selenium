package POM_with_DDF_TESTNG2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_HomePageT {
	// declaration
	
	@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement UserText;
	@FindBy(xpath = "//a[text()='Logout']")private WebElement logOut;
	
	
	//initialization
	public Actitime_HomePageT(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//implementations
	  public String verifyUserText() {
		       String actUT = UserText.getText();
		       return actUT;
		   	  }
	  
	  public void logoutApplication() {
		  logOut.click();
	  }
	  
	 
	

}

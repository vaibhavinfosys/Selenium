package POM_with_PageFactory_WithoutDDF3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeMainPage {
	  @FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement verify;
		 
	 
	  
	  
	  //initialization
	  public ActitimeMainPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  
	  //Utilization
	  public void Verify() {
		  String exp="Enter Time-Track";
		  String act=verify.getText();
		  
		  if(exp.equals(act)) {
			  System.out.println("Test case is pass");
			  
		  }
		  else {
			  System.out.println("Test case is Fail");
		  }
		  
		  }

}

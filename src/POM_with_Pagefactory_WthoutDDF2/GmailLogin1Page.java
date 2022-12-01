package POM_with_Pagefactory_WthoutDDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin1Page {
	
	//declaration
	
	  @FindBy(xpath = "//input[@id='identifierId']")private WebElement EmailId;
	 
	  @FindBy(xpath = "//span[text()='Next']")private WebElement nextButton;
	  
	  
	  //initialization
	  public GmailLogin1Page(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  
	  //Utilization
	  public void enterEmailId() {
		  EmailId.sendKeys("hulwanvaibhav@gmail.com");
		  }
	  
	 
	  
	  public void clickOnNextButton() {
		  nextButton.click();
	  }

}

package POM_with_Pagefactory_WthoutDDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin2Page {
	//declaration
	
	  @FindBy(xpath = "//input[@name='password']")private WebElement pwd;
	 
	  @FindBy(xpath = "//span[text()='Next']")private WebElement nextButton;
	  
	  
	  //initialization
	  public GmailLogin2Page(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  
	  //Utilization
	  public void enterPassword() {
		  pwd.sendKeys("Vaibhav@12");
		  }
	  
	 
	  
	  public void clickOnNextButton() {
		  nextButton.click();
	  }


}

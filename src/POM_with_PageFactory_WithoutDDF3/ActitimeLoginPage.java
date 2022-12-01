package POM_with_PageFactory_WithoutDDF3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {
	//declaration
	
	  @FindBy(xpath = "//input[@id='username']")private WebElement username;
	 
	  @FindBy(xpath = "//input[@name='pwd']")private WebElement password;
	  
	  @FindBy(xpath = "//div[text()='Login ']")private WebElement clkOnLoginBtn;
	  
	  
	  //initialization
	  public ActitimeLoginPage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  
	  //Utilization
	  public void enterUserName() {
		  username.sendKeys("admin");
		  }
	  
	  public void enterPassword() {
		  password.sendKeys("manager");
		  }
	  
	  public void clickOnLoginButton() {
		  clkOnLoginBtn.click();
		  }

}

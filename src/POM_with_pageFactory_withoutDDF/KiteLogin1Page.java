package POM_with_pageFactory_withoutDDF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	//declaration
	
  @FindBy(xpath = "//input[@id='userid']")private WebElement UN;
  @FindBy(xpath = "//input[@id='password']")private WebElement PWD;
  @FindBy(xpath = "//button[text()='Login ']")private WebElement loginButton;
  
  
  //initialization
  public KiteLogin1Page(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  
  //Utilization
  public void enterUsername() {
	  UN.sendKeys("DPG458");
	  }
  
  public void enterPassword() {
	  PWD.sendKeys("Amol@1234");
  }
  
  public void clickOnLoginButton() {
	  loginButton.click();
  }
  
  
  
  
  
  
  
	

}

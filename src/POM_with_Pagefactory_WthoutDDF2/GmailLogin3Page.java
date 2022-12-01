package POM_with_Pagefactory_WthoutDDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogin3Page {
	
	//declaration
	
	  @FindBy(xpath = "//img[@class='gb_Ba gbii']")private WebElement ClkOnLogoImg;
	 
	  
	  
	  
	  //initialization
	  public GmailLogin3Page(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  
	  //Utilization
	  public void clickOnLogoImg() {
		  ClkOnLogoImg.click();
		  }
	  

}

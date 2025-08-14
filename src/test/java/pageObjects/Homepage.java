package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage
{

  public Homepage(WebDriver driver)
  {
	  super(driver);
  }
  
 @FindBy(xpath="//span[normalize-space()='My Account']")
 WebElement linMyAcc;
 
 @FindBy(xpath="//a[normalize-space()='Register']")
 WebElement linReg;
 
 @FindBy(xpath="//a[normalize-space()='Login']")
 WebElement linLogin;
 
 public void myAccount()
 {
	 linMyAcc.click(); 
 }

 public void register()
 {
	 linReg.click(); 
 }
 
 public void login()
 {
	 linLogin.click(); 
 }
 
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegusterPage extends BasePage
{
	public AccountRegusterPage(WebDriver driver)
	{
		super(driver);
		
	}

@FindBy(xpath="//input[@id='input-firstname']")
WebElement firstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement lastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement emailtxt;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement phonenumtxt;

@FindBy(xpath="//input[@id='input-password']")
WebElement pwdtxt;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement confirmpwdtxt;

@FindBy(xpath="//label[normalize-space()='No']")
WebElement newsletterNo;

@FindBy(xpath="//label[normalize-space()='Yes']")
WebElement newsletterYes;

@FindBy(xpath="//input[@name='agree']")
WebElement privacypolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement continuebtn;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement displayMesg;

public void setFirstName(String fname)
{
	firstname.sendKeys(fname);	
}

public void setLastName(String lname)
{
	lastname.sendKeys(lname);
}

public void setEmail(String email)
{
	emailtxt.sendKeys(email);
}

public void setPhoneNum(String phno)
{
	phonenumtxt.sendKeys(phno);
}
	
public void setPassword(String pwd)
{
	pwdtxt.sendKeys(pwd);
}

public void setConfirmPwd(String conpwd)
{
	confirmpwdtxt.sendKeys(conpwd);
}

public void setNewsLetterNo()
{
	newsletterNo.click();
}
	
public void setNewsLetterYes()
{
	newsletterYes.click();
}

public void cliPolicy()
{
	privacypolicy.click();
}

public void ContinueBtn()
{
	continuebtn.click();
}

public String getConfirmMessage()
{   
	try
	{
	return(displayMesg.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
}
	
	
	
	
	
}

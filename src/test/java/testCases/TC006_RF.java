package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegusterPage;
import pageObjects.Homepage;

public class TC006_RF 
{
  public WebDriver driver;
  
  @BeforeClass 	
  public void setup()
  {
	  
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://tutorialsninja.com/demo/");
	  
  }
  
  
  
  @Test
public  void verify_NewLetterNo()
  {
	 Homepage hp=new Homepage(driver);
	 hp.myAccount();
	 hp.register();
	 
AccountRegusterPage accpg=new AccountRegusterPage(driver);
accpg.setFirstName(randomString());
accpg.setLastName(randomString());
accpg.setEmail(randomString()+"@gmail.com");
accpg.setPhoneNum(randomNumeric());

String password=randomAlphaNum();

accpg.setPassword(password);
accpg.setConfirmPwd(password);
accpg.setNewsLetterNo();
accpg.cliPolicy();
accpg.ContinueBtn();
String ConfirmMessage=accpg.getConfirmMessage();
if(ConfirmMessage.equals("Your Account Has Been Created!"))
{
	Assert.assertTrue(true);
}
else
{
	Assert.assertTrue(false);
}
  }

@AfterClass
public void teardown()
{
	driver.quit();  
}
	

  
 public String randomString()
 {
	String getString=RandomStringUtils.randomAlphabetic(5); 
	return getString;
 }
  
 public String randomNumeric()
 {
	String getNum= RandomStringUtils.randomNumeric(10);
	return getNum;
 }
 
 public String randomAlphaNum()
 {
	
	 String getString=RandomStringUtils.randomAlphabetic(3); 
	 String getNum= RandomStringUtils.randomNumeric(3); 
	 return(getString+"@"+getNum);
	 
 }
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

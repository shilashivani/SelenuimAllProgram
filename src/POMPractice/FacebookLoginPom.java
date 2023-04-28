package POMPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPom {
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement password;
	@FindBy(xpath="//button[@name='login']")private WebElement login;
	@FindBy(xpath="(//a[@role='button'])[2]")private WebElement create;
	@FindBy(xpath="//input[@name='firstname']")private WebElement firstName;
	@FindBy(xpath="//input[@name='lastname']")private WebElement sirname;
	@FindBy(xpath="")private WebElement emailadress;
	@FindBy(xpath="")private WebElement newpassword;
	@FindBy(xpath="")private WebElement dateOfBirth;
	
	public FacebookLoginPom(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	public void enterCorrectEmailId(String emailid) {
		email.sendKeys(emailid);
		
	}
	public void enterCorrectPassword(String pass) {
		password.sendKeys(pass);
	}
//	public void clickLoginButton()
//	{
//		login.click();
//	}
	public void clickCreateButton()
	{
		create.click();
	}
  public void enterFirstNamehdp(String name,WebDriver driver)
  {
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5000));
	  wait.until(ExpectedConditions.visibilityOf(firstName));
	  firstName.sendKeys(name);
  }
  public void enterLastName(String lastn)
  {
	  sirname.sendKeys(lastn);
  }
  public void enterEmailAdress(String eaddres)
  {
	  emailadress.sendKeys(eaddres);
  }
  public void enterNewPassword(String npass)
  {
	  newpassword.sendKeys(npass);
  }
  
	

}

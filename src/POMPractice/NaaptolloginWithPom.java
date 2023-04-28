package POMPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class NaaptolloginWithPom {
	@FindBy(xpath="//a[@id='login-panel-link']")private WebElement login;
	@FindBy(xpath="//input[@id='registration-basic-panel-mobile']")private WebElement mobile;
	@FindBy(xpath="//input[@id='registration-basic-panel-submit']")private WebElement continue1;
	@FindBy(xpath="//input[@id='registration-otp-panel-otp']")private WebElement otp;
	@FindBy(xpath="//input[@id='registration-otp-panel-submit']")private WebElement Clicksubmit;
	public NaaptolloginWithPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickLoginText()
	{
		login.click();
	}
	public void enterMobileNumber(String number,WebDriver driver)
	{
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(500));
		wait.pollingEvery(Duration.ofSeconds(20));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(mobile));
		mobile.sendKeys(number);
		
	}
	public void clickOnContinueButton()
	{
//		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(Driver);
//		wait.withTimeout(Duration.ofSeconds(500));
//		wait.pollingEvery(Duration.ofSeconds(20));
//		wait.ingnoring(Exception.class)
//		wait.until(ExpectedConditions.visibilityOf(Clicksubmit))
		continue1.click();
	}
	public void enterOtp(String otpen) {
		otp.sendKeys(otpen);
	}
	public void clickOnSubmitButton() {
		Clicksubmit.click();
	}

//	public void enterMobileNumber(double number)
//	{
//		mobile.sendKeys();
//	}
		

}

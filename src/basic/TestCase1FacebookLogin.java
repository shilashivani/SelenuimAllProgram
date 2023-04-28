package basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1FacebookLogin {
	public void ValidateLoginFacebookWithValiedUsernameAndPassword() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		String id=ParameterExcelFetch.getExelData(0, 0, "Crendentials");
		username.sendKeys(id);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		String pass=ParameterExcelFetch.getExelData(1, 0,"Crendentials");
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}
	public void ValidateLoginFacebookWithValiedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		String id=ParameterExcelFetch.getExelData(0, 0, "Crendentials");
		username.sendKeys(id);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		String pass=ParameterExcelFetch.getExelData(1, 0,"Crendentials");
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}
	public void ValidateLoginFacebookWithInvaliedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		String id=ParameterExcelFetch.getExelData(0, 0, "Crendentials");
		username.sendKeys(id);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		String pass=ParameterExcelFetch.getExelData(1, 0,"Crendentials");
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}public static void main(String[] args) throws EncryptedDocumentException, IOException {
		TestCase1FacebookLogin obj=new TestCase1FacebookLogin();
		obj.ValidateLoginFacebookWithInvaliedUsernameAndInvaliedPassword();
		obj.ValidateLoginFacebookWithValiedUsernameAndInvaliedPassword();
		obj.ValidateLoginFacebookWithValiedUsernameAndPassword();
	}



}

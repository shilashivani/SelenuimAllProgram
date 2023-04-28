package basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Parametriazationlogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		String userName=ParameterExcelFetch.getExelData(0, 0, "crendentials");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	   email.sendKeys(userName);
	 String pass=ParameterExcelFetch.getExelData(1, 0, "crendentials");
	  WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	 password.sendKeys(pass);
	   
	}

}

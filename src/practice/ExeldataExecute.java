package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ExeldataExecute {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
	double login=ExelDataAccess.exelSheetdata(0, 0, "crendentials");
	WebElement name=driver.findElement(By.xpath("//input[@id='email']"));
	//name.sendKeys(login);
	}

}

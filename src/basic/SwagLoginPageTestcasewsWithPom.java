package basic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

public class SwagLoginPageTestcasewsWithPom {
	public void ValidateSwagLoginWithValiedUsernameAndPassword() throws EncryptedDocumentException, IOException
	{
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.saucedemo.com/");
		SwagLabLoginPageWithPOM swagLabLoginPageWithPOM=new SwagLabLoginPageWithPOM(driver);
		swagLabLoginPageWithPOM.enterUserName(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		swagLabLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		swagLabLoginPageWithPOM.clickToLogin();
	
	}
	public void ValidateSwagLoginWithValiedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.saucedemo.com/");
		SwagLabLoginPageWithPOM swagLabLoginPageWithPOM=new SwagLabLoginPageWithPOM(driver);
		swagLabLoginPageWithPOM.enterUserName(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		swagLabLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(1, 0, "crendentials"));
		swagLabLoginPageWithPOM.clickToLogin();
	}
		public void ValidateSwagLoginWithInvaliedUsernameAndInvaliedPassword() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.saucedemo.com/");
		SwagLabLoginPageWithPOM swagLabLoginPageWithPOM=new SwagLabLoginPageWithPOM(driver);
		swagLabLoginPageWithPOM.enterUserName(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		swagLabLoginPageWithPOM.enterPassword(ParameterExcelFetch.getExelData(0, 0, "crendentials"));
		swagLabLoginPageWithPOM.clickToLogin();
		
	}public static void main(String[] args) throws EncryptedDocumentException, IOException {
		SwagLoginPageTestcasewsWithPom obj=new SwagLoginPageTestcasewsWithPom();
		obj.ValidateSwagLoginWithInvaliedUsernameAndInvaliedPassword();
		obj.ValidateSwagLoginWithValiedUsernameAndPassword();
		obj.ValidateSwagLoginWithInvaliedUsernameAndInvaliedPassword();
	}




}

package POMPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basic.OpenBrowser;
import basic.ParameterExcelFetch;
import practice.ExelDataAccess;

public class NaaptolLoginExecutionPage {
	
		@BeforeTest
		@Test
		public void userEnterValidateMobilenumber() throws EncryptedDocumentException, IOException {
			WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
			NaaptolloginWithPom naaptolloginWithPom=new NaaptolloginWithPom(driver);
			naaptolloginWithPom.clickLoginText();
			naaptolloginWithPom.enterMobileNumber(ParameterExcelFetch.getExelData(3,0 , "crendentials"), driver);
			naaptolloginWithPom.clickOnContinueButton();
			

		
		}
		
		@Test
        public static void main(String[] args) throws EncryptedDocumentException, IOException {
			NaaptolLoginExecutionPage obj=new NaaptolLoginExecutionPage();
			obj.userEnterValidateMobilenumber();
			
		}

		

}

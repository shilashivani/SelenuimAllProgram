package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutSelectClassHandlingDropDown {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	     WebElement yahoo=driver.findElement(By.xpath("//option[text()='Yahoo']"));
	     yahoo.click();
	   JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("arguments[0],scrollIntoView(true)",yahoo);
	 
		
	
	}

}

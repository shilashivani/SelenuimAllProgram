package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class DropDownSelectUsingmouseAction {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	    WebElement product=driver.findElement(By.xpath("//select[@id='first']"));
	    product.click();
	    WebElement iphone=driver.findElement(By.xpath("//option[@value='Apple']"));
     
	    Actions action=new Actions(driver);
	    action.moveToElement(iphone);
	   
	   
	    action.perform();
	    
	}

}

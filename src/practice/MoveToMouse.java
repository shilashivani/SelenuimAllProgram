package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class MoveToMouse {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.amazon.in/");
	    WebElement main=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    
	    Actions action=new Actions(driver);
	    action.moveToElement(main).perform();
	
	    WebElement primevidio=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
	primevidio.click();
	}

}

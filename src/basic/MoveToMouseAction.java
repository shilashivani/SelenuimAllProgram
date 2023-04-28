package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToMouseAction {
	public static void main(String[] args) {
		 WebDriver driver=OpenBrowser.OpenBrowser1("https://www.amazon.in/");
		   WebElement moveToElement=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	  Actions action=new Actions(driver);
	  action.moveToElement(moveToElement);
	  action.perform();
	  WebElement prime=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
	prime.click();
	
	}

}

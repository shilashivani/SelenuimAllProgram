package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class RightClickMouseAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.OpenBrowser1("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickMe=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action=new Actions(driver);
		action.contextClick(rightClickMe).perform();
	  Thread.sleep(2000);
	 // WebElement copy=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']"));
	// WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']")); 
	  WebElement cut=driver.findElement(By.xpath("//span[text()='Cut']"));
	 // WebElement delete=driver.findElement(By.xpath("//span[text()='Paste']"));
	 // WebElement paste=driver.findElement(By.xpath("//span[text()='Delete']"));
	  //copy.click();
	 // edit.click(); 
	  cut.click();
	 Alert alert=driver.switchTo().alert();
		alert.accept();
		//Thread.sleep(2000);
	
	
		
	}

}

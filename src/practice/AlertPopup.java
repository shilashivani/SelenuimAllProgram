package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

//oppackage practice;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=OpenBrowser.OpenBrowser1("https://the-internet.herokuapp.com/javascript_alerts");	
	//WebElement jsAlert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
	//jsAlert.click();
	//Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	//alert.accept();	
	WebElement jsConfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
	jsConfirm.click();
	Thread.sleep(2000);
	alert.dismiss();
	
	
	}
	
	

}

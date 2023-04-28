package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class AlertPopupPractice7 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://the-internet.herokuapp.com/javascript_alerts");
//		WebElement  js=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//		js.click();
//		Alert alert=driver.switchTo().alert();
		//alert.accept();
//		WebElement jsConfirm =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//		jsConfirm.click();
//		Alert alert=driver.switchTo().alert();
//		alert.dismiss();
//		
		WebElement jsConfirmpromt =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
	    jsConfirmpromt.click();
	    Alert alert=driver.switchTo().alert();
	    String text=alert.getText();
	    System.out.println(text);
		alert.sendKeys("arise");
		alert.accept();
		
	}

}

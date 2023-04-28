package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class AlertPopup4 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://the-internet.herokuapp.com/javascript_alerts");
		//WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));//Using Contains locato
		
		//WebElement jsConfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement jsPrompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		//jsAlert.click();
	//jsConfirm.click();
	jsPrompt.click();
	
		Alert focus=driver.switchTo().alert();
	 //focus.dismiss();
		String text=focus.getText();
		System.out.println(text);
		jsPrompt.sendKeys("hello");
	     focus.accept();
	
	
	
	}

}

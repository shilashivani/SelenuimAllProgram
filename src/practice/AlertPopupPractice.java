package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class AlertPopupPractice {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement Jsalert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		//Jsalert.click();
		WebElement Jspromt=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		//Jspromt.click();
		WebElement Jsalertt=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		Jsalert.click();
		
		Alert alert=driver.switchTo().alert();
		String as=alert.getText();
		System.out.println(as);
		alert.sendKeys("shila");
		alert.accept();
		
	}

}


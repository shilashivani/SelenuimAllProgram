package practice;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class AlertPopup1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsPromt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		driver.manage().window().maximize();
		jsPromt.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
	     alert.sendKeys("arise");
		alert.accept();
	    //alert.dismiss();
	     driver.manage().window().minimize();
	     ScreenShot.takeScreenshot(driver, "text");
	}
	

}

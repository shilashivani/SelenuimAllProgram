package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement w =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		//w.click();
		//Thread.sleep(2000);
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
		//WebElement jsConfirm =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		//jsConfirm.click();
	   //  alert.dismiss();
		
	     WebElement jsPrompt =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
	     
			jsPrompt.click();
			Thread.sleep(2000);
			Alert alert1=driver.switchTo().alert();
			alert1.accept();
		   // String text= alert1.getText();
		   // System.out.println(text);
		  // alert1.sendKeys("Arise");
		
	
	}

}

package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class AlertPopup3 {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsPromt=driver.findElement(By.xpath("//button[contains(@onclick,'jsPrompt()')]"));
		jsPromt.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.sendKeys("Arise");
		alert.accept();
	}

}

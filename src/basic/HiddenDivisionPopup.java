package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("shila");
		
		screenpractice.takeScreenShot(driver, "hiddendivision.jpg");
	}

}

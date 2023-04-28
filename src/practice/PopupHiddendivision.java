package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class PopupHiddendivision {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com");
		WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("shila");
	}

}

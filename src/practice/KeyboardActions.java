package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class KeyboardActions {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demoqa.com/text-box");
		WebElement firstName=driver.findElement(By.xpath("//input[@id='userName']"));
		firstName.sendKeys("shila");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("shilababar@gmail.com");
		action.sendKeys(Keys.TAB);
		action.sendKeys("Applewood Sorrel Ahemdabad Gujrat");
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.TAB);
				action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.sendKeys(Keys.TAB);

		action.sendKeys(Keys.ENTER);
		action.build().perform();
		
		}

}

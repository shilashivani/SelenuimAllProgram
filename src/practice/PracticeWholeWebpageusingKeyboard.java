package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class PracticeWholeWebpageusingKeyboard {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.automationtesting.in/Register.html");
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		name.sendKeys("shila");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("babar");
		action.sendKeys(Keys.TAB);
		action.sendKeys("ahemdabad,gujrat");
	    action.sendKeys(Keys.TAB);
		action.sendKeys("shilababar@gmail.com");
		action.sendKeys(Keys.TAB);
		action.sendKeys("1234567892");
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.SPACE);
		action.sendKeys(Keys.ARROW_RIGHT);
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.SPACE);
	   action.build();
	   WebElement langauge=driver.findElement(By.xpath("//div[@id='msdd']"));
	   langauge.click();
	   WebElement english=driver.findElement(By.xpath("//a[text()='English']"));
	   action.moveToElement(english);
	   action.perform();
	}

}

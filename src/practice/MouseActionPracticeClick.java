package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class MouseActionPracticeClick {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.amazon.in/");
		WebElement moveToElement=driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		Actions action=new Actions(driver);
		action.moveToElement(moveToElement);
		action.perform();
		WebElement english=driver.findElement(By.xpath("(//span[text()='English'])[1]"));
	     english.click();
	}

}

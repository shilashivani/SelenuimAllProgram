package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class MouseActionContextTextpractice1 {
	public static void main(String[] args) {
	WebDriver driver=OpenBrowser.OpenBrowser1("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement rightClickMi=driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions action =new Actions(driver);
	action.contextClick(rightClickMi);
	action.perform();
	WebElement editclick=driver.findElement(By.xpath("//span[text()='Edit']"));
	action.click(editclick);
	action.perform();
	Alert ok=driver.switchTo().alert();
	ok.accept();
	}

}

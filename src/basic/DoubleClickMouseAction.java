package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseAction {
	public static void main(String[] args) {
	WebDriver driver=OpenBrowser.OpenBrowser1("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClickMe=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
				action.doubleClick(doubleClickMe);
				action.perform();
          Alert alert=driver.switchTo().alert();
          alert.accept();
	}

}

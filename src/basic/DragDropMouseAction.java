package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropMouseAction {
	public static void main(String[] args) {
		 WebDriver driver=OpenBrowser.OpenBrowser1("https://www.globalsqa.com/demo-site/draganddrop/");
		 WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		 driver.switchTo().frame(iframe);
		 WebElement source=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		 WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		 Actions action=new Actions(driver);
	    action.dragAndDrop(source, target);
	     action.perform();
	
	
	}

}

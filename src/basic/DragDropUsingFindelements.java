package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropUsingFindelements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame);
	List<WebElement> source=driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	
	Actions action=new Actions(driver);
	WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
	for(int i=1;i<=source.size();i++)
	{
		WebElement destination=source.get(i);
		action.dragAndDrop(destination, target);
		action.perform();
		Thread.sleep(2000);
	}
	
		}

}

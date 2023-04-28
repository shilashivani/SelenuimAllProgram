package practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class MouseActionDragNdropPractice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@name='google_esf']"));
		driver.switchTo().frame(frame);
		List<WebElement> source=driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		Actions action=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
		for(int i=1;i<source.size();i++)
		{
			WebElement image=source.get(i);
			action.dragAndDrop((WebElement) source, target);
			action.perform();
			Thread.sleep(2000);
			
			
		}
	
		
	}

}

package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class FindElementUsingImageFound {
	public static void main(String[] args) {
		//WebDriver driver=OpenBrowser.OpenBrowser1("http://www.zlti.com");
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		List<WebElement> source=driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		Actions action=new Actions(driver);
		WebElement trush=driver.findElement(By.xpath("//div[@id='trash']"));
		
		for(int i=1;i<source.size();i++)
		{
	     WebElement destination=source.get(i);
	     action.dragAndDrop(destination, trush);
	     action.perform();
	    
		}
		
		
		
	}
}
package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class DragDropMouseAction {
	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=OpenBrowser.OpenBrowser1("https://www.globalsqa.com/demo-site/draganddrop/");
	   WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	   driver.switchTo().frame(frame);
	   WebElement image1=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
	   WebElement image2=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[2]"));
	   WebElement image3=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[3]"));
	   WebElement image4=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[4]"));
	   WebElement taget1=driver.findElement(By.xpath("//div[@id='trash']"));
	   WebElement taget2=driver.findElement(By.xpath("//div[@id='trash']"));
	   WebElement taget3=driver.findElement(By.xpath("//div[@id='trash']"));
	   WebElement taget4=driver.findElement(By.xpath("//div[@id='trash']"));
	   Actions action=new Actions(driver);
	   action.dragAndDrop(image1, taget1).perform();
	   action.dragAndDrop(image2, taget2).perform();
	   action.dragAndDrop(image3, taget3).perform();
	   action.dragAndDrop(image4, taget4).perform();
	   Thread.sleep(4000);
	  WebElement recycle=driver.findElement(By.xpath("(//a[text()='Recycle image'])[1]"));
	  recycle.click();
	  WebElement recycle1=driver.findElement(By.xpath("(//a[text()='Recycle image'])[2]"));
	  recycle1.click();
	  WebElement recycle2=driver.findElement(By.xpath("(//a[text()='Recycle image'])[3]"));
	  recycle2.click();
	  WebElement recycle3=driver.findElement(By.xpath("(//a[text()='Recycle image'])[4]"));
	  recycle3.click();
	  
	   
	   
	
	
	}

}

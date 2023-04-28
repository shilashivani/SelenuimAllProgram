package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class Iframemultiframe {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("http://demo.automationtesting.in/Frames.html");

		WebElement multipleframe=driver.findElement(By.xpath("//a[@href='#Multiple']"));
		multipleframe.click();
		WebElement firstParent=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	      driver.switchTo().frame(firstParent);
	      WebElement secondParent=driver.findElement(By.xpath("iframe[@src='SingleFrame.html']"));
	      driver.switchTo().frame(secondParent);
	      WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
	      text.sendKeys("arise");
	    ////iframe[@src='SingleFrame.html  
	}

}

package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiFrame {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("http://demo.automationtesting.in/Frames.html");

	//	WebElement multipleframe=driver.findElement(By.xpath("//a[@href='#Multiple']"));
		//multipleframe.click();
		WebElement firstframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(firstframe);
		WebElement secondFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(secondFrame);
	WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
	input.sendKeys("arise");
	//driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
	home.click();
	}

}

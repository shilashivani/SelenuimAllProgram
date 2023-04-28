package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class IframeSingle {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("http://demo.automationtesting.in/Frames.html");

		//WebElement singleframe=driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
		//singleframe.click();
		//driver.switchTo().frame(0);//by using index
		driver.switchTo().frame("singleframe");//by using id
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("arise");
		
	}

}

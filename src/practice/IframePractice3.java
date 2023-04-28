package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class IframePractice3 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demoqa.com/frames");
		WebElement page=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(page);
		WebElement gettext=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		String text=gettext.getText();
		System.out.println(text);
		driver.switchTo().parentFrame();
		
	}

}

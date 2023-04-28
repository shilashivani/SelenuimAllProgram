package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class IframePractice2 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demoqa.com/frames");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(iframe);
		WebElement getTex=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		String text=getTex.getText();
		System.out.println(text);
		
		
	}

}

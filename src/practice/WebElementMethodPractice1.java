package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class WebElementMethodPractice1 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		//WebElement clic=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		//clic.click();
		WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium']"));
		boolean result=selenium.isSelected();
		System.out.println(result);
		WebElement display=driver.findElement(By.xpath(""));
		boolean result1=display.isDisplayed();
		System.out.println(result1);
	}

}

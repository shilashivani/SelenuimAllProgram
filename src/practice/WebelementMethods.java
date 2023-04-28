package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class WebelementMethods {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/radio.html");
		WebElement w=driver.findElement(By.cssSelector("input[id='vfb-7-1']"));
		boolean result2=w.isSelected();
		System.out.println(result2);
		
		
		WebElement w1=driver.findElement(By.cssSelector("a[href='https://www.guru99.com/selenium-tutorial.html']"));
		boolean result=w1.isDisplayed();
		System.out.println(result);
		
		//WebElement w2=driver.findElement(By.linkText("Testing"));
		//boolean result1=w2.isSelected();
		//System.out.println(result1);
		WebElement w3=driver.findElement(By.partialLinkText("a[class='dropdown-toggle']"));
		//boolean result2=w3.isSelected();
		//System.out.println(result2);
		w3.click();
		
	}

}

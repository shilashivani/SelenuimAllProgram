package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class WebelementMethodsPractice {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/radio.html");
		//WebElement select=driver.findElement(By.xpath("//a[text()='Selenium']"));
		//select.click();
//    WebElement select=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
//	boolean result=select.isSelected();
//	System.out.println(result);
//	
	WebElement radio1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	//radio1.click();
     boolean result1=radio1.isSelected();
	   System.out.println(result1);
	
	WebElement radio2=driver.findElement(By.xpath("//a[text()='Demo Site']"));
	String result2=radio2.getText();
	System.out.println(result2);
	//radio2.clear();
	
	
	

	
//	
	
	}
	

}

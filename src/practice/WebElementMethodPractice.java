package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class WebElementMethodPractice {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement result=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		//result.click();
		
		WebElement result2=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		//result2.click();
		boolean select=result2.isSelected();
		System.out.println(select);
	
	     WebElement result3=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	   result3.click();
	     boolean select1=result3.isDisplayed();
	      System.out.println(select1);
	      driver.manage().window().minimize();
	
	
	
	}
	
	
	

}

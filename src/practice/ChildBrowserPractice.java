package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ChildBrowserPractice {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
	    WebElement banking=driver.findElement(By.xpath("//span[text()='Banking & Finance']"));
	    banking.click();
	    WebElement hr=driver.findElement(By.xpath("(//a[@class='ntc__chip-wrapper'])[9]"));
	    hr.click();
	    Set <String> handles=driver.getWindowHandles();
	    
	   Iterator <String> i =handles.iterator();
	   while(i.hasNext())
	   {
		        String handle=i.next();
		        driver.switchTo().window(handle);
		        String title=driver.getTitle();
		        System.out.println(title);
		        if(title.equals("Bfsi Jobs, 5538 Bfsi Job Vacancies In February 2023 - Naukri.com"))
		        {
		        	WebElement heading=driver.findElement(By.xpath("//a[text()='Jr Accountant (JL1) - OtC']"));
		        	boolean result=heading.isDisplayed();
		        	System.out.println(result);
		        	break;
		        }
		    System.out.println("loop");    
	   }

	}

}

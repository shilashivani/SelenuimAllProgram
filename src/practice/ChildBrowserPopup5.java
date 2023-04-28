package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ChildBrowserPopup5 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
	    WebElement remote=driver.findElement(By.xpath("//span[text()='Remote']"));
           remote.click();
       Set <String> handle=driver.getWindowHandles();
       Iterator <String> i=handle.iterator();
       while(i.hasNext())
       {
    	   String handles=i.next();
    	    driver.switchTo().window(handles);
    	     String title=driver.getTitle();
    	      System.out.println(title);
    	    if(title.equals("Remote Jobs, 8184 Remote Job Vacancies In February 2023 - Naukri.com"))
    	    {
    	    	WebElement heading=driver.findElement(By.xpath("//a[text()='Work FROM Home/NON Voice']"));
    	    	boolean result=heading.isDisplayed();
    	    	System.out.println(result);
    	    	}
       }
	}

}

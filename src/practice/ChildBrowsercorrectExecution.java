package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ChildBrowsercorrectExecution {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
		WebElement company=driver.findElement(By.xpath("//div[text()='Companies']"));
		company.click();
		Set <String> handles =driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		while(i.hasNext())
		{
			
	       String handle=i.next();
	    driver.switchTo().window(handle);
	   String title=driver.getTitle();
	   System.out.println(title);
	     if(title.equals("List of top companies hiring in India - Naukri.com"))
	     {
	    	 WebElement heading=driver.findElement(By.xpath("//h1[text()='Top companies hiring now']"));
	    	 boolean result=heading.isDisplayed();
	    	 System.out.println(result);
	    	 System.out.println("loop");
	    	 break;
	 
	     }
		}
		
	}

}

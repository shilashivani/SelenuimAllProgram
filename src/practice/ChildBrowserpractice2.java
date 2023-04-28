package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ChildBrowserpractice2 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
	    WebElement remote=driver.findElement(By.xpath("//span[text()='Remote']"));
	    remote.click();
	   Set <String> handel= driver.getWindowHandles();
	   Iterator <String> i=handel.iterator();
	   while(i.hasNext())
	   {
		   String handles=i.next();
		   driver.switchTo().window(handles);
		   String title=driver.getTitle();
		  System.out.println(title);
		  if(title.equals("Jobs - Recruitment - Job Search -  Employment - Job Vacancies - Naukri.com"));
		  {
			  WebElement heading=driver.findElement(By.xpath("//h1[text()='Find your dream job now']"));
			  boolean result=heading.isDisplayed();
			  System.out.println(result);
			  break;
		  }
	   }
		
	}

} 
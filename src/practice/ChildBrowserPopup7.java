package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import basic.OpenBrowser;

public class ChildBrowserPopup7 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
		WebElement marketing=driver.findElement(By.xpath("//div[text()='Marketing jobs']"));
		marketing.click();
    Set<String> handles=driver.getWindowHandles();
   Iterator<String> i=handles.iterator();
   while(i.hasNext()) {
	   String handle =i.next();
	   driver.switchTo().window(handle);
	  String url= driver.getCurrentUrl();
	  if(url.equals("https://www.naukri.com/marketing-jobs?src=discovery_trendingWdgt_homepage_srch"))
	  {
		  WebElement title=driver.findElement(By.xpath("Marketing Jobs - Latest Marketing Job Vacancies - Naukri.com"));
		  boolean result=title.isDisplayed();
		  System.out.println(result);
		  break;
		  
	  }System.out.println("loop");
   }
	}

}

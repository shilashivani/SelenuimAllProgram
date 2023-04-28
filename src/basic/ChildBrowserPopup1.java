package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopup1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
	    WebElement remote=driver.findElement(By.xpath("//a[@title='Remote']"));
		remote.click();
		 WebElement mnc=driver.findElement(By.xpath("//span[text()='MNC']"));
			mnc.click();
			Set<String> handles=driver.getWindowHandles();
			 Iterator<String> s=handles.iterator();
			 while(s.hasNext())
			 {
				 Thread.sleep(2000);
				 String handle=s.next();
				 driver.switchTo().window(handle);
				 String title=driver.getTitle();
				 if(title.equals("Mnc Jobs, 67030 Mnc Job Vacancies In February 2023 - Naukri.com"))
				 {
					 WebElement heading=driver.findElement(By.xpath("//a[text()='Assistant Manager / Manager - Hotel and Holiday sales']"));
					 boolean result=heading.isDisplayed();
					 System.out.println(result);
					 break;
				 }
			 }
			
	}

}

package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
	    WebElement remote=driver.findElement(By.xpath("//span[text()='Remote']"));
		remote.click();
		WebElement fresher=driver.findElement(By.xpath("//a[@title='Fresher']"));
		fresher.click() ;
		WebElement mnc=driver.findElement(By.xpath("(//a[@title='MNC'])[2]"));
		mnc.click() ;
		Set<String> handles=driver.getWindowHandles();
		Iterator <String> i=handles.iterator();
		while(i.hasNext())
		{
			String handle=i.next();
			driver.switchTo().window(handle);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals("Mnc Jobs, 67052 Mnc Job Vacancies In February 2023 - Naukri.com"))
			{
				WebElement heading=driver.findElement(By.xpath("//a[text()='Assistant Manager / Manager - Hotel and Holiday sales']"));
				boolean result=heading.isDisplayed();
				System.out.println(result);
				break;
			}System.out.println("loop");
		}
	}

	}



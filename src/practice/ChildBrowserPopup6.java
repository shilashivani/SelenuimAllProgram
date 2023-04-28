package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ChildBrowserPopup6 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
		WebElement service=driver.findElement(By.xpath("//div[text()='Services']"));
		service.click();
		Set<String> handle=driver.getWindowHandles();
		Iterator <String> i=handle.iterator();
		while(i.hasNext())
		{
			String handles=i.next();
			driver.switchTo().window(handles);
			String title=driver.getTitle();
			if(title.equals("Resume Writing Services - CV - Bio data | Naukri Fastforward")) {
				WebElement heading=driver.findElement(By.xpath("//div[text()='Move ahead in career, faster']"));
				boolean result=heading.isDisplayed();
				System.out.println(result);
				break;
			}System.out.println("loop");
		}
		
	}

}

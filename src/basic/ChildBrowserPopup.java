package basic;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopup {
	public static void main(String[] args) throws IOException  {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
	    WebElement job=driver.findElement(By.xpath("//div[text()='Companies']"));
		job.click();
		//String handle=driver.getWindowHandle();
		//System.out.println(handle);
		WebElement mnc=driver.findElement(By.xpath("//div[text()='MNCs']"));
		mnc.click();
		WebElement edtec=driver.findElement(By.xpath("//div[@data-label='Edtech']"));
		edtec.click();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> i=handles.iterator();
		
		while(i.hasNext()) {
		String handle=i.next();
		driver.switchTo().window(handle);
		String title=driver.getTitle();
		if(title.equals("List of top MNCs companies hiring in India - Naukri.com"))
		{
			WebElement heading=driver.findElement(By.xpath("//h1[text()='MNCs actively hiring']"));
			boolean result=heading.isDisplayed();
			System.out.println(result);
			break;
		}
		System.out.println("loop");
		}
		ScreenShotMain.takeScreenshot(driver, "handle");
		
	}
}

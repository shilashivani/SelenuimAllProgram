package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ScrollUpDown {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
		WebElement wb=driver.findElement(By.xpath("(//img[@loading='lazy'])[7]"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true)",wb);
		//js.executeScript("window 11.scrollBy(100,200");
	}

}

package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class ScrollUpScrollDown {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naukri.com/");
		WebElement wb=driver.findElement(By.xpath("//a[text()='Grievances']"));
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("argumnets[0] scrollIntoView[True]",js);
	}

}

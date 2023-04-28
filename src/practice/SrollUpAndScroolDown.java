package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class SrollUpAndScroolDown {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
     WebElement scroll=driver.findElement(By.xpath("//a[text()='Footwear & Bags']"));
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("arguments[0].scrollIntoView(true)", scroll);
	}

}

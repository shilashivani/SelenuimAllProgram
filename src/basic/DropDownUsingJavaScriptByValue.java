package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownUsingJavaScriptByValue {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.bstackdemo.com/");
		WebElement value=driver.findElement(By.xpath("//option[text()='Lowest to highest']"));
		value.click();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0],value=lowestprice", value);
	}

}

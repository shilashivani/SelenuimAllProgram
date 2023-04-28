package EcommerceProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class SearchProduct {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com");
		WebElement search=driver.findElement(By.xpath("//input[@id='header_search_text']"));
		search.sendKeys("mobile");
	}
}



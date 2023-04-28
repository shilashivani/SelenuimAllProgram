package BrokenLink;


import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class GettingUrlToWebpage {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.bing.com/");
		List<WebElement> url=driver.findElements(By.tagName("a"));
		for(int i=0;i<url.size();i++)
		{
		String attribute=url.get(i).getAttribute("href");
		System.out.println(attribute);
		}
	}

}

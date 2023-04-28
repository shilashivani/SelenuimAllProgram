package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class FindElementsExample {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
		List<WebElement> stock =driver.findElements(By.xpath("//span[text()='Kitchenware']"));
		for(int i=0;i<stock.size();i++)
		{
			System.out.println(stock.get(i).getText());
		}
	}

}

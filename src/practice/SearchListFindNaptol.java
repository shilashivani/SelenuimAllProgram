package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class SearchListFindNaptol {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.amazon.in/");
		List<WebElement> search=driver.findElements(By.xpath("//select[@id='searchDropdownBox']"));
		for(int i=0;i<search.size();i++)
		{
			System.out.println(search.get(i).getText());
		}
	}

}

package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class searchDropDownBoxNaptol {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
		List<WebElement> search=driver.findElements(By.xpath("//span[text()='Shopping Categories']"));
		for(int i=0;i<search.size();i++)
		{
			System.out.println(search.get(i).getText());
		}
	}

}

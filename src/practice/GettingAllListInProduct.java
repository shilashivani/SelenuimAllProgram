package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class GettingAllListInProduct {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
		
		List<WebElement> product=driver.findElements(By.xpath("//div[@onmouseover='javascript:menu.showMainMenu(true)']"));
		Actions action=new Actions(driver);
		action.scrollToElement((WebElement) product);
		action.perform();
		for(int i=0;i<product.size();i++)
		{
			String list=product.get(i).getText();
			System.out.println(list);
		}
	}

}

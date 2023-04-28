package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class GetColumnInTable {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> column=driver.findElements(By.xpath("((//table)[2]//thead//th)[2]"));
		for(int i=0;i<column.size();i++)
		{
			System.out.println(column.get(i).getText());
		}
	}

}

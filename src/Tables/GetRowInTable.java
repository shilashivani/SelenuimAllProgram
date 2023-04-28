package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class GetRowInTable {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> rowData=driver.findElements(By.xpath("(//table)[2]//tbody//tr"));
		for(int i=0;i<rowData.size();i++)
		{
			System.out.println(rowData.get(i).getText());
		}
	}

}

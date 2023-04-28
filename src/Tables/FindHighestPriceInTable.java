package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class FindHighestPriceInTable {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> price=driver.findElements(By.xpath("((//table)[2]//tbody//td)[4]"));
		double max=0;
		int index=0;
		for(int i=0;i<price.size();i++)
		{
			String hprice =price.get(i).getText();
			double maxprice=Double.parseDouble(hprice);
			if(maxprice>max)
			{
				max=maxprice;
				index=i+1;
			}
			
		}
		System.out.println(max);
		WebElement maxname=driver.findElement(By.xpath("((//table)[2]//tbody//tr//td)[1]["+index+"]"));
		System.out.println(maxname.getText());
	}

}

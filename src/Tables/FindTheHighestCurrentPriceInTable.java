package Tables;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class FindTheHighestCurrentPriceInTable {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>currentPrice=driver.findElements(By.xpath("((//table[2])//tbody//td[4])"));
		double max=0;
		int index=0;
		for(int i=0;i<currentPrice.size();i++) {
			String price=currentPrice.get(i).getText();
			double highestPrice=Double.parseDouble(price);
			
			if(highestPrice>max)
			{
				max=highestPrice;
				index=i+1;
				
			}
		}System.out.println("max price"+max);
		WebElement stockname=driver.findElement(By.xpath("((//table)[2]//tbody//tr//td[1])["+index+"] "));
		System.out.println(stockname.getText());
		
	}
}
	
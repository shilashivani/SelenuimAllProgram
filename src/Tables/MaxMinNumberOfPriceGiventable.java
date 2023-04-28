package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class MaxMinNumberOfPriceGiventable {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> currentPrice =driver.findElements(By.xpath("(//table)[2]//tbody//tr//td[4]"));
	
		double max = 0;
		int index = 0;
		
		for(int i =0; i<currentPrice.size();i++)//4
		{
			String price =currentPrice.get(i).getText();
			
			double stockPrice = Double.parseDouble(price);//120
			
			
			if(stockPrice > max)//true
			{
				max = stockPrice;//120.0
				index = i+1;//4
			}
				
		}
		
		double min =max;//120.0
		int leastIndex = 0;
		
		for(int j=0; j<currentPrice.size(); j++)//4
		{
			String cPrice =currentPrice.get(j).getText();
			
			double minPrice = Double.parseDouble(cPrice);//45.0
			
			if(minPrice< min)
			{
				min = minPrice;//45.0
				leastIndex = j+1;
			}
			
		}
		
		
		System.out.println("max price is "+ max);
		WebElement stockName =driver.findElement(By.xpath("((//table)[2]//tbody//tr//td[1])["+index+"]"));
		System.out.println(stockName.getText());
	
		System.out.println("Min price is "+ min);
		WebElement minStockName =driver.findElement(By.xpath("((//table)[2]//tbody//tr//td[1])["+leastIndex+"]"));
		System.out.println(minStockName.getText());
	}
	
	
	}



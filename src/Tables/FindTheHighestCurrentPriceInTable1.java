package Tables;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basic.OpenBrowser;

public class FindTheHighestCurrentPriceInTable1 {
	public static void main(String[] args) {
	WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> highestprice=driver.findElements(By.xpath("(//table)[2]//tbody//td[4]"));
	 double  max=0;
	 int index=0;
		 
		for(int i=0;i<highestprice.size();i++) {
			
			String price=(highestprice.get(i).getText());
			
			double stockPrice=Double.parseDouble(price);
			if(stockPrice>max) {
				max=stockPrice;
				index=i+1;
			}
		
			
		
	 
		}
		System.out.println("max price is"+max); 
		WebElement companyName=driver.findElement(By.xpath("((//table)[2]//tbody//tr//td[1])["+index+"]"));
		System.out.println(companyName.getText());
		
		
	}
}
	


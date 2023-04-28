package practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class CountryGetUsingList {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/checkout/shippingaddress.html");
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='localization_dropdown']//option"));
		
	for(int i=0;i<list.size();i++)
	{
		String country=list.get(i).getText();
		System.out.println("The Number Of country is="+country);
	}
	}

}

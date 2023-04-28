package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class GettingAllCityusingList {
	public static void main(String[] args) {
		
	
	WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/checkout/shippingaddress.html");
	List<WebElement> state=driver.findElements(By.xpath("//select[@id='localization_dropdown']//option"));
	//int size=state.size();
	for(int i=0;i<state.size();i++)
	{
//		String s=state.get(i).getText();
//		System.out.println();
	int text=state.size();
	System.out.println(text);
	}
	

	
	
}

}
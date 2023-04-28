package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class WebElementMethodPractice4 {
	public static void main(String[] args) {
//		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.amazon.in/");
//		WebElement amazon=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		amazon.sendKeys("iphone");
//		WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//		search.click();
//		String s=driver.getWindowHandle();
//		
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.amazon.in/s?k=iphone&crid=RWX5167RHGZB&sprefix=iph%2Caps%2C396&ref=nb_sb_noss_2");
	WebElement chekbox=driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']"));
	chekbox.click();//isSelected();
	}

}

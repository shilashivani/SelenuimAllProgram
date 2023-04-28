package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains {
	public static void main(String[] args) {
		System.setProperty("", "");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement create=driver.findElement(By.xpath(""));
		
	}

}

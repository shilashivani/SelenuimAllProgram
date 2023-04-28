package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("Arise@gmail.com");
	//WebElement email=driver.findElement(By.tagName("button"));
	//email.click();//use tagname locator
	WebElement e=driver.findElement(By.xpath(""));
	
	
	}

}

package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.xpath("//input[@name=\"email\"]"));
	email.sendKeys("arise@gmail.com");
	WebElement pass=driver.findElement(By.xpath("//input[@name=\"pass\"]"));
	pass.sendKeys("12345");
	WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	//login.click();
	
	}

}

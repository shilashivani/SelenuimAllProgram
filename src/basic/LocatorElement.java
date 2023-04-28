package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Crome Driver111\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement adress=driver.findElement(By.id("email"));
	adress.sendKeys("Arise@gmai.com");
    WebElement password=driver.findElement(By.id("pass"));
	password.sendKeys("12345");
	WebElement login=driver.findElement(By.tagName("button"));
	login.click();
	
	
	
	
	//driver.findElement(By.id("email")).sendKeys("Arise@gmail.com");
	//driver.findElement(By.id("pass")).sendKeys("12345");
	//WebElement w =driver.findElement(By.tagName("button"));
	//w.click();
//	WebElement wp=driver.findElement(By.id("email"));
	//wp.getAttribute("arise");
	
	}

}

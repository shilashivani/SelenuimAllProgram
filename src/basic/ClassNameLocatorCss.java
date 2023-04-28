package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorCss {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
     WebElement email=driver.findElement(By.cssSelector("input[type=\"text\"]"));
	email.sendKeys("shila@gmail.com");
	WebElement Pass=driver.findElement(By.cssSelector("input[type=\"password\"]"));
	Pass.sendKeys("12345");
	WebElement login=driver.findElement(By.partialLinkText(""));
	login.click();
	WebElement login1=driver.findElement(By.cssSelector("input[type='text']"));
	login1.sendKeys("");
	}
}

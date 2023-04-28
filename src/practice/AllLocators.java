package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
  // driver.get("https://www.facebook.com/");
  // WebElement email=driver.findElement(By.id("email"));
  // email.sendKeys("Arise@gmail.com");
  // WebElement pass=driver.findElement(By.name("pass"));
  // pass.sendKeys("12345");
  // WebElement login= driver.findElement(By.tagName("button"));
  // login.click();
   driver.get("https://www.amazon.in/amazonprime");
   WebElement search=driver.findElement(By.cssSelector("input[type=\"text\"]"));
   search.sendKeys("smart watch");
   search.click();
	}
}

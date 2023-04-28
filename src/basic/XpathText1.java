package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText1 {
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement forgot=driver.findElement(By.xpath("(//a[@href='#']) [2]"));
	forgot.click();

}
}
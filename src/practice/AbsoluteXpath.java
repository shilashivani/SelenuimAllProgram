package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		email.sendKeys("arise@gmail.com");
		WebElement pass=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));
		pass.sendKeys("12345");
		WebElement login=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button"));
		//login.click();
		WebElement forgot=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[3]/a"));
		//forgot.click();
		WebElement create=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]/a"));
		create.click();		
		
		
	}

}

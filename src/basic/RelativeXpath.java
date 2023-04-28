package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("(//html//body//input)[3]"));
		email.sendKeys("arise@gmail.com");
		WebElement pass=driver.findElement(By.xpath("(//html//body//input)[4]"));
		pass.sendKeys("12345");
//		WebElement log=driver.findElement(By.xpath("//html//body//button"));
//		log.click();
//		WebElement forgot=driver.findElement(By.xpath("(//html//body//a)[2]"));
//		forgot.click();
		WebElement create=driver.findElement(By.xpath("(//html//body//a)[3]"));	
	    create.click();
	}

}

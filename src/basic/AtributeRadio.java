package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtributeRadio {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
	checkbox.click();
	WebElement radio1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
	boolean radio=radio1.isSelected();
	radio1.click();
	System.out.println(radio);
	WebElement selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	 selenium.click();
	 WebElement s=driver.findElement(By.xpath("(//a[@title='Home'])[2]"));
	boolean result=s.isSelected();
	System.out.println(result);
	
	
	}

}

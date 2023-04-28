package POMPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver OpenBrowser(String url) {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		return driver;
	}

}

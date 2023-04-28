package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMinimize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://mail.google.com/mail/u/0/?tab=wm#inbox");//hit url on browser
	Options op=driver.manage();
	Window win=op.window();
	win.maximize();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.manage().window().minimize();
	}

}

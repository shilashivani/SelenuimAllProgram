package basic;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizePointPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/?tab=wm#inbox");
Dimension d=new Dimension(900,800);
driver.manage().window().setSize(d);
Thread.sleep(2000);
Point p=new Point(300,400);
driver.manage().window().setPosition(p);

	
	
	}

}

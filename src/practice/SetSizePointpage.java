package practice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizePointpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://meet.google.com/?authuser=0");
	Dimension d=new Dimension(800,900);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	Point p=new Point(300,400);
	driver.manage().window().setPosition(p);
	
	
	
	
	}

}

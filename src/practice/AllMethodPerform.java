package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodPerform {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com/?affid=siteplug&affExtParam1=60a484c7cfb829c55df8103e4a74fe48");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	Dimension d=new Dimension(800,900);
	driver.manage().window().setSize(d);
	 
	Point p=new Point(200,300);
	 driver.manage().window().setPosition(p);
	 
	 String title= driver.getTitle();
	 System.out.println(title);
	 
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
	 
	
	
	
	}

}

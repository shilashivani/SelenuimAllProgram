package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	//driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911441658757&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5nz8knj2kb_e");
	Navigation nav=driver.navigate();
	nav.to("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72911441658757&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5nz8knj2kb_e");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	}

}

package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethodPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9301523%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIsZ_C1IXn_AIVEJJmAh2uUgWjEAAYASAAEgJu7_D_BwE");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Dimension d=new Dimension(800,900);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
	       Point p=new Point(200,300);
	       driver.manage().window().setPosition(p);
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
	       driver.manage().window().minimize();
	       String title=driver.getTitle();
	       System.out.println(title);
	       String url=driver.getCurrentUrl();
	       System.out.println(url);
	       
		
	
	}

}

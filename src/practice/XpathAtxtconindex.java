package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAtxtconindex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9301523%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI9ab7xbTl_AIVDhsrCh0cJwYZEAAYASAAEgKAOfD_BwE");
		WebElement fname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));//by attribute
		fname.sendKeys("shila");
		WebElement lname=driver.findElement(By.xpath("//input[contains(@ name,'lastname')]"));//by contains path
		lname.sendKeys("Deokar");
		WebElement mnumber=driver.findElement(By.xpath("(//input[@type='text']) [3]"));//byindex path
		mnumber.sendKeys("1234567893");
		WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("vedika");
		WebElement dbirth=driver.findElement(By.xpath("(//select[@name='birthday_day'])"));//by index path
	dbirth.sendKeys("6");
	WebElement famele=driver.findElement(By.xpath("//label[text()='Female']"));
	famele.click();
	WebElement male=driver.findElement(By.xpath("//label[text()='Male']"));
	
	
	}

}

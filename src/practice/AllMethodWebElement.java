package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethodWebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/radio.html");
	driver.manage().window().maximize();
	//isselected method
	WebElement testing=driver.findElement(By.xpath("//a[text()='Testing']"));
	
	//testing.click();
	 boolean result1=testing.isSelected();
	System.out.println(result1);
	
	
	//isDisplayed(by using text Xpath)
	WebElement project=driver.findElement(By.xpath("//a[text()='Insurance Project']"));
	project.click();
	boolean result2=project.isDisplayed();
     System.out.println(result2);
	
	//clear method 
	WebElement project1=driver.findElement(By.xpath("(//a[@title='Home'])[2]"));
	//project1.clear();
	
	WebElement text=driver.findElement(By.xpath("(//a[@rel='home'])[2]"));
	String textDisplay=text.getText();
	System.out.println(textDisplay);
	
	driver.manage().window().minimize();	
	}

}

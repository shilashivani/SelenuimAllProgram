package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsOfWebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		//checkbox
		WebElement radio=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		radio.click();
		
		
		//isSelect method
		WebElement option1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		option1.click();
		boolean result=option1.isSelected();
		System.out.println(result);
		
		//isDisplayed method
		WebElement selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		selenium.click();
		boolean result2=selenium.isDisplayed();
		System.out.println(result2);
		
		//textGet method
		WebElement title=driver.findElement(By.xpath("(//a[@title='Home'])[2]"));
		String title1=title.getText();
		System.out.println(title1);
		
		//click
		//WebElement w=driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/insurance/v1/index.php']"));
	//	w.click();		
		
		//isEnabled
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		checkbox.click();
		boolean result3=checkbox.isEnabled();
		System.out.println(result3);
		

		
		
		
		
	
	}

}

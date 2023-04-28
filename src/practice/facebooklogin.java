package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class facebooklogin {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
         email.sendKeys("shilababar@gmail.com");
         WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
         pass.sendKeys("shilababar@52");
         WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
         login.click();
         
	}
	}




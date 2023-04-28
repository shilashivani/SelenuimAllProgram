package EcommerceProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class HitBrowser {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
		WebElement ragister=driver.findElement(By.xpath("//a[@id='login-panel-link']"));
		ragister.click();
		WebElement mobilenumber=driver.findElement(By.xpath("//input[@id='registration-basic-panel-mobile']"));
        mobilenumber.sendKeys("7020259050");
        WebElement continue1=driver.findElement(By.xpath("//input[@id='registration-basic-panel-submit']"));
        continue1.click();
        WebElement otp=driver.findElement(By.xpath("//input[@id='registration-otp-panel-otp']"));
       otp.sendKeys("936112");
       WebElement submit=driver.findElement(By.xpath("//input[@id='registration-otp-panel-submit']"));
       submit.click();
	}

}

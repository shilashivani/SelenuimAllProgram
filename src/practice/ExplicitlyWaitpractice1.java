package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.OpenBrowser;

public class ExplicitlyWaitpractice1 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/profile/MyAccount.html");
		WebElement ws=driver.findElement(By.xpath("//table//tbody//tr"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(500));
		wait.until(ExpectedConditions.visibilityOf(ws));
		
		
		ws.sendKeys("shila");
		
	}

}

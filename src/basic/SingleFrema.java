package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleFrema {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("http://demo.automationtesting.in/Frames.html");

		WebElement singleIframe=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		//driver.switchTo().frame(singleIframe);
		//driver.switchTo().frame(0);
	 WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
		input.sendKeys("arise");
		
		
	}

}

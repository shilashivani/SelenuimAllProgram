package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.OpenBrowser;

public class ActionsWithMouseNaaptol {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.naaptol.com/");
		WebElement shoping=driver.findElement(By.xpath("//span[text()='Shopping Categories']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(shoping).perform();
		
	
		WebElement  movetomouse=driver.findElement(By.xpath("(//li[@id='cshow2'])[1]"));
		movetomouse.click();
	}

}

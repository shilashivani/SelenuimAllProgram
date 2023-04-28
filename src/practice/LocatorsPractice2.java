package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class LocatorsPractice2 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
		//id locator
		//WebElement email=driver.findElement(By.id("email"));//by using id
		//email.sendKeys("shila@gmail.com");
		//name locator
		//WebElement pass=driver.findElement(By.name("pass"));//by using name
		//pass.sendKeys("12345");
		//tagname locator
		WebElement log=driver.findElement(By.tagName("button"));//by using tagname
		//log.click();
		
		//Syntax cssSelector  tagname[Atribute ='attribute value']
		WebElement email1=driver.findElement(By.cssSelector("input[name='email']"));//by using cssSelector
		email1.sendKeys("shila@gmail.com");
		//By Using LinkText
		WebElement forgot=driver.findElement(By.linkText("Forgotten password?"));
		//forgot.click();
		//By using partialLinkText
		WebElement create=driver.findElement(By.partialLinkText("Create new "));
		//create.click();
		WebElement create1=driver.findElement(By.className("_6ltij"));
		create1.click();
		

		
	}

}

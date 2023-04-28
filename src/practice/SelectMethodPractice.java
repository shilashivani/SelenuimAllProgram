package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basic.OpenBrowser;

public class SelectMethodPractice {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	   driver.manage().window().maximize();
		WebElement product=driver.findElement(By.xpath("//select[@id='first']"));
	 Select select=new Select(product);
	 select.selectByValue("Apple");
	 
	WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
	Select select1=new Select(animal);
	select1.selectByIndex(3);
	
	WebElement food=driver.findElement(By.xpath("//select[@id='second']"));
	Select select2=new Select(food);
	select2.selectByVisibleText("Burger");
	
	}

}

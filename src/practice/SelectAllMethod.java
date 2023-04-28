package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basic.OpenBrowser;

public class SelectAllMethod {
	public static void main(String[] args) throws IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement product=driver.findElement(By.xpath("//select[@id='first']"));
	   Select select=new Select(product);
	   select.selectByValue("Google");
	   

	   //By Using SelectByValue
	   
	   WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
	   Select select1=new Select(animal);
	   select1.selectByIndex(2);

	   
	   //By Using selectByVisibleText
	   WebElement food=driver.findElement(By.xpath("//select[@id='second']"));
	   Select select2=new Select(food);
	   select2.selectByVisibleText("Bonda");
	   ScreenShot.takeScreenshot(driver,"select");
	   	}
		
	}



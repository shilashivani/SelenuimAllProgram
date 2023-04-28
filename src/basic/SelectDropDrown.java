package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDrown {
	public static void main(String[] args) throws IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement product=driver.findElement(By.xpath("//select[@id='first']"));
		
		//Method usin of selectbyvalue()
		
		Select select=new Select(product);
		select.selectByValue("Google");//Selecting using the  value
		//select.selectByIndex(1);//selecting using the index value
		//select.selectByVisibleText("Iphone");
		
		//method using of selectByIndex()
		
		WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
		Select select1=new Select(animal);
		select1.selectByIndex(1);
		
		//Method Using by selectByVesibleText()
		
		WebElement food=driver.findElement(By.xpath("//select[@id='second']"));
		Select select2=new Select(food);
		select2.selectByVisibleText("Bonda");
		
		
		ScreenShotMain.takeScreenshot(driver, "select");
		
	}

}

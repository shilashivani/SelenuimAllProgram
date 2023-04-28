package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basic.OpenBrowser;

public class SelectClassPractice1 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement page=driver.findElement(By.xpath("//select[@id='animals']"));
		Select select=new Select(page);
		select.selectByValue("babycat");
	}

}

package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basic.OpenBrowser;

public class SelectClassPractice5 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement select=driver.findElement(By.xpath("//option[text()='Austria']"));
	select.click();
	Select city=new Select(select);
	city.selectByValue("value=AUT");
	
	
	
	}

}

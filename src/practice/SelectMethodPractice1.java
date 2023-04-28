package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class SelectMethodPractice1 {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://testkru.com/Elements/RadioButtons");
		driver.manage().window().maximize();
		WebElement we=driver.findElement(By.className("(//label[text()='First Select'])"));
		we.click();
	}

}

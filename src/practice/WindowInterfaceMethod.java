package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import basic.OpenBrowser;

public class WindowInterfaceMethod {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/radio.html");
		Dimension d=new Dimension(700,900);
		driver.manage().window().setSize(d);
		Point p=new Point(200,500);
		driver.manage().window().setPosition(p);
	}

}

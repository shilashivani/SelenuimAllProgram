package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basic.OpenBrowser;

public class ScreenShot3 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        File sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("C:\\Users\\91702\\Pictures\\JavaScreenShot\\Imag.jpg");
	   FileHandler.copy(sourse, destination);
	
	}

}

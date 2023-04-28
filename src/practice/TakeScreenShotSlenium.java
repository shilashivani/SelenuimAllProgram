package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basic.OpenBrowser;

public class TakeScreenShotSlenium {
	public static void main(String[] args) throws IOException {
		WebDriver driver=OpenBrowser.OpenBrowser1("https:\\facebook.com");
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter time=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
	     String time1=dateTime.format(time);
	     File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File destination=new File("C:\\Users\\91702\\Pictures\\JavaScreenShot\\facebook.img" +time1 );
	     FileHandler.copy(source, destination);
	}

}

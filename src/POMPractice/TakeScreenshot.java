package POMPractice;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	public static void getScreenshot(String time,String name) throws IOException {
		WebDriver driver=Browser.OpenBrowser("https:\\facebook.com");
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
	 String time1=dateTime.format(date);
	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File destination=new File("C:\\Users\\91702\\Pictures\\JavaScreenShot\\time1.jpg");
	 FileHandler.copy(source, destination);
	 
	 
	}

}

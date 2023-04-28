package basic;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotMain {
	public static void takeScreenshot(WebDriver driver,String name) throws IOException {
		
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
		String time=dateTime.format(pattern);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\91702\\Pictures\\JavaScreenShot\\"+name+time+"jpg");
		FileHandler.copy(source, destination);
	}

}

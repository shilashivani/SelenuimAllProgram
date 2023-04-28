package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenpractice {
	public static void takeScreenShot(WebDriver driver,String name) throws IOException
	{
		LocalDateTime dateTime=LocalDateTime.now();
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
		String time=dateTime.format(pattern);
		TakesScreenshot shot=((TakesScreenshot)driver);
		File source=shot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\91702\\Pictures\\JavaScreenShot\\"+name+time+".jpg");
		FileHandler.copy(source, destination);
	}
}

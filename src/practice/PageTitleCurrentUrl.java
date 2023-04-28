package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basic.OpenBrowser;

public class PageTitleCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.facebook.com/");
	     String title=driver.getTitle();
	     System.out.println(title);
	     String url=driver.getCurrentUrl();
	     System.out.println(url);
	  
	
		
	
	}
		
	}



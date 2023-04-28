package BrokenLink;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class BrokenLink {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://www.amazon.in/");
		List<WebElement> ankorTag=driver.findElements(By.tagName("a"));
		int size=ankorTag.size();
		for(int i=0;i<ankorTag.size();i++)
		{
			String url=ankorTag.get(i).getAttribute("href");
			System.out.println(url);
			if(url==null || url.isEmpty())
			{
				System.out.println("Url Is empty or Invalied");
				continue;
			}
			try
			{
				URL u=new URL(url);
				HttpURLConnection huc=(HttpURLConnection)u.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				int responseCode=huc.getResponseCode();
				System.out.println(responseCode);
				if(responseCode>=400)
				{
					System.out.println("URL is Broken-"+url);
					
				}
				else
				{
					System.out.println("Url is valied:-"+url);
				}
			
				
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
	}

}

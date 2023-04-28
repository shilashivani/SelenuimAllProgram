package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.OpenBrowser;

public class GetHeadingInTable {
	public static void main(String[] args) {
		WebDriver driver=OpenBrowser.OpenBrowser1("https://demo.guru99.com/test/web-table-element.php");
	 List<WebElement> heading=driver.findElements(By.xpath("(//table)[2]//thead//tr//th"));
	System.out.println(heading);
	 
	 for(int i=0;i<heading.size();i++)
	 {
		 System.out.print(heading.get(i).getText());
		 
	 }
		
	}

}

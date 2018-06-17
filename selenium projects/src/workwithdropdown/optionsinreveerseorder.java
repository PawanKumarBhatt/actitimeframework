package workwithdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class optionsinreveerseorder {
public static void main(String[] args) {
	//open fire-fox browser
			WebDriver driver=new FirefoxDriver();
			//navigate to web-page
			driver.get("file:///C:/Users/PAWAN%20BHATT/Desktop/pawanbhatt.html");
			//identify drop-down
			WebElement  dwb=driver.findElement(By.xpath("//select[@multiple='true']"));
			//create object of select class
			Select sel=new Select(dwb);
			//expected values are
			
			List<WebElement> lst=sel.getOptions();
			for(int i=lst.size()-1;i>=0;i--)
			{
				System.out.println(lst.get(i).getText());
				
			}
}
}

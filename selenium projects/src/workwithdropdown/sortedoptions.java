package workwithdropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sortedoptions {
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
		TreeSet t=new TreeSet();
		for(WebElement  temp:lst)
		{
			t.add(temp.getText());
		}
		//display elements in sorted order
		for(Object option:t)
		{
			System.out.println(option);
		}
	}

}

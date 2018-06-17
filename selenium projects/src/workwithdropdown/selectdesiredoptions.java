package workwithdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdesiredoptions {
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
			String expt1="java";
			String expt2="python";
			List<WebElement> lst=sel.getOptions();
			for(int i=0;i<lst.size();i++)
			if(lst.get(i).getText().equals(expt1)||lst.get(i).getText().equals(expt2))
			{
				sel.selectByIndex(i);
				
			}
}
}

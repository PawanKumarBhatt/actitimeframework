package workwithdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectdropdowns {
public static void main(String[] args) {
	//open fire-fox browser
		WebDriver driver=new FirefoxDriver();
		//navigate to web-page
		driver.get("file:///C:/Users/PAWAN%20BHATT/Desktop/pk.html");
		//identify drop-down
		WebElement  dwb=driver.findElement(By.xpath("//select[@multiple='true']"));
		//create object of select class
		Select sel=new Select(dwb);
		
		List<WebElement> lst=sel.getOptions();
		boolean dst=sel.isMultiple();
		for(int i=0;i<lst.size();i++)
		if(dst)
		{
			sel.selectByIndex(i);
		}
		sel.deselectAll();
		for(int i=0;i<lst.size();i++)
			if(dst)
			{
				sel.selectByIndex(i);
			}
		sel.deselectByIndex(2);
		sel.deselectByVisibleText("rasmalai");
		List<WebElement> lst1=sel.getAllSelectedOptions();
		for(int i=0;i<lst1.size();i++)
			
			{
				System.out.println(lst1.get(i).getText()); 
			}
        System.out.println(sel.getFirstSelectedOption().getText());
}
}

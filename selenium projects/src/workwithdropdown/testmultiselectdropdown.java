package workwithdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testmultiselectdropdown {
public static void main(String[] args) {
	//open fire-fox browser
	WebDriver driver=new FirefoxDriver();
	//navigate to web-page
	driver.get("file:///C:/Users/PAWAN%20BHATT/Desktop/pk.html");
	//identify drop-down
	WebElement  dwb=driver.findElement(By.xpath("//select[@multiple='true']"));
	//create object of select class
	Select sel=new Select(dwb);
	sel.selectByVisibleText("kadhai panner");
	sel.selectByIndex(3);
	boolean dst=sel.isMultiple();
	System.out.println(dst);
}
}

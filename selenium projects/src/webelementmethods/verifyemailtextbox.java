package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyemailtextbox {
public static void main(String[] args) {
	// open empty browser
	WebDriver driver=new FirefoxDriver();
	//navigate to g-mail
	driver.navigate().to("https://www.gmail.com");
	//verify login page
	String s=driver.getTitle();
	if(s.equals("Gmail"))
	{
		System.out.println("pass");
	}
	  else
         {
        	 System.out.println("fail");
         }
	
	//identify email text box
	WebElement ewb=driver.findElement(By.cssSelector("#identifierId"));
	
	//capture the backend value of edit box
	String stewb =ewb.getAttribute("aria-label");
	System.out.println(stewb);
	
	//verify location of  the email text box
	Point eloc=ewb.getLocation();
	System.out.println("x-coordinate ="+eloc.getX());
	System.out.println("y-coordinate ="+eloc.getY());
	
	//verification of  size of email edit  box
	Dimension esize= ewb.getSize();
	System.out.println("height of edit box = "+ esize.getHeight());
	System.out.println("width of eddit box ="+ esize.getWidth());
	
	//tag-name of edit box
	System.out.println(ewb.getTagName());
}
}

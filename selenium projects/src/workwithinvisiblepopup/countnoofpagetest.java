package workwithinvisiblepopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class countnoofpagetest {
public static void main(String[] args) throws InterruptedException {
	//open empty browser
	WebDriver driver=new FirefoxDriver();
	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//open google  page
	driver.get("https://www.google.co.in/");
	//identify auto  edit-box
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("mike tyson",Keys.ENTER);
	int pages=0;
	for(int  i=0;i<=10;i++)
	{	
	WebElement  next=driver.findElement(By.xpath("//span[text()='Next']"));
     System.out.println(next.isDisplayed());
	next.click();
}
	
	
	
}
}

package windowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartitemaddtokart {
public static void main(String[] args) {
	//open the empty browser
	WebDriver driver=new FirefoxDriver();
	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//navigate to flip-kart window
	driver.get("https://www.flipkart.com/");
	//identify pop-up and close  it
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//search for item in auto suggest box
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("woodland");
	driver.findElement(By.xpath("//div[@id='container']/div/header/div[1]/div/div/div/div[1]/form/ul/li[1]/a")).click();
	//identify the item and click on it
	driver.findElement(By.xpath("//div[@class='GQtpzo']/div[3]/div[1]/div[1]/div[4]/div[1]/a[2]")).click();
	//transfer control to child window
	Set<String> set= driver.getWindowHandles();
	Iterator<String> it=set.iterator();
	String parentid=it.next();
	String childid=it.next();
	driver.switchTo().window(childid);
	//identify add to cart and click on it
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	
}
}

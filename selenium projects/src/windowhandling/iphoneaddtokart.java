package windowhandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iphoneaddtokart {
public static void main(String[] args) {
	//open empty browser
	WebDriver driver = new FirefoxDriver();
	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//navigate to  flipkart.com
	driver.get("https://www.flipkart.com");
	//identify pop-up and close  it
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	//identify auto suggest box and pass data
	driver.findElement(By.name("q")).sendKeys("apple");
	driver.findElement(By.xpath("//a[text()='iphone x']")).click();
	//identify price with help of  x-path
	String x="//div[text()='Apple iPhone X (Space Gray, 256 GB)']/../../div[2]/div[1]/div/div[1]";
	//click on apple i-phone product name
	driver.findElement(By.xpath("//div[text()='Apple iPhone X (Space Gray, 256 GB)']")).click();
	//get windows  id
	Set<String> set= driver.getWindowHandles();
	Iterator<String> it=set.iterator();
	String parentid=it.next();
	String childid=it.next();
	driver.switchTo().window(childid);
	//identify cart button and click on it
	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
}
}

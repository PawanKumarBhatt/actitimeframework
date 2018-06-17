package iphonepricefromflipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathtest {
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
			String price = driver.findElement(By.xpath(x)).getText();
			System.out.println(price.substring(1));
}
}

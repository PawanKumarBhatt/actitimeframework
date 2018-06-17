package xpathprogramms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class capturetheproductratingandprice {
public static void main(String[] args) {
	//open empty browser
	WebDriver driver = new FirefoxDriver();
	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//maximize the window
	driver.manage().window().maximize();
	//navigate to  google home-page
	driver.get("https://www.amazon.in");
	//identify auto suggest edit-box
	WebElement ewb=driver.findElement(By.id("twotabsearchtextbox"));
	//enter some data
	ewb.sendKeys("iphone x");
	driver.findElement(By.xpath("//div[@data-keyword='iphone x 256gb silver']")).click();
   //identify price web-element
	String pwb = driver.findElement(By.xpath("//h2[text()='Apple iPhone X (Silver, 256GB)']/../../../../div[2]/div[1]/div[1]/a/span[2]")).getText();
	//display price of i-phone
	System.out.println("Price of  iphone-x is ="+pwb);
	//move to star element
	driver.findElement(By.xpath("//h2[text()='Apple iPhone X (Silver, 256GB)']/../../../../div[2]/div[2]/div/span/span/a/i[2]")).click();;
	//store  the information of  rating  of product
	List<WebElement> lst=driver.findElements(By.xpath("//div[@id='a-popover-1']/div/div[1]/div/div/div/div[*]"));
	//display rating
	for(WebElement temp:lst)
	{
		String rating=temp.getText();
		System.out.println("rating of  product is"+"\n"+rating);
	}
}
}

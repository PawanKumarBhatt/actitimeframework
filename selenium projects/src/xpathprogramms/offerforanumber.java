package xpathprogramms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class offerforanumber {
public static void main(String[] args) {
	//open empty browser
	WebDriver driver = new FirefoxDriver();
	//implicit wait statement
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//navigate to  vodafone.com
	driver.get("https://www.vodafone.in/home-Mumbai");
	//identify drop-down menu and click on pre-paid 121
	driver.findElement(By.xpath("//h3[text()='121 Prepaid Offers']/following-sibling::a[text()='Shop Now']")).click();
	
	//find and feed data in auto-suggestbox
	driver.findElement(By.id("mobileNum")).sendKeys("9999264730");
	
	//identify offers and print them on console
	List<WebElement> lst=driver.findElements(By.xpath("//div[@class='offersBoxes']/div/div[*]"));
	//display offers
	for(WebElement temp: lst)
	{
		String  offers=temp.getText();
		System.out.println(offers);
	}
}
}

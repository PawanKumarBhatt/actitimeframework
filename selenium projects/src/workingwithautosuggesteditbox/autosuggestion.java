package workingwithautosuggesteditbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class autosuggestion {
public static void main(String[] args) {
	//open empty browser
			WebDriver driver = new FirefoxDriver();
			//implicit wait statement
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			//navigate to  google homepage
			driver.get("https://www.google.co.in/");
			//identify auto suggest edit-box
			WebElement ewb=driver.findElement(By.xpath("//input[@type='text']"));
			//enter some data
			ewb.sendKeys("old");
			driver.findElement(By.xpath("//b[text()=' monk']")).click();
           //create object of action  class
            Actions  act=new Actions(driver);
            act.contextClick(driver.findElement(By.partialLinkText("- Wikipedia"))).perform();
            //open link  in new tab
            act.sendKeys("T").perform();
            driver.quit();
}
}

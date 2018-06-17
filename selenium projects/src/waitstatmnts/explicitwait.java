package waitstatmnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
public static void main(String[] args) {
	//open empty browser
	WebDriver driver=new FirefoxDriver();
	//apply implicit wait
	
	//navigate to facebook
	driver.navigate().to("https://www.facebook.com/");
	
	//login to facebook
    driver.findElement(By.id("email")).sendKeys("8860739849");
    driver.findElement(By.id("pass")).sendKeys("07213303610pk");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
	//explicit wait  statement
	WebDriverWait wait=new WebDriverWait(driver,120);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='E=mc^2 becomes m=E/c^2.']")));
	
	//find video  link and  click
	driver.findElement(By.xpath("//p[text()='E=mc^2 becomes m=E/c^2.']")).click();
	
	//find logout and  click on  it
	driver.findElement(By.id("userNavigationLabel")).click();
	driver.findElement(By.xpath("//form[@action='https://www.facebook.com/login/device-based/regular/logout/?button_name=logout&button_location=settings']")).click();
}
}

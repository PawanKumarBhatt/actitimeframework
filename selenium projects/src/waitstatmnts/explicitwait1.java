package waitstatmnts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait1 {
public static void main(String[] args) {
	FirefoxDriver  driver=  new FirefoxDriver();
	
	driver.get("http://www.foxnews.com/");
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='//www.foxnews.com/us/2018/03/18/indiana-man-takes-cab-to-and-from-bank-to-rob-it-police-say.html']")));
    driver.findElement(By.xpath("//a[@href='//www.foxnews.com/us/2018/03/18/indiana-man-takes-cab-to-and-from-bank-to-rob-it-police-say.html']")).click();
}
}

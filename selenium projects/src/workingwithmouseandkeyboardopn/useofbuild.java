package workingwithmouseandkeyboardopn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class useofbuild {
public static void main(String[] args) {
	//open empty browser
		WebDriver driver = new FirefoxDriver();
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//navigate to  drag and drop site
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		//identify source and destination element in  u-i
		WebElement swb=driver.findElement(By.id("draggable"));
		WebElement dwb=driver.findElement(By.id("droptarget"));
		//object of  action class
		Actions act=new Actions(driver);
		act.clickAndHold(swb).moveToElement(dwb).release().build().perform();
}
}

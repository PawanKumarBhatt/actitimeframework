package workingwithmouseandkeyboardopn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovetest {
	public static void main(String[] args) {
		//open empty browser
		WebDriver driver = new FirefoxDriver();
		//implicit wait statement
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//navigate to  amazon site
		driver.get("https://www.amazon.com/");
		//identify department drop-down in ui
		WebElement  dwb=driver.findElement(By.xpath("//span[text()='Departments']"));
		//create object of  action class
		Actions  act=new Actions(driver);
		//move to department dropdown menu
		act.moveToElement(dwb).perform();
		//move to fire tv panel
		act.moveToElement(driver.findElement(By.xpath("//span[@data-nav-panelkey='FireTvPanel']"))).perform();
		//click on games for fire t-v
		driver.findElement(By.xpath("//span[text()='Games for Fire TV']")).click();
	}

}

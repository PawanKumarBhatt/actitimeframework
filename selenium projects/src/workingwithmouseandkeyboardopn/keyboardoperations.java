package workingwithmouseandkeyboardopn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardoperations {
public static void main(String[] args) {
	//open empty browser
			WebDriver driver = new FirefoxDriver();
			//navigate to  amazon site
			driver.get("file:///C:/Users/PAWAN%20BHATT/Desktop/pavan.html");
			//identify user-name  and provide input
			WebElement uwb=driver.findElement(By.id("user"));
			uwb.sendKeys("pawanbhatt");
			//object of action class
			Actions  act=new Actions(driver);
			//double  click under user-name to select text
			act.doubleClick(uwb);
			//copy the text
			act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
			//move to password text
			act.sendKeys(Keys.TAB).perform();
			//paste copy data
			act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
			
}
}

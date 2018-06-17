package deletecustomer;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class deletecustomer {
public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//maximize the open window
	driver.manage().window().maximize();
	//open acti-time application login page
	driver.navigate().to("http://127.0.0.1/login.do");

    //test data
	String exptvlu="RAM";
	
	//find user-name and password and navigate to home page
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();	

	//navigate to  task  page
	driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
	//find and navigate to project and customer
	driver.findElement(By.linkText("Projects & Customers")).click();
	
	//work with drop-down
	WebElement dwb=driver.findElement(By.xpath("//select[@class='controlBorder']"));
	Select sel=new Select(dwb);
	//store drop-down content as list
		List<WebElement> ls= sel.getOptions();
		int s=0;
		for(int i=1;i<ls.size();i++)
		{ 
			
			String actvlu=ls.get(i).getText();
			if(exptvlu.equals(actvlu))
			{
				s++;
				break;
			}
			
		}
		if(s==1)
		{
			//identify edit box and send data
			sel.selectByVisibleText(exptvlu);
			//identify the show button and click
			driver.findElement(By.xpath("//input[@value='  Show  ']")).click();
			//identify check-box and click
			driver.findElement(By.xpath("//a[text()='RAM']/../../../../../../td[6]")).click();
			//delete selected  element
			driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
			//delete by input
			driver.findElement(By.id("deleteButton")).click();
		}
}
}

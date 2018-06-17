package xpathprogramms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailgetmessage {
public static void main(String[] args) {
	        //open empty browser
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//navigate to g-mail page
			driver.get("https://www.gmail.com");
			//identify the email edit box and  edit
			driver.findElement(By.id("identifierId")).sendKeys("pawankumarbhatt07227@gmail.com") ; 
			//identify the next button
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	        //identify the password edit box and edit
	         driver.findElement(By.name("password")).sendKeys("meena2709") ;
	        //identify next button and  click on next
	         driver.findElement(By.xpath("//span[text()='Next']")).click();
	        //identify email subject column
	         List<WebElement> lwb=driver.findElements(By.xpath("//table[@class='F cf zt']/tbody/tr[*]/td[6]"));
	         for(WebElement temp:lwb)
	         {
	        	 String subject=temp.getText();
	        	 System.out.println(subject);
	         }
}
}

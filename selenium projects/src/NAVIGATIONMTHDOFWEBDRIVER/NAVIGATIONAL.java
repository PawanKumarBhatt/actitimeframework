package NAVIGATIONMTHDOFWEBDRIVER;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NAVIGATIONAL {
public static void main(String[] args) throws InterruptedException {
	        //open empty browser
			FirefoxDriver driver=new FirefoxDriver();
			
			//set size  of opened window
			Dimension dem=new Dimension(500,500);
			driver.manage().window().setSize(dem);
			
			//navigate to g-mail page
			driver.navigate().to("https://www.gmail.com");
			
			
			//identify the email edit box and  edit
			driver.findElement(By.id("identifierId")).sendKeys("pawankumarbhatt07227@gmail.com") ; 
			
			//get page source code
			String pagesource= driver.getPageSource();
			System.out.println(pagesource);
			//identify the next button
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2500);
	        //navigate back to userid page
	        driver.navigate().back();
	        Thread.sleep(2500);
	        //navigate to password  page
	        driver.navigate().forward();
	        Thread.sleep(2500);
	        //refresh the page
	        driver.navigate().refresh();
	      //getting cookies 
	        System.out.println("=============");
	      System.out.println(driver.manage().getCookies());  
			//deleting cookies
	      driver.manage().deleteAllCookies();
	      System.out.println("********************************");
	      System.out.println(driver.manage().getCookies());
	        
	       
}
}

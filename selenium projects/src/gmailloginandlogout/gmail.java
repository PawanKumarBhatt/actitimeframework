package gmailloginandlogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail 
{
	public static void main(String[] args) throws InterruptedException
	{
		//open empty browser
		FirefoxDriver driver=new FirefoxDriver();
		
		//navigate to g-mail page
		driver.get("https://www.gmail.com");
		String s=driver.getTitle();
		if(s.equals("Gmail"))
		{
			System.out.println("pass");
		}
		  else
	         {
	        	 System.out.println("fail");
	         }
		
		//identify the email edit box and  edit
		driver.findElement(By.id("identifierId")).sendKeys("pawankumarbhatt07227@gmail.com") ; 
		//identify the next button
        driver.findElement(By.xpath("//span[text()='Next']")).click();
		     
        Thread.sleep(3000);
		
        //identify the password edit box and edit
         driver.findElement(By.name("password")).sendKeys("meena2709") ;
        //identify next button and  click on next
         driver.findElement(By.xpath("//span[text()='Next']")).click();
         Thread.sleep(13000);
         String t= driver.getTitle();
         if(t.equals("Inbox (965) - pawankumarbhatt07227@gmail.com - Gmail"))
 		{
 			System.out.println("pass");
 		}
         else
         {
        	 System.out.println("fail");
         }
        
       
         //navigate to logout element and click
         driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
       
         Thread.sleep(10000);
         
         //identify logout element and  click
         driver.findElement(By.id("gb_71")).click();
         String e= driver.getTitle();
         if(e.equals("Gmail"))
 		{
 			System.out.println("pass");
 		}
         else
         {
        	 System.out.println("fail");
         }
	}

}

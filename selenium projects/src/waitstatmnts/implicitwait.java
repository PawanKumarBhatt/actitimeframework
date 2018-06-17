package waitstatmnts;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitwait {
	public static void main(String[] args) {
		// open empty browser
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
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
				     
		        //identify the password edit box and edit
		         driver.findElement(By.name("password")).sendKeys("********") ;
		        //identify next button and  click on next
		         driver.findElement(By.xpath("//span[text()='Next']")).click();
		         
		         String t= driver.getTitle();
		         if(("Inbox (965) - pawankumarbhatt07227@gmail.com - Gmail").contains(t))
		 		{
		 			System.out.println("pass");
		 		}
		         else
		         {
		        	 System.out.println("fail");
		         }
		        
		       
		         //navigate to logout element and click
		         driver.findElement(By.xpath("//span[@class='gb_db gbii']")).click();
		       
		         
		         
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

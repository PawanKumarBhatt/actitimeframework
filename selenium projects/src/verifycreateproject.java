import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifycreateproject

{

	public static void main(String args[])
	{
	  
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//maximize the open window
		driver.manage().window().maximize();
		//open actitime application login page
		driver.navigate().to("http://127.0.0.1/login.do");
		//verification of login page
		String actutitl=driver.getTitle();
		String expetitl= "actiTIME - Login";
		if(expetitl.equals(actutitl))
		{
			System.out.println("loginpage is verrified== pass");
		}
		else
		{
			System.out.println("loginpage is not verrified== fail");
		}
		
		//find uname and pswd and navigate to home page
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		
		//navigate to  task  page
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	
		
		//verification of taskpage
		String actitl=driver.getTitle();
		String exptitl= "actiTIME - Open Tasks";
		if(exptitl.equals(actitl))
		{
			System.out.println("taskpage is verrified== pass");
		}
		else
		{
			System.out.println("taskpage is not verrified== fail");
		}
		
		//find and navigate to project and customer
		driver.findElement(By.linkText("Projects & Customers")).click();
		
		
		//verify project and customer page
		String  exitle= "Projects";
		if(driver.getTitle().contains(exitle))
		{
			System.out.println("project and customer page is verified== pass");
		}
		else
		{
			System.out.println("project and customer page is not verified== fail");
		}

		//find and navigate to create new customer page
			driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
			
			
			//verify create new customer  page
			String  etitle= "Create New Customer";
			if(driver.getTitle().contains(etitle))
			{
				System.out.println("create new customer customer page is verified== pass");
			}
			else
			{
				System.out.println("create new  customer page is not verified== fail");
			}

			//create a new customer
		    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sk");
	        
	        //identify radiobutton and click
	        driver.findElement(By.id("add_project_action")).click();
	        driver.findElement(By.xpath("//input[@type='submit']")).submit();
    		
		    //verify customer created message
	        boolean mst=driver.findElement(By.xpath("//span[@class='successmsg']")).isDisplayed();
	        if(mst)
	        {
	        	System.out.println("create customer msg is generated == pass");
	        }
	        else
	        {
	        	System.out.println("create customer msg is not displayed== fail ");
	        }
	        //identify and verify create new project page
	        String expttitl="Create New Project";
	        String acttil=driver.getTitle();
	        if(acttil.contains(expttitl))
	        {
	        	System.out.println("page is verified");
	        }
	        else
	        {
	        	System.out.println("page is not verified");
	        }
	        
	        //message is  displayed
	        String exptmsg="successfully created.";
	        String actmsg=driver.findElement(By.className("successmsg")).getText();
	        if(actmsg.contains(exptmsg))
	        {
	        	System.out.println("message is verified");
	        }
	        else
	        {
	        	System.out.println("message is not verified");
	        }
	}
}

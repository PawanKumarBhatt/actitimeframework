package customerandproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class createcustomerandproject {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
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
	Thread.sleep(5000);
	
	//navigate to  task  page
	driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	Thread.sleep(5000);
	
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
	Thread.sleep(2000);
	
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
		Thread.sleep(2000);
		
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
        Thread.sleep(2000);
        //identify create new project webelement
        driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
        Thread.sleep(3000);
        //identify dropdown
        WebElement dwb=driver.findElement(By.xpath("//select[@name='customerId']"));
        //object of select class
        Select sel=new Select(dwb);
        //select value from dropdown
        sel.selectByVisibleText("sk");
        //identify customer edit box
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("airtel");
        //identify and click  on submit
        driver.findElement(By.xpath("//input[@value='Create Project']")).submit();
}
}

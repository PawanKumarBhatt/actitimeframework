package createcustomerandprojectallottask;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class taskverification {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//maximize the open window
	driver.manage().window().maximize();
	//open acti-time application login page
	driver.navigate().to("http://127.0.0.1/login.do");
	
	//find user-name and password and navigate to home page
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	
	
	//navigate to  task  page
	driver.findElement(By.xpath("//a[@class='content tasks']")).click();

	//find and navigate to project and customer
	driver.findElement(By.linkText("Projects & Customers")).click();
	

	//find and navigate to create new customer page
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		

		//create a new customer
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("bb");
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        		
        //identify create new project webelement
        driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
        
        //identify drop-down
        WebElement dwb=driver.findElement(By.xpath("//select[@name='customerId']"));
        //object of select class
        Select sel=new Select(dwb);
        //select value from drop-down
        sel.selectByVisibleText("bb");
        //identify customer edit box
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("air");
        //identify and click  on submit
        driver.findElement(By.xpath("//input[@value='Create Project']")).submit();
        //identify time track  and click on it
        driver.findElement(By.xpath("//a[@class='content tt']")).click();
        //identify create task and click on it
        driver.findElement(By.xpath("//a[text()='Create new tasks']")).click();
        //get window  id
        Set<String> set=driver.getWindowHandles();
        //get window id of  create task window using iterator
        Iterator<String> it=set.iterator();
        String parentid=it.next();
        String childid=it.next();
        //transfer control to child window
        driver.switchTo().window(childid);
        //find customer and project
        WebElement dwbc=driver.findElement(By.xpath("//select[@name='customerId']"));
         Select sel2=new Select(dwbc);	
        sel2.selectByVisibleText("bb");
        //object for select class
        WebElement dwb1=driver.findElement(By.xpath("//select[@name='projectId']"));
        Select sel1=new Select(dwb1);
        sel1.selectByVisibleText("air");
        //identify task  name and fill data
        driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr[2]/td[1]/input[1]")).sendKeys("module-A");
        driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr[3]/td[1]/input[1]")).sendKeys("module-B");
        driver.findElement(By.xpath("//table/tbody/tr/td/table/tbody/tr[8]/td/table/tbody/tr[4]/td[1]/input[1]")).sendKeys("module-C");
        //identify create task  button and click on it
        driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
}
}

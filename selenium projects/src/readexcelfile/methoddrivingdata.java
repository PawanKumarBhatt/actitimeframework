package readexcelfile;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import readexcelfile.base.base;

public class methoddrivingdata extends base {
	dataread d =new dataread();
	String name= d.excelgetdata(sheet1, 1, 0);
	
	@Test
	public void createcustomerandproject(){
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys();
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        
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

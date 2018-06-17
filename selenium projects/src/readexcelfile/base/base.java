package readexcelfile.base;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import readexcelfile.dataread;

public class base {
	dataread d =new dataread();
	public WebDriver driver;
    Properties pobj;
   @BeforeClass
   public void  beforeeclasstest() throws IOException{
	   driver=new FirefoxDriver();
	   pobj=d.getproperty();
   }
	

	@AfterClass
	public  void afterclasstest()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void beforemethod() throws IOException
	{   
		String userid = pobj.getProperty("username");
		String passwd = pobj.getProperty("password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url= pobj.getProperty("url");
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(userid);
		driver.findElement(By.name("pwd")).sendKeys(passwd);
		driver.findElement(By.id("loginButton")).click();
	}
	
	@AfterMethod
	public void configAm(){
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}
	
	@AfterClass
	public void configAC(){
		driver.close();
	}
}

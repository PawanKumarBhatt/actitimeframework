package negativetestscenarioforusercreation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createuserwithinvalidpassword {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	//maximize the open window
	driver.manage().window().maximize();
	//open actitime application login page
	driver.navigate().to("http://127.0.0.1/login.do");
	
	//find uname and pswd and navigate to home page
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(8000);
	String expectitl="actiTIME - Enter Time-Track";
	String acttitle=driver.getTitle();
	System.out.println(acttitle);
	if(expectitl.equals(acttitle))
	{
		System.out.println("home page is displayed");
	}
	else 
	{
		System.out.println("homepage is not displayed");
	}
	
	//find and create on user webelement
	driver.findElement(By.xpath("//a[@class='content users']")).click();
	Thread.sleep(2000);
	//find and click on create new user
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	Thread.sleep(2000);
	
	//find user-name and enter value
	driver.findElement(By.name("username")).sendKeys("pawanbhatt");
	//find password and enter value
	driver.findElement(By.name("passwordText")).sendKeys("pawanbhatt1");
	//find re-enter-password and  enter value
	driver.findElement(By.name("passwordTextRetype")).sendKeys("p");
	//find first name and enter
	driver.findElement(By.name("firstName")).sendKeys("pawan");
	//find last-name and enter
	driver.findElement(By.name("lastName")).sendKeys("bhatt");
	//find work-duration and enter value
	driver.findElement(By.name("workdayDurationStr")).clear();

	driver.findElement(By.name("workdayDurationStr")).sendKeys("6:00");
	
    //identify create user button and click on it
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	Thread.sleep(3000);
	
	//verify error msg
	String expmsg="Entered password values differ from each other. Please enter the same values in both fields. Note that password is case sensitive (check if CapsLock is on).";
	String actmsg=driver.findElement(By.xpath("//span[text()='Entered password values differ from each other. Please enter the same values in both fields. Note that password is case sensitive (check if CapsLock is on).']")).getText();
	
	if (expmsg.equals(actmsg))
	{
		System.out.println("error message verification is= pass");
	}
	else
	{
		System.out.println("error message verification is  = fail");
	}
	//identify username and  password and verify it
	String epectedcolorpswd=driver.findElement(By.id("passwordFieldLabel")).getCssValue("Color");
	System.out.println(epectedcolorpswd);
	String actcolorpswd="rgb(206, 1, 0)";
	if (epectedcolorpswd.equals(actcolorpswd))
	{
		System.out.println("error msg in red color == pass");
		
	}
	else
	{
		System.out.println("error msg in red color == fail");
	}
	String expectcolorrpswd=driver.findElement(By.id("passwordRetypeFieldLabel")).getCssValue("Color");
	String actrepswd="rgb(206, 1, 0)";
	if(expectcolorrpswd.equals(actrepswd))
	{
		System.out.println("retypepassword color verification== pass");
	}
	else
	{
		System.out.println("retypepassword color verification== fail");
	}
	//logout as admin
	driver.findElement(By.linkText("Logout")).click();
	
	
	
}
}

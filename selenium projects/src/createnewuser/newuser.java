package createnewuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newuser {
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
		Thread.sleep(5000);
		
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
		driver.findElement(By.name("passwordTextRetype")).sendKeys("pawanbhatt1");
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
		//logout as admin
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(4000);
		//login as new  user
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pawanbhatt");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("pawanbhatt1");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
	}

}

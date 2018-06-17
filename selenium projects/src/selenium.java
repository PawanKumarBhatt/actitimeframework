import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium 
{
	public static void main(String[] args)
	{
		//open empty browser
		FirefoxDriver driver=new FirefoxDriver();
		//navigate to facebook page
		driver.get("https://www.facebook.com");
		//identify the email editbox
		WebElement wetb= driver.findElement(By.id("email")) ;
		//type data in editbox
		wetb.sendKeys("pawankumarbhatt07227@gmail.com");
		//identify the password editbox
        WebElement wepsw= driver.findElement(By.id("pass")) ;
        //type data in editbox
        wepsw.sendKeys("07213303610pk") ;
        //identify login
        WebElement welog=driver.findElement(By.id("u_0_2"));
        //navigate to homepage
        welog.click();
        
       
	}

}

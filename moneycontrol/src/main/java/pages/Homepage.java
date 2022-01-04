package pages;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import drivers.Drivermanager;
import utilities.GetUtil;


public class Homepage
{
	 static WebDriver driver=Drivermanager.setdriver();
	 static String baseurl=GetUtil.utils("baseurl");
	 static By loginpage=By.xpath("//a[contains(text(),'Hello, Login')]");
	 static By loginbutton=By.xpath("//*[contains(@class,'btn_signin dropdown-toggle linkSignIn active')]");
	 static By id=By.xpath("(//input[@id='email'])[2]");
	 static By pass=By.xpath("(//input[@id='pwd'])[2]");
	public Homepage()
	{
		
	}
	
	public static  void run()
	{
		driver.manage().window().maximize();
		
	}
	public  static void baseurl()
	{
		driver.get(baseurl);
	}
	public  static void Loginpage()
	{
		driver.findElement(loginpage).click();
		driver.findElement(loginbutton).click();
	}
	public static void typeidpassword(String userid,String password) throws InterruptedException
	{
		Thread.sleep(7000);
		driver.switchTo().frame("myframe");
		driver.findElement(id).sendKeys(userid);
		driver.findElement(pass).sendKeys(password);
		
		
	}
	
	
	

}

package moneycontrollogin;

import java.io.FileInputStream;
import drivers.Drivermanager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

//import com.codoid.products.fillo.Select;

import utilities.GetUtil;

public class Login {
	static String chrome=GetUtil.utils("driver");
	//static String chrome=Drivermanager.setdriver("driver");

	static String baseurl=GetUtil.utils("baseurl");
	static String userid=GetUtil.utils("userid");
	static String password=GetUtil.utils("password");
	static WebDriver driver;


	//@Test

	public static void login() throws InterruptedException	//Method for implementing login function on a page
	{
		// TODO Auto-generated method stub
		//System.out.println(chrome);
		System.setProperty("webdriver.chrome.driver", chrome);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.moneycontrol.com/");
		driver.get(baseurl);
		driver.manage().window().maximize();
		// Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Hello, Login')]")).click();
		driver.findElement(By.xpath("//*[contains(@class,'btn_signin dropdown-toggle linkSignIn active')]")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"myframe\"]")));
		Thread.sleep(7000);

		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='myframe']")));
		driver.switchTo().frame("myframe");

		//driver.findElement(By.xpath("//*[@id=\"myframe\"]"));
		//List<WebElement> email=driver.findElements(By.id("email")); // Working with multiple Object with same Property 
		/*Boolean result =email.isEnabled();
		System.out.println(result);
		email.sendKeys("dhruvpathak19965@gmail.com");*/
		//System.out.println(email.size());
		//email.get(1).sendKeys("dhruvpathak19965@gmail.com");

		driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys(userid);
		driver.findElement(By.xpath("(//input[@id='pwd'])[2]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"ACCT_LOGIN_SUBMIT\"]")).click();
		//		driver.findElement(By.xpath("//input[@id='email']")).click();
		//driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Dhruva@567");
		//driver.findElement(By.xpath(" (//a[contains(text(),'Markets')]) [3]")).click();
		Thread.sleep(7000);

		driver.close();

	}



}

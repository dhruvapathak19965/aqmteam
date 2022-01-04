package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.GetUtil;

public class Drivermanager{
	static String chrome=GetUtil.utils("driver");
	static WebDriver driver;
	public static WebDriver setdriver()
	{
		System.setProperty("webdriver.chrome.driver", chrome);
		driver=new ChromeDriver();
		return driver;
		
		
	}

}
package runner;

import org.testng.annotations.Test;
import drivers.Drivermanager;
import pages.Homepage;
import utilities.GetUtil;

public class Testrunner {
	 static String userid=GetUtil.utils("userid");
	 static String password=GetUtil.utils("password");
	@Test
	public static void run() throws InterruptedException
	{
		//Drivermanager.setdriver();
	
		Homepage.run();
		Homepage.baseurl();
		Homepage.Loginpage();
		Homepage.typeidpassword(userid, password);
		
		
		
	}

}

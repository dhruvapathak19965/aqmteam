package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class GetUtil {
	public static String utils(String parm)
	{
		
		try {
			Properties prop=new Properties();
			InputStream input=new FileInputStream("D:\\dhruv-workspace\\src\\test\\resources\\config.properties");
			prop.load(input);
			String parem=prop.getProperty(parm);
//			System.out.println(prop.getProperty("username"));
		//String chromedriver=prop.getProperty("driver");
			return parem;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		
}
	

}

package rResource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseS {
	
	public WebDriver driver;
	Properties pro;
	
	public WebDriver  DriverInitiated() throws IOException
	{
		pro =new Properties();
		
		FileInputStream fs= new FileInputStream("C:\\Users\\Win_!0\\eclipse-workspace\\GuptaJI\\src\\main\\java\\rResource\\confi.Properties");
		
		pro.load(fs);
		
		String BrowserName = pro.getProperty("browser");
		
		if(BrowserName.equals("chrome"))
		    {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win_!0\\Downloads\\chromedriver_win32 (15)\\chromedriver.exe");
			driver= new ChromeDriver();
			}
		  driver.get(pro.getProperty("url"));
		
		return driver;
		
	}
	
	public String getScreenshot(String TestCaseName ,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver ;
		File Source= ts.getScreenshotAs(OutputType.FILE);
		String DestFile= System.getProperty("user.dir")+"\\reporttScreensot\\"+TestCaseName+".png";
		FileUtils.copyFile(Source, new File(DestFile));
		return DestFile;
	}
	

}

package pPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import oObjectS.Hobject;
import oObjectS.LobjectS;

import rResource.BaseS;

public class LogIn extends BaseS

{
	public WebDriver driver;
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]= "FirsEmailid@gmail.com";
		data[0][1]="123";

		data[1][0]= "SecondEmailid@gmail.com";
		data[1][1]="456";
		return data;
	}
	
	@Test(dataProvider="getdata")
	
	public  void NavigateLogin (String UserName, String Password) throws IOException, InterruptedException
	{
driver=DriverInitiated();
		
		System.out.print("gupta ji ram ");
		Thread.sleep(3000);
		Hobject  H= new Hobject(driver);
		H.noThanksClic().click();
		  LobjectS Li =H.LogClick();
		  Li.Email().sendKeys(UserName);
		  Li.Password().sendKeys(Password);
		  Li.Forgott().click();
		  
	}
	
}

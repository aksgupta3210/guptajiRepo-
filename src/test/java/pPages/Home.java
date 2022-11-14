package pPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import oObjectS.Hobject;
import rResource.BaseS;

public class Home extends BaseS {
	
	public WebDriver driver;
	@Test
	public void NavigateDriverr() throws IOException, InterruptedException
	{
		driver=DriverInitiated();
		
		System.out.print("gupta ji ram ");
		
		Hobject  H= new Hobject(driver);
		Thread.sleep(3000);
	//	H.noThanksClic().click();
		
		String Txtdata=H.txt().getText();
		
		Assert.assertEquals(Txtdata, "FEATURED COURSES");
		System.out.print(Txtdata);
		
	}
}

package oObjectS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LobjectS {
	
  WebDriver driver;
	
  public LobjectS(WebDriver driver)
  {
	  this.driver=driver;
	  
  }
  
 By emailID=By.id("user_email");
 By pass=By.id("user_password");
 By forgott=By.xpath("//a[normalize-space()='Forgot Password?']");
 
 public WebElement Email()
 {
	 return driver.findElement(emailID);
 }

 public WebElement Password()
 {
	 return driver.findElement(pass);
 }
 
 public WebElement Forgott()
 {
	 return driver.findElement(forgott);
 }
}

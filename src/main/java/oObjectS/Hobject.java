package oObjectS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hobject {
	
  public WebDriver driver;
  
  public Hobject(WebDriver driver)
  {
	 this.driver =driver;
  }

  By noThanksButton= By.xpath("//button[normalize-space()='NO THANKS']");
  By  logClickButton=By.xpath("//span[normalize-space()='Login']");
  By textGett= By.xpath("//h2[normalize-space()='Featured Courses']");
  public WebElement noThanksClic()
  {
	  return driver.findElement(noThanksButton);
  }
  
  public WebElement txt()
  {
	  return driver.findElement(textGett);
  }
  
  public LobjectS LogClick()
  {
	  driver.findElement(logClickButton).click();
	  LobjectS Li = new LobjectS (driver);
	  return Li;
	  
  }
}

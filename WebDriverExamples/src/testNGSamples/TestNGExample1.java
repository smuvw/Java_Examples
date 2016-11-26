package testNGSamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNGExample1 {
	
	public WebDriver driver;
	
  @Test
  public void CreateAccount() {
	  
	  driver.findElement(By.name("firstname")).sendKeys("srini");
	  driver.findElement(By.name("lastname")).sendKeys("M");
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  // Create a new instance of the Firefox driver
	  
      driver = new FirefoxDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
 
      driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	// Close the driver
	  
      driver.quit();
  }

}

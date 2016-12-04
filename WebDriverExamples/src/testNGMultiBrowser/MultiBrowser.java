package testNGMultiBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	 
import org.testng.annotations.AfterClass;
	 
	import org.testng.annotations.BeforeClass;
	 
	import org.testng.annotations.Parameters;
	 
	import org.testng.annotations.Test;
	 
	public class MultiBrowser {
	 
		public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 
		  driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("chrome")) { 
	 
		  // Here I am setting up the path for my Chrome
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Softwares\\chromedriver_win32(2)\\chromedriver.exe");
	 
		  driver = new ChromeDriver();
	 
	  } 
	 
	  // Doesn't the browser type, lauch the Website
	 
	  driver.get("https://www.facebook.com/"); 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  @Test 
	  public void login() throws InterruptedException {
	 
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sri");
	 
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("mu");
	 
	 
	 
		}  
	 
	  @AfterClass 
	  public void afterTest() {
	 
			driver.quit();
	 
		}
	 
	}

package testcore;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import commonUtils.ExcelReader;


//import utility.ExcelReader;

public class TestBase {

	/*
	 * 
	 * webdriver, logs, excel, properties file, database
	 * 
	 */
	
	
	public static WebDriver driver;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\testdata.xlsx");
	public static Properties OR = new Properties();
	public static Properties Config = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
		
	@BeforeSuite
	public void setup(){
		if(driver==null){
			
			// read teh data from OR file
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
							
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
				
			
			
			
			try {
				OR.load(fis);
				
			
				log.debug("OR  property file is loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.debug("OR Property file loaded");
			
			
			
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Config.load(fis);
				log.debug("Config property file is loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			if(Config.getProperty("browser").equals("firefox")){
				
				driver = new FirefoxDriver();
				log.debug("Firefox Initialized");
			}else if(Config.getProperty("browser").equals("ie")){
				
				System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}else if(Config.getProperty("browser").equals("chrome")){
				
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			
			driver.get(Config.getProperty("testsiteurl"));
			log.debug("Navigated to : "+Config.getProperty("testsiteurl"));
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
			
			
			
		}
		
	}

	
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}
}

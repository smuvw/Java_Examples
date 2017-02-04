package AutoIt;


import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItExample {

	public static void main(String[] args) throws IOException {
      // FirefoxDriver driver=new FirefoxDriver();
   	//System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/AutoIt_details/fileupload.html");
		driver.manage().window().maximize();
		
		driver.findElementByName("fileupload").click();
		Runtime.getRuntime().exec("C:\\AutoIt_details\\AutoScript.exe");
	}

}

package screenPrints;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) {


		   FirefoxDriver driver= new FirefoxDriver();
		   
		   driver.get("https://www.facebook.com/");
		 
		   
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  try {
			 
			  FileUtils.copyFile(src, new File("C:/Softwares/error.png"));
			 
		  } catch (Exception e)
		  {
			  System.out.println(e.getMessage());
		  }

	}
}

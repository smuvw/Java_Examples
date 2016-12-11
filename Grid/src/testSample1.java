import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testSample1 {
	
	@Test
	public void Facebooklogin() throws MalformedURLException{
		
		DesiredCapabilities cap= DesiredCapabilities.firefox();
		
		cap.setBrowserName("firefox");
		
		
		
		cap.setPlatform(Platform.ANY);
		
				
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			
		driver.get("https://www.facebook.com/");

			
	driver.quit();
		
	}

}

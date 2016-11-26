package OpenBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenApp_firefox {
public static void main(String[] args) {
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		
	}
}

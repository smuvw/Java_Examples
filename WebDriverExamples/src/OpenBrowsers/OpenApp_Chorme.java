package OpenBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApp_Chorme {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());

	}
}

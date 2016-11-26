package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitExample {

/*	The implicit wait will tell to the web driver to wait for certain amount of time before it throws
  a "No Such Element Exception". 
The default setting is 0. Once we set the time, web driver will wait for that time before throwing an exception.
In the below example we have declared an implicit wait with the time frame of 30 seconds. 
It means that if the element is not located on the web page within that time frame, 
it will throw a "No Such Element Exception"*/
	
public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);


		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		Thread.sleep(3000);
		new Actions(driver).dragAndDropBy(slider, 400, 0).perform();

	}
}

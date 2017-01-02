package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSlider {
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

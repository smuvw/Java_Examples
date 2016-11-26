package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertclass {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/spinner/");
		WebElement s=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(s);
		driver.findElement(By.xpath("//*[@id='spinner']")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id='getvalue']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id='spinner']")).clear();
		driver.findElement(By.xpath("//*[@id='spinner']")).sendKeys("3");
	}

}

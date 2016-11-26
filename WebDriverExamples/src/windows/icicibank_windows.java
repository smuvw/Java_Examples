package windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class icicibank_windows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.icicibank.com/"); //open ICICI bank web page 
	
	
		
		Set<String> winids=driver.getWindowHandles();
		
		Iterator<String> setit=winids.iterator();
						
		String id_first=setit.next(); //first window ID

		driver.switchTo().window(id_first);
				
		driver.findElement(By.xpath(".//*[@id='modal-content' and @class='noBg active']/child::div[1]")).click();
		
		driver.findElement(By.xpath(" //a[contains(text(),'Private')]")).click();
		
		winids=driver.getWindowHandles();
		
		setit=winids.iterator();
		String id_first1=setit.next(); //first window ID
		String id_second=setit.next();// second window ID
	
		System.out.println(id_second);
		

		
		driver.switchTo().window(id_second);
		
		driver.findElement(By.xpath("//input[@id='Search'and @autocomplete='off']")).sendKeys("CHICAGO");
		
		driver.switchTo().window(id_first1);
		driver.findElement(By.xpath("//input[@id='Search']")).sendKeys("NY");
		

	}

}

package webElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_WebElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/checkboxradio/");
		
		driver.manage().window().maximize();
		
			WebElement frameid=driver.findElement(By.xpath(".//*[@id='content']/iframe"));
			driver.manage().window().maximize();
			driver.switchTo().frame(frameid);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			List<WebElement> radio_btn=driver.findElements(By.xpath("//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank']"));
		
		
		  System.out.println(radio_btn.get(1).getAttribute("class"));
		 // System.out.println(radio_btn.get(1).getAttribute("checked"));
		  
		  radio_btn.get(1).click();
		 // System.out.println(radio_btn.get(1).getAttribute("checked"));
		  System.out.println(radio_btn.size());
		 
		 
	}
}

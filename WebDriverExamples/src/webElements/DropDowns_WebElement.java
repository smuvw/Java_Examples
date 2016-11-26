package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns_WebElement {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); //Maximize the Facebook page 
		
	
		
			
		Select dropdown = new Select(driver.findElement(By.id("month")));
		//dropdown.selectByIndex(6);
		//dropdown.selectByValue("12");
		//dropdown.selectByVisibleText("May");
		
		
		List<WebElement> options= dropdown.getOptions();
		
		System.out.println(options.size());
		
		for (int i=0; i<options.size();i++)
		{
			
			System.out.println(options.get(i).getText());
		}
		
	
	
	
				
		
	}

	
	
	
}

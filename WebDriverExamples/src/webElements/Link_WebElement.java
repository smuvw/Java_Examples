package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_WebElement {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		
	boolean value=driver.findElement(By.linkText("Gmail")).isDisplayed();
	

	
	if (value==true){
		System.out.println("Link is dispalyed");
	}
	else
	{
		System.out.println("Link is not  dispalyed");
	}

driver.findElement(By.cssSelector("input[id$='-ib']")).sendKeys("srini");

	
	}

}

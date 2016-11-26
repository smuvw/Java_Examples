package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button_WebElement {
	
	public static void main(String[] args) {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.id("u_0_e")).click();
		 
		 String textName=driver.findElement(By.id("u_0_e")).getText();
		 
		 System.out.println(textName);
				 
				 
	}

}

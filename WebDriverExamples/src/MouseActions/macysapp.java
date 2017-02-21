package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class macysapp {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.macys.com/");
		
		WebElement menu_kid=driver.findElement(By.xpath(".//*[@id='flexLabel_5991']/a"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(menu_kid).perform();
		
driver.findElement(By.xpath(".//*[@id='flexLabel_/shop/kids-clothes/kids-jeans/Size_range/Boys%202-7%7CBoys%208-20?id=63008']/a")).click();
		
	}

}

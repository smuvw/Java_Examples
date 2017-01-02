package frame;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFrame {
	
	public static void main(String[] args) {

		WebDriver driver;

		//WebDriver driver = new FirefoxDriver();
		
				 
		driver= new ChromeDriver();
		 
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
	//Switch to frame
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("html/body/button")).click();
		
		//switch to Default page 
		
		driver.switchTo().defaultContent();
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		for(WebElement frame: frames){
			
			System.out.println(frame.getAttribute("id"));
		}
		
		//total frames on the page - id
		
		
	
		
		

	}

	
	

}


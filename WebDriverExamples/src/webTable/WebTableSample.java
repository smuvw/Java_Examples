package webTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/17023/mu-vs-rs-7th-match-karnataka-premier-league-2016");
		//driver.manage().window().maximize(); 
		//driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
		
		String xp_start="//*[@id='innings_1']/div[1]/div[";
		String xp_end="]/div[1]";
		
		int rownum=0;
		
				
		
		for (int i=3;i<8;i++){
			
		String name=driver.findElement(By.xpath(xp_start+i+xp_end)).getText();
		rownum++;
		System.out.println(name);
		
			}
		System.out.println("row count is: " + rownum);
		
		System.out.println("************************");

/*String xp_start="//*[@id='innings_1']/div[1]/div[3]/div[";
String xp_end="]";


int colnum=0;

for (int i=1;i<=7;i++) {
	String name=driver.findElement(By.xpath(xp_start+i+xp_end)).getText();
	colnum++;
	System.out.println(name);
	
}*/
		
		
		
	}

}

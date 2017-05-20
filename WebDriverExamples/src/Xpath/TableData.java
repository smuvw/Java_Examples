package Xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {
  ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18130/mi-vs-srh-10th-match-indian-premier-league-2017");
		
		
		int rownum=6;
		int colnum=4;
		
		String xp_start=".//*[@id='innings_1']/div[1]/div[";
		String xp_mid="]/div[";
		String xp_end="]";
		
		for (int rows=2;rows<=rownum;rows++){
			
			for(int cols=1;cols<=colnum;cols++){
				
				String name= driver.findElementByXPath(xp_start+rows+xp_mid+cols+xp_end).getText();
				//*[@id='innings_1']/div[1]/div[3]/div[1];
				
				System.out.println(name);
				
				//driver.findElementByCssSelector("a[class='cb-nav-tab active']").click();
			}
		}
				
		

	}

}

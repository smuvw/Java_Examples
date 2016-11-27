package testcases;

import org.testng.annotations.Test;

//import commonUtils.TestUtil;
import testcore.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;


public class LoginTest extends TestBase {
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password){
		
		log.debug("Inside login test");
		
		driver.findElement(By.xpath(OR.getProperty("AdminLogin"))).click();
		driver.findElement(By.name(OR.getProperty("AdminID"))).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.name(OR.getProperty("Password"))).sendKeys(password);
		driver.findElement(By.xpath(OR.getProperty("Login"))).click();
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("FirstName")).sendKeys("srini");
		
		log.debug("Login test successfully executed");
	}
	
	
	@DataProvider
	public static Object[][] getData(){
		
		
		String sheetName ="LoginTest";
				
				int rows = excel.getRowCount(sheetName);
				int cols = excel.getColumnCount(sheetName);
				
				System.out.println("total rows are : "+rows);
				System.out.println("total cols are : "+cols);
				
				Object[][] data = new Object[rows-1][cols];
				
				
				for(int rowNum = 2 ; rowNum <= rows ; rowNum++){ //2
					
					for(int colNum=0 ; colNum< cols; colNum++){
						
						
						data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum); //-2
					}
				}
				
				
				return data;
		
		
	}
	
}

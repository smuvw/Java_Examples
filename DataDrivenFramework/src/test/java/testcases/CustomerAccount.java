package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcore.TestBase;

public class CustomerAccount extends TestBase{
	
	@Test(dataProvider="getData")
	public void custAccount(String AccountName) {		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("FirstName")).sendKeys(AccountName);
		
		/*driver.findElement(By.xpath("Deposit")).click();
		driver.findElement(By.xpath("AccNumber")).sendKeys(AccountNumber);
		driver.findElement(By.xpath("AccNumber")).sendKeys(AccountType);
		*/
		
		/*driver.findElement(By.linkText(OR.getProperty("custlink"))).click();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.name(OR.getProperty("customername"))).sendKeys(cname);
		driver.findElement(By.name(OR.getProperty("DOB"))).sendKeys(cdob);
		driver.findElement(By.name(OR.getProperty("custadd"))).sendKeys(caddress);
		driver.findElement(By.name(OR.getProperty("custcity"))).sendKeys(city);
		driver.findElement(By.name(OR.getProperty("custstate"))).sendKeys(state);
		driver.findElement(By.name(OR.getProperty("custpin"))).sendKeys(pin);
		driver.findElement(By.name(OR.getProperty("custcell"))).sendKeys(cell);
		driver.findElement(By.name(OR.getProperty("custemail"))).sendKeys(email);
		driver.findElement(By.name(OR.getProperty("custpassword"))).sendKeys(cpass);
		driver.findElement(By.name(OR.getProperty("custsubmit"))).click();
		log.debug("customer Accoutn is created");*/
	}
	
	@DataProvider
	public static Object[][] getData(){
		
		
		String sheetName ="custAccount";
				
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

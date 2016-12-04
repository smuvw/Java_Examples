package testNGSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParametersandDataProviderWithExcel {
	
	
	
	public static ExcelReader excel;
	
	public static WebDriver driver;
	
	@BeforeTest
	public void OpenApp(){
		
		driver= new FirefoxDriver();
		
	}
	
	@AfterTest
	public void CloseApp(){
		
		driver.quit();
		
	}
	
	
	
	@Test (dataProvider="getData")
	  public void Login(String username,String Password) {
		
		driver.get("https://gmail.com");
		  driver.findElement(By.id("Email")).sendKeys(username);
		// System.out.println(fee);

	  }
	  
	  
	  
	  @DataProvider
	  public static Object[][] getData(){
		  
		  if (excel==null){
			  
			  excel= new ExcelReader(System.getProperty("user.dir")+ "\\TestData.xlsx");
		  }
		  
		  String sheetName="sheet1";

		  int rows= excel.getRowCount(sheetName);
		  System.out.println("Total rows count" + rows );
		  
		  int cols= excel.getColumnCount(sheetName);
		  System.out.println("Total cols count" + cols );
		  
		  Object[][] data=new Object[rows-1][cols];
		  
		
		  
		  for (int rowNum=2;rowNum<=rows; rowNum++){
			  
			  for (int colNum=0;colNum<cols; colNum++) {
				  
				  data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				  //data[0][0]==excel.getCellData(sheetName, colNum, rowNum);
			  }
			  
		  }
		  
		  
		  return data;
		  
		  
		  
	  }

}

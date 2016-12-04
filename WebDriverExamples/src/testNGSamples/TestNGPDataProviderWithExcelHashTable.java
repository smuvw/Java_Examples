package testNGSamples;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPDataProviderWithExcelHashTable {
	
public static ExcelReader excel;

	

	
		
	@Test (dataProvider="getData")
	  public void Login(Hashtable<String,String> data) {
		
			System.out.println(data.get("UserName")+"..."+data.get("Password")+"..." +data.get("test"));

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
		  
		  Object[][] data=new Object[rows-1][1];
		  
		  Hashtable<String,String> table =null;
		
		  
		  for (int rowNum=2;rowNum<=rows; rowNum++){
			  
			  table= new Hashtable<String,String>();
			  
			  for (int colNum=0;colNum<cols; colNum++) {
				  
				  //data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
				  //data[0][0]==excel.getCellData(sheetName, colNum, rowNum);
				
				  table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				  
				  data[rowNum-2][0]=table;
				  
			  }
			  
		  }
		  
		  
		  return data;
		  
		  
		  
	  }

}

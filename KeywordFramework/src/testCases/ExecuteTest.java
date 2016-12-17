package testCases;


import java.util.Properties;

import operation.ReadObjects;
import operation.UIOperation;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import common.readExcelFile;



public class ExecuteTest {

	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	@Test
	public void testLogin() throws Exception {
		
		
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Softwares\\Browser\\chromedriver_win32\\chromedriver.exe");
		 WebDriver webdriver = new ChromeDriver();
       //WebDriver webdriver = new FirefoxDriver();
		 //Logger log = Logger.getLogger("devpinoyLogger");
       readExcelFile file = new readExcelFile();
        ReadObjects object = new ReadObjects();
        Properties allObjects =object.getObjectRepository();
        log.debug("this is test");
   
        UIOperation operation = new UIOperation(webdriver);
        //Read keyword sheet
        Sheet sheet = file.readExcel(System.getProperty("user.dir")+"\\","TestCase.xlsx" , "KeywordFramework");
      //Find number of rows in excel file
        System.out.println(sheet.getLastRowNum());
        System.out.println(sheet.getFirstRowNum());
        log.debug("XLS file is loaded and get the last row count");
    	int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
    	//Create a loop over all the rows of excel file to read it
    	for (int i = 1; i < rowCount+1; i++) {
    		//Loop over all the rows
    		Row row = sheet.getRow(i);
    		//Check if the first cell contain a value, if yes, That means it is the new testcase name
    		if(row.getCell(0).toString().length()==0){
    		//Print testcase detail on console
    			System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
    			row.getCell(3).toString()+"----"+ row.getCell(4).toString());
    		//Call perform function to perform operation on UI
    			operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
    				row.getCell(3).toString(), row.getCell(4).toString());
    	    }
    		else{
    			//Print the new  testcase name when it started
    				System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
    			}
    		}
	}

}

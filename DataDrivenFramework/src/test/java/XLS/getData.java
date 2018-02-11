package XLS;

import org.openqa.selenium.chrome.ChromeDriver;

import commonUtils.ExcelReader;

public class getData {
	
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\testdata.xlsx");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String Aname=excel.getCellData("sheet1", 1, 2);
		System.out.println(Aname);
		driver.findElementByXPath(".//*[@id='u_0_e']").sendKeys(Aname);
		
		
/*	System.out.println(excel.getRowCount("sheet1"));
	System.out.println(excel.getColumnCount("sheet1"));
	
	System.out.println(excel.getCellData("sheet1", 1, 2));
	String name="sri";
	
	excel.setCellData("sheet1", "US", 2, name);*/
	}

}

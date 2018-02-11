package readDataFromXL;

public class excelData {
	
	static String SheetName="sheet1";
	
	public static void main(String[] args) {
		
		ExcelReader excel=new ExcelReader("C:\\test\\testData.xlsx");
	
	System.out.println(excel.getRowCount(SheetName));
		/*	System.out.println(excel.getColumnCount(SheetName));

	System.out.println(excel.getCellData(SheetName, 0, 1));	
	System.out.println(excel.getCellData(SheetName, 0, 2));
	System.out.println(excel.getCellData(SheetName, 0, 3));
	System.out.println(excel.getCellData(SheetName, 1, 1));
	System.out.println(excel.getCellData(SheetName, 1, 2));
	System.out.println(excel.getCellData(SheetName, 1, 3));*/
	
	//excel.addSheet("muvva123");
	//excel.setCellData(SheetName, "Address", 3, "Java");
	}
	

}

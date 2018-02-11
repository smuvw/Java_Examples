package properties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_example {

	public static void main(String[] args) throws IOException {
		
		//we can use Properties class to get the data from properties file 
		
		// 1.Create properties file  and store Test data in key and value Ex:Config.properties
		//stored URl and browser information in key and value pair 

		Properties p=new Properties(); //create object using properties class 
		
	//Read the Config.properties file 
			FileInputStream fis=new FileInputStream("C:\\sri\\git\\Java_Examples\\JavaExample\\src\\properties\\Config.properties");
		
			p.load(fis); //load the properties file using load method
			
			System.out.println(p.getProperty("browser")); //get Key value using "getProperty" 
			System.out.println(p.getProperty("url"));
	

		
	
		
	}

}

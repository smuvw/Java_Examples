package properties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_example {

	public static void main(String[] args) throws IOException {

		Properties p=new Properties();
		
	
			FileInputStream fis=new FileInputStream("C:\\sri\\git\\Java_Examples\\JavaExample\\src\\properties\\Config.properties");
		
			p.load(fis);
			System.out.println(p.getProperty("browser"));
			System.out.println(p.getProperty("url"));
	

		
	
		
	}

}

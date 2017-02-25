package TestNGsample1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test123 {
	
	@Test
	@Parameters({"name","Password"})
	public void getdata(String Uname,String Password){
		
		System.out.println(Uname+"********"+Password);
		
	}

}

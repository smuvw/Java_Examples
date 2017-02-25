package testNGSamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParametersandDataProvider {
	
	
  @Test (dataProvider="getData")
  public void Login(String username,String Password) {
	  
	  System.out.println(username+"......................."+ Password);

  }
  
  
  
  @DataProvider
  public static Object[][] getData(){
	  
	  Object[][] data=new Object[3][2];
	  
	  data[0][0]="sri";
	  data[0][1]="Muvva";
	  
	  data[1][0]="vasu";
	  data[1][1]="Muvva";
	  
	  data[2][0]="vasu";
	  data[2][1]="Muvva";
	  
	  
	  return data;
	  
	  
	  
  }
}

package testNGSamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class validationExample {
  @Test
  public void Login() {
	  
	  String ActualT="welcome";
	  String ExpectedT ="welcome";
	  
	  //Reporting purpose we are using Assert
	  
	 Assert.assertEquals(ActualT, ExpectedT);
	 	 
	  
  }
  
}

package testNGSamples;

import org.testng.annotations.Test;

public class TestNGGroup {
	
	@Test (priority=1,groups={"high","low"})
	public void one(){
		System.out.println("This is test one");
	}

	
	@Test (priority=2,groups="low")
	public void two(){
		System.out.println("This is test two");
	}
	
	 
	@Test (priority=2,groups="high")
	public void three(){
		System.out.println("This is test three");
	}
	
}

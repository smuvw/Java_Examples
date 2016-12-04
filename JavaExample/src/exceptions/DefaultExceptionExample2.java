package exceptions;

public class DefaultExceptionExample2 {
	
	
	//from stack this method will terminated abnormal because no exception handling code
	
	public static void main(String[] args) {
		
		dostuff();
	}

	
	
	//dostuff is responsible to create exception object 
	
	//from stack this method will terminated abnormal because no exception handling code
	
	public static void dostuff(){
		domorestuff();

		System.out.println(10/0);
	}
	
	//from stack this method will terminated normal 
	
	public static void domorestuff(){
		
		//System.out.println("Welcome to java training");
		
		System.out.println("welcome");
			
		}
		

}

package exceptions;

public class DefaultExceptionExample1 {

	public static void main(String[] args) {
	
		dostuff();
	}

	
	public static void dostuff(){
		domorestuff();
	}
	
	//domorestuff is responsible to create exception object 
	
	public static void domorestuff(){
		
		//System.out.println("Welcome to java training");
		
		System.out.println(10/0);
			
		}
		
	
}

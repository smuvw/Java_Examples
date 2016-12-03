package exceptions;

public class DefaultExceptionExample1 {

	public static void main(String[] args) {
	
		dostuff();
	}

	
	public static void dostuff(){
		domorestuff();
	}
	
	public static void domorestuff(){
		
		//System.out.println("Welcome");
		
		System.out.println(10/0);
			
		}
		
	
}

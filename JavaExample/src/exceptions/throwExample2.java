package exceptions;

public class throwExample2 {

	//Programmer  is creating Exception object explicitly  and hangover to the JVM manually  
	//Results is same as  default exception handling  result
	
	public static void main(String[] args) {
		
		System.out.println(10/0);
		
		throw new ArithmeticException( "/by zero");

	}

}

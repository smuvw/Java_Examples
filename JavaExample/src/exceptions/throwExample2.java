package exceptions;

public class throwExample2 {

	//Programmer  is creating Exception object explicitly  and hangover to the JVM manually  
	//Results is same as  default exception handling  result
	
	public static void validate (int age) {
		
		if(age<18) 
	      throw new ArithmeticException("not valid for vote"); 
			else
				System.out.println("welcome to vote ");
		}

		public static void main(String[] args) {
			
			validate(13);
			
			/*int age=13;
			if(age<18) 
			      throw new ArithmeticException("not valid"); 
					else
						System.out.println("welove to vote ");*/

		}
}

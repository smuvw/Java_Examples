package exceptions;

public class finallyExample {

	public static void main(String[] args) {
System.out.println("welcoem to Java Training");
		
		try {
			int a=10/2;
			System.out.println(a);
		} catch (Throwable t){
			
			System.out.println("error Occured in first try catch");
			
		} 
		finally {
			System.out.println("Execute finally code");
		}
		
	}

}

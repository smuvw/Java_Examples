package Exceptions;

public class tryCatchExample {

	public static void main(String[] args) {
		
		System.out.println("welcoem to Java Training");
		
		try {
			int a=10/2;
			System.out.println(a);
		} catch (Exception e){
			//e.getMessage();
			System.out.println("error Occured in first try catch");
			//e.printStackTrace();
		}
		
		try {
			int b=10/0;
			System.out.println(b);
		} catch (Exception e){
			//e.getMessage();
			System.out.println("error Occured in second try catch");
			//e.printStackTrace();
		}
		
		
		try {
			int [] c= new int[3];
			//c[4]=100;
			c[2]=200;
			System.out.println(c[2]);
		} catch (Exception e) {
			System.out.println("error Occured in third try catch");
		}
		
		
		
		
		
		System.out.println("Close the Program");
	}

}

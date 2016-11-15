package Condistions;

public class nestedIFExample {

	public static void main(String[] args) {
		
		int x=40;
		int y=40;
		
		String x1="sri";
		String y1="sri";
		
		if (x1==y1){
			System.out.println( "x1 equal y1");
		}
		
		if (x==40) {
			System.out.println("x value is " + x);
			if(y==40){
				System.out.println("x value is same with Y");
			} 
		} else
		{
			System.out.println("x  value is not same with Y");
		}


	}

}

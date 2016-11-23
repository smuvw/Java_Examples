package constructor;

public class emp {
	
	
	// Constructor without parameters
	
	 emp(){
	
		System.out.println("this is Construce class message");
	}
		
	 // Constructor with  parameters
		
	 emp(int empno){
		
		System.out.println("Employee number is " + empno);
	}
	
	
	 public static void main(String[] args) {
			emp e= new emp();  // without parameter constructor Default constructor
			emp e1= new emp(100); // with parameter constructor 
			
		}

	

}

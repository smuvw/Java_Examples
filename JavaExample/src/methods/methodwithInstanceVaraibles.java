package methods;

public class methodwithInstanceVaraibles {
	
	//instance variables 
	
	int x=10;
	int y=20;
	
	//this keyword can be used to reference current instance variable 
	//inside the static method this keyword is not allowed
	
	void m1(int x, int y)
	{
		System.out.println(x+y); // calling local variables 
		System.out.println(this.x + this.y); //calling instance variable with this keyword 
	}
	public static void main(String[] args) {
		
		methodwithInstanceVaraibles mi= new methodwithInstanceVaraibles();
		
		mi.m1(5, 2);


	}

}

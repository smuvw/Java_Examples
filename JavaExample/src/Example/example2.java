package Example;

public class example2 {
	
	//instance variables 
	int a=10;
	int b=20;
	
	//static variables 
	static int c=30;
	static int d=40;
	
	//instance method 
	void m1(){
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(example2.c);
		System.out.println(example2.d);
	}
	
	//static method 
    static void m2(){
    	example2 e2= new example2();
		
		System.out.println(e2.a);
		System.out.println(e2.b);
		System.out.println(example2.c);
		System.out.println(example2.d);
	}
	public static void main(String[] args) {
		example2  e2= new example2();
		
		e2.m1();
		example2.m2();

	}

}

package Example;

public class example1 {
	
	int a=10;
	int b=20;
	
	static void m1(){
		example1 e1= new example1();
		
		System.out.println(e1.a);
		System.out.println(e1.b);
		
	}
    static void m2(){
    		example1 e1= new example1();
		
		System.out.println(e1.a);
		System.out.println(e1.b);
	}

	public static void main(String[] args) {
		example1.m1();
		example1.m2();
	}

}

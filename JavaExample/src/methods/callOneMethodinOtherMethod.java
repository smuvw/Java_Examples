package methods;

public class callOneMethodinOtherMethod {
	
	void m1(){
		m2();
		System.out.println("This is m1 method");
	}

	void m2(){
		System.out.println("This is m2 method");
	}
	
	void m3(){
		System.out.println("This is m3 method");
	}
	
	public static void main(String[] args) {
		
		callOneMethodinOtherMethod cm= new callOneMethodinOtherMethod();
		cm.m1();
		

	}

}

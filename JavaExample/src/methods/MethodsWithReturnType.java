package methods;

public class MethodsWithReturnType {
	
	int a=100;
	
	int m1(int a){
		
		System.out.println("this is M1 method");
		return a;
	}
	
	// by default instance variable value will return 
   int m2(){
		
		System.out.println("this is M2 method");
		return a;
	}

	public static void main(String[] args) {
		
		MethodsWithReturnType  me= new MethodsWithReturnType();
		
		int a=me.m1(10);
		System.out.println(a);
		int b=me.m2();
		System.out.println(b);

	}

}

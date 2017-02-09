package methods;

public class MethodSyntaxExample {
	
	
	/*Method Syntax
	 * Access Modifier
	 * static keyword -optional
	 * return type
	 * Method name
	 * Parameters list - optional 
	 * throws exception - optional
	 * logic 
	 ***** Roles
	 * method names should not same 
	 * method name possible to same with different parameters
	 * with one method  we can't write another method
	 * with in method we can call other methods 
	 * Method name and return type mandatory 
	 * return type is last statement if method is other than void
	 * holing return value is optional 
	 * */
	
	public void add(){
		System.out.println("This is add method");
	}
	
	public static void sub(){
		System.out.println("This is sub  method");
	}

	public void add(int a){
		System.out.println("This is add method");
		System.out.println(a);
	}
	
	public static void sub(int b){
		System.out.println("This is sub  method");
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		
		MethodSyntaxExample MS= new MethodSyntaxExample();
		
		//instance method calling the object ref
		MS.add();
		MS.sub(100);
		
		//static method calling thru class name
		
		MethodSyntaxExample.sub();
		MethodSyntaxExample.sub(10);
		
		
		
		
	}

}

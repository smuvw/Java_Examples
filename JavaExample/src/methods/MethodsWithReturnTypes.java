package methods;

/*return type may be - void,Primitive type,class type,array type 
 * other than void return type must have the return statement 
 * Return statement must be last statement  in the implementation area 
 * holing the value is optional 
 * 
 * */

public class MethodsWithReturnTypes {
	
	
	int m1(){
		
		System.out.println("this is  m1");
		return 10;
	}
	
	
	float  m2 (){
		
		System.out.println("this is  m2");
		return 10.25f;
	}
	
	String  m3 (){
		
		System.out.println("this is  m3");
		return "srini";
	}

	public static void main(String[] args) {
		
		MethodsWithReturnTypes mr= new MethodsWithReturnTypes();
		int a=mr.m1();
		System.out.println(a);
		float b=mr.m2();
		System.out.println(b);
		String c=mr.m3();
		System.out.println(c);

	}

}

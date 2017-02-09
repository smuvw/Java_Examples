package methods;

public class returnTypeSameclass {
	
	returnTypeSameclass m1(){
		
		System.out.println("this is return type same class example");
		returnTypeSameclass t= new returnTypeSameclass();
		return t;
		
	}
	
returnTypeSameclass m2(){
		
		System.out.println("this is return type same class example");
		
		return this; // this is best approach . this will current class object will return 
	}
	
	

	public static void main(String[] args) {
		returnTypeSameclass t1= new returnTypeSameclass();
		
		returnTypeSameclass t2=t1.m2();
		System.out.println(t2);

	}

}

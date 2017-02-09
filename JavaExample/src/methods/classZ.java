package methods;

public class classZ {
	
	//parameters as a objects 
	 void m1(classX x){
		System.out.println("this is m1 method");
	}
	
	
	void m2(classY y){
		System.out.println("this is m2 method");
	}

	public static void main(String[] args) {

		classZ z= new classZ();
		
		classX x= new classX();
		
		z.m1(x); //z.m1(new classX());
		
		classY y= new classY();
		
		z.m2(y); //z.m2(new classY());
	}

}

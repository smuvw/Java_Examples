package methods;

public class classB {
	
	classA m2(){
		
		classA  a= new classA();
		
		return a;
		
	}

	public static void main(String[] args) {
		
		classB t= new classB();
		
		classA b=t.m2();
		
		b.m1();
		

	}

}

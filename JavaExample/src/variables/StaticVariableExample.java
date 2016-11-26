package variables;

public class StaticVariableExample {

	
	static int a=10;
	static int b=20;
	
	//static method 
	public static void main(String[] args) {
		System.out.println(StaticVariableExample.a); //approach one classname.varaibale name 
		System.out.println(StaticVariableExample.b);
		System.out.println(a); //approach two variable name
		StaticVariableExample t= new StaticVariableExample();
		t.m1();
		System.out.println(t.a); //approach three create object and access  variable name
		
	}
	
	//instance Method 
	void m1(){
		//instance area 
		System.out.println(StaticVariableExample.a);
		System.out.println(StaticVariableExample.b);
	}

}

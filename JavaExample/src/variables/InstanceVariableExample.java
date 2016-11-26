package variables;

public class InstanceVariableExample {

	//instance variables 
	
		int a=10;
		int b=20;

		//static method 
		public static void main(String[] args) {
			//static area
			InstanceVariableExample t= new InstanceVariableExample();
			System.out.println(t.a);
			System.out.println(t.b);
		}
		
		//instance method 
		void m1(){
			//instance area 
			System.out.println(a);
			System.out.println(b);
		}

	}



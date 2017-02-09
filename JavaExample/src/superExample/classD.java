package superExample;
//call super class variable value using super keyword 

public class classD extends classC{
	
	int a=8;
	
	void display(){
		
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		classD d= new classD();
		d.display();

	}

}

package constructor;

public class test1 {

	test1(int a){
		System.out.println("this is test1 Constructor "+ a);
	}
	
	
	public static void main(String[] args) {
		
/*		Inside the class if we are not declared  any Constructor then default Constructor will be generate otherwise 
		 user defined Constructor will call*/
		
		
		//test1 t1= new test1(); // this will failed 
		
		test1  t2 = new test1(10);

	}

}

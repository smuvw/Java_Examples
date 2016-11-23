package singletonPatteren;

public class SingleObject {
	
	
	//1.  Make  Constructor   provate so that this calss cannot be  instantiating
	
		private SingleObject(){
		
		System.out.println("welcome to Java");
		}
			
		//2.create  an object of SingleObject
		
		 private static SingleObject instance=new SingleObject();

	  //3.Get the object available 
		 	 
		 public static SingleObject getInstance(){
			return instance;
					 
		 }
			 
		 
		 public void add(int a,int b){
			 int c=a+b;
			 System.out.println(c);
		 }
		 
		 int b;
		

}

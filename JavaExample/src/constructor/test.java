package constructor;

/*Constructor purpose
 * 
 * Roles to declare constructions in Java
 * 1.Constructor name and class name must be same 
 * 2.Constructor able to take  Parameters 
 * 3.Constructor are not allowed return types
 * 4.Inside the class if we are not declared  any Constructor then default Constructor will be generate otherwise 
 *   user defined Constructor will call
 * * 
 * two types of Constructor
 * 1.default constructors (0 -arg Constructor)
 * 2.User defined Constructor  ( 0 -arg or parameterized Constructor)
 * */

public class test {
	
	//instance method 
	void  add(){
		
		System.out.println( "this is add method ");
	}
	
	
	/*If no Constructor in  class Compiler will call  default Constructor( is always 0 arguments and empty imp)
	 * 
	 * test() {
          
          empty imp
         }

	*/

	public static void main(String[] args) {
		
		
		test t= new test(); 
		
		t.add();
		
		// here test() is constructor  
		/*Create object in Java 
		   1.new keyword
		   2.instance factory method
		   3.static factory method
		   4.Pattern factory method
		   5. newInstance method
		   6.Clone method 
		   7. De-serialization process 
		   
		   Ex:
		   
		   test - class name
		   t is ref var (object name)
		   = assignment operator
		   new is keyword (used to create object)
		   test() - constructor 
		
		*/

	}

}

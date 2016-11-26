package constructor;



/*Constructor purpose
 * 1. Constructor used  to write the business logics and those logics are executed during object creation time
 * 2.  Constructor are used initialize instance variables values during object creation 
 *  default values are printed even object is created
 *  
 * */

public class EMPLOYEE {

	int empid;  // 0
	String ename;  //null
	float esal; //0.0
	
	//user defined constructor  is executed during object creation
	//run script without this Constructor first run
	//run with this Constructor  second  run
	
EMPLOYEE () {
		empid=100;
		ename="sri";
		esal=100.23f;
		
	}
	

	
	void dispaly(){
		
		System.out.println("Employee id "+ empid);
		System.out.println("Employee name "+ ename);
		System.out.println("Employee sal "+ esal);
		
	}
	
	
	public static void main(String[] args) {
		
		EMPLOYEE e= new EMPLOYEE(); // default constructor will execute 
		e.dispaly();
		EMPLOYEE e1= new EMPLOYEE(); // default constructor will execute 
		e1.dispaly();
		
	}

}

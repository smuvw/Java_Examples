package constructor;

public class EMPLOYEE1 {

	//instance variables 
	int empid;  // 0
	String ename;  //null
	float esal; //0.0
	
	//user defined constructor  is executed during object creation
	//run script with this Constructor first
	//run with this Constructor  second 
	
EMPLOYEE1 (int empid,String ename,float esal) { // local varaibles 
	
	//this.empid is instance variables 
	//conversion of local values to instance values
	this.empid=empid;
	this.ename=ename;
	this.esal=esal;
		
	}
	

	
	void dispaly(){
		
		System.out.println("Employee id "+ empid);
		System.out.println("Employee name "+ ename);
		System.out.println("Employee sal "+ esal);
		
	}
	
	
	public static void main(String[] args) {
		
		EMPLOYEE1 e= new EMPLOYEE1(100,"Srinivas",100.23f); // default constructor will execute 
		e.dispaly();
		EMPLOYEE1 e1= new EMPLOYEE1(101,"vasu",101.23f); // default constructor will execute 
		e1.dispaly();
		
	}

}

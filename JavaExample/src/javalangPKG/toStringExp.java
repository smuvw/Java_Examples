package javalangPKG;

public class toStringExp {
	
	String name;
	int rollno;
	
	toStringExp (String name, int rollno){
		
		this.name=name;
		this.rollno=rollno;
		
	}
	

	public static void main(String[] args) {
		
		toStringExp  s1= new toStringExp ("sri",100);
		
		//If our class doesn't contain toString() method then object class toString() will be executed.

		System.out.println(s1);
		System.out.println(s1.toString());
		
		toStringExp  s2= new toStringExp ("sri",100);
		System.out.println(s2);

	}
	
	//Try without this method then object class toStrign method will call
	//toString method 
	public String toString(){
		
		

		
		return name+ "..." +rollno;
		
		//return "This is student with the name : " + name + " and RollNo" + rollno;
		
	}
	
	

}

package string;

public class toStringExample3 {
	
	int eid;
	String ename;
	
	toStringExample3(int eid, String ename){
		this.eid=eid;
		this.ename=ename;
		
	}
	
	//overriding object class toString()
	public String toString(){
		return "eid=" +eid+ "ename="+ ename;
		
	}

	public static void main(String[] args) {
		
		toStringExample3 e1= new toStringExample3(111,"srini");
		
		System.out.println(e1);
		System.out.println(e1.toString());
	}

}

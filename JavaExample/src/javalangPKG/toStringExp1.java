package javalangPKG;

import java.util.ArrayList;

public class toStringExp1 {

	public static void main(String[] args) {
	
		//All coleection,wrapper and String class override toString methods
		
		String s= new String("Srini");
		System.out.println(s);
		
		Integer I= new Integer(10);
		System.out.println(I);
		
		ArrayList AL = new ArrayList();
		
		AL.add("A");
		AL.add("B");
		AL.add("C");
		
		System.out.println(AL);
		
		
		// this is our class and not override toString and calling object toString method
		
		toStringExp1 t= new toStringExp1();
		System.out.println(t);
		

	}

}

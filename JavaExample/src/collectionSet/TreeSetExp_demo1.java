package collectionSet;

import java.util.TreeSet;

public class TreeSetExp_demo1 {

	public static void main(String[] args) {
		
				TreeSet t= new TreeSet(); //default natural sorting order 
				
				t.add("A"); //String objects are Homegenous and comparable
				t.add("a");
				t.add("B");

				t.add("Z");
				t.add("L");
				
				//t.add(10);//CCE error
				//t.add(null);//NPE
				System.out.println(t); //[A, B, L, Z, a]

				


	}

}

package collectionSet;

import java.util.TreeSet;

public class TreeSetExp_demo5 {

	public static void main(String[] args) {
		
		
		//in the case JVM called custimized  compare method 
		TreeSet t= new TreeSet( new MyComparator());
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		System.out.println(t);
		

	}

}

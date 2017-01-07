package collectionSet;

import java.util.TreeSet;

public class TreeSetExp_demo6 {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet( new MyComparatorString());
		// without new MyComparatorString() [Ganga, RajaKumari, Ramulamma, Roja, ShobhaRani]
		// with new MyComparatorString() [ShobhaRani, Roja, Ramulamma, RajaKumari, Ganga]

		
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("RajaKumari");
		t.add("Ganga");
		t.add("Ramulamma");
		
		System.out.println(t);
		

	}

}

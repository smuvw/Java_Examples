package collectionSet;

import java.util.Iterator;
import java.util.Map;
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
		
		Iterator t1=t.iterator();
		
		while(t1.hasNext()){
			Map.Entry m1=(Map.Entry) t1.next();
			System.out.println(m1.getKey() + " ........."+ m1.getValue());
		}
		

	}

}

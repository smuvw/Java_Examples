package collectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExp {

	public static void main(String[] args) {
		
		HashSet h= new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); //false because duplicate are not allowed. add will return boolean value 
		System.out.println(h);
		
		Iterator a1=h.iterator();
		System.out.println(a1.next());
		System.out.println(a1.next());

	}

}

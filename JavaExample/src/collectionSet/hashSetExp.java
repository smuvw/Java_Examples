package collectionSet;

import java.util.HashSet;

public class hashSetExp {

	public static void main(String[] args) {
		
		HashSet h= new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); //false because duplicate are not allowed
		System.out.println(h);
	}

}

package collectionSet;


import java.util.LinkedHashSet;

public class LinkedhashSetExp {

	public static void main(String[] args) {
		LinkedHashSet h= new LinkedHashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z")); //false because duplicate are not allowed.
		System.out.println(h);
		
		
	}

	

}

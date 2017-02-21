package collectionMAP;

import java.util.Hashtable;

public class HashtableTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h= new Hashtable();
		
		h.put(new temp(5), "A");
		h.put(new temp(2), "B");
		h.put(new temp(6), "C");
		h.put(new temp(15), "D");
		h.put(new temp(23), "E");
		h.put(new temp(16), "F");
		//h.put(null, "sri");NPE
		System.out.println(h);
		
		//From top to bottom 
		//From right to left

	}

}

package collectionMAP;


import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {

	public static void main(String[] args) {
		
		LinkedHashMap  m= new LinkedHashMap(); //Insertion order is Preserved 

			
		m.put("Srini",1);
		m.put("sam", 2);
		m.put("raju", 3);
		m.put("Srini1", 4);
		System.out.println(m);
	}

}

package collectionMAP;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String[] args) {
		
		HashMap  m= new HashMap(); //non synchronized 
		//map m1= Collections.synchronizedMap(m) //synchronized 
		
		m.put("Srini",1);
		m.put("sam", 2);
		m.put("raju", 3);
		m.put("Srini1", 4);
		System.out.println(m);
		
		System.out.println(m.put("Srini",1000)); // replace 1000 from Srini value and retun old value 1 
		Set s=m.keySet();
		System.out.println(s);
		
		Collection c=m.values();
		
		System.out.println(c);
		
		Set s1=m.entrySet();
		
		System.out.println(s1);
		
	Iterator Itr = s1.iterator();
	while(Itr.hasNext()) {
		
		Map.Entry m1=(Map.Entry) Itr.next();
		System.out.println(m1.getKey() + " ........."+ m1.getValue());
		
		if (m1.getKey().equals("sam")) {
			
			m1.setValue(2000);
			
		}
		System.out.println(m);
	}
	
	}

}

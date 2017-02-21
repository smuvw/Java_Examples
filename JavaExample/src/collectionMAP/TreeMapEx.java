package collectionMAP;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import collectionSet.MyComparatorString;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	TreeMap t= new TreeMap();
		t.put("sri", 100);
		t.put("pavel", 200);
		t.put("ravi", 500);
		t.put("anil", 600);
		
		System.out.println(t);
		
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());
		System.out.println(t.headMap("ravi"));
		
		
		TreeMap t1= new TreeMap(new MyComparatorString());
		t1.put("sri", 100);
		t1.put("pavel", 200);
		t1.put("ravi", 500);
		t1.put("anil", 600);
		
		System.out.println(t1);
		
		System.out.println(t1.firstEntry());
		System.out.println(t1.lastEntry());
		System.out.println(t1.headMap("ravi"));
		*/
		
		
		TreeMap t2= new TreeMap();
		t2.put(100,"sri");
		t2.put(102,"ravi");
		t2.put(104, "rani");
		t2.put(105,105);
		//t2.put("Srini", "james"); //CCE Error
		//t2.put(null, "lakshmi"); //NPE
	
		System.out.println(t2);
		
		
		Set s1=t2.entrySet();
				
				Iterator s=s1.iterator();
				
				while(s.hasNext()) {
					
					Map.Entry m1=(Map.Entry) s.next();
					System.out.println(m1.getKey() + " ........."+ m1.getValue());
				}
	}

}

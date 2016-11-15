package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExample {

	public static void main(String[] args) {
		
		Set<Integer> setvalue= new HashSet<Integer>();
		setvalue.add(100);
		setvalue.add(101);
		//setvalue.add(101);
		
		Iterator<Integer> itrate= setvalue.iterator();
		//System.out.println(itrate.next());
		//System.out.println(itrate.next());
		//System.out.println(itrate.next());
	
		
		while (itrate.hasNext()){
			
			System.out.println(itrate.next());
		}
	}

}

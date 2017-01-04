package collectionsList;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_cursor {

	public static void main(String[] args) {

		
		LinkedList l= new LinkedList();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		ListIterator ltr= l.listIterator();
		System.out.println(l.getClass().getName());
		
		while(ltr.hasNext()) {
			
			String s=(String) ltr.next();
			
			if(s.equals("A")) {
				ltr.remove();
			} 
			else if(s.equals("B")){
				
				ltr.set("M");
			}
					
		
			}
		
		System.out.println(l);
	}



}

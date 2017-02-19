package collectionsList;

import java.util.ArrayList;
import java.util.ListIterator;

public class arrayListDemo {

	int a=10;
	public static void main(String[] args) {
		
		
		arrayListDemo ald=new arrayListDemo();
		ald.a=111;
		ArrayList  l= new ArrayList();
	
		
				l.add("A");
				l.add(10);
				l.add("A");
				l.add(null);
				System.out.println(l); //[A,10,A,null]
				l.remove(2);
				System.out.println(l);//ex:[A,10,null]
				l.add(2, "M");
				l.add("N");
				l.add(ald.a);
						
				System.out.println(l);
				System.out.println(l.size());
				
				
				/*
			      Get a ListIterator object for ArrayList using
			      listIterator() method.
			    */
			    ListIterator itr = l.listIterator();
						   
			    while(itr.hasNext())
			      System.out.println(itr.next());
				
				
	}

}

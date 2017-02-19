package collectionsList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static List add(){
		LinkedList l2= new LinkedList();
		l2.add(10);
		l2.add(10);
		System.out.println(l2);
		return l2;
		
	}

	public static void main(String[] args) {
		List l3=LinkedListDemo.add();
		l3.get(0);
		
	System.out.println(l3.get(0));
		
		LinkedList l1= new LinkedList();
		
		l1.add("soft");
		l1.add(30);
		l1.add(null);
		l1.add("soft");
		l1.set(0, "soft"); //replace 0 element with soft
		l1.removeLast();
		l1.add(0, "srini");
		l1.addFirst("cc");
		System.out.println(l1);
		

	}

}

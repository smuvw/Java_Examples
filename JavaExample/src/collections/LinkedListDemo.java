package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		
		l1.add("soft");
		l1.add(30);
		l1.add(null);
		l1.add("soft");
		l1.set(0, "softq");
		l1.removeLast();
		l1.add(0, "srini");
		l1.addFirst("cc");
		System.out.println(l1);

	}

}

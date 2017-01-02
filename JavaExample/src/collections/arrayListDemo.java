package collections;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		
		
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
				System.out.println(l);
				System.out.println(l.size());
				
	}

}

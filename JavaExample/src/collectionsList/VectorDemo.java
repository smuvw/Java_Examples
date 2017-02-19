package collectionsList;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v= new Vector();
		//Vector v= new Vector(25);
		//Vector v= new Vector(10,5);
		
		System.out.println(v.capacity());
		
		for (int i=1;i<=10;i++){
			v.addElement(i);
		}
		
		/*System.out.println(v.capacity());
		v.addElement("A");
		
		System.out.println(v.capacity());
		
		System.out.println(v);*/
		
		Enumeration e= v.elements();
		
		while(e.hasMoreElements()){
			
			Integer i= (Integer) e.nextElement();
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}

package collectionMAP;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap  m= new HashMap(); 
		
		m.put(101, "sri");
		System.out.println(m.put(102,"paval")); //null will be return 
		System.out.println(m.put(101, "muvva")); // old value will retrun
		
		//object put( object key ,object value)
		
		HashMap  m1= new HashMap(m);
		
	     Set s1= m1.keySet();  //Return Key values
	      
	      System.out.println(s1);
	      System.out.println(m1.values());  //Return values 
		
		//System.out.println("m1 key "+ m1.get(102));
		
		

	}

}

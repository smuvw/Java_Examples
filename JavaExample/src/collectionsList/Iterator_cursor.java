package collectionsList;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator_cursor {

	public static void main(String[] args) {

		 ArrayList AL= new ArrayList();
		 
		for (int i=0;i<10;i++) {
			
			AL.add(i);
		}
		
		Iterator i= AL.iterator();
		
		while(i.hasNext()) {
			
			Integer I=(Integer) i.next();
			
			if(I%2==0) {
				
				System.out.println(I);
			} else
				
			{
				i.remove();
			}
			
			
		}
		

		
	
		
		System.out.println(AL); //[0,1,2,3,4....10]
		
	}

}

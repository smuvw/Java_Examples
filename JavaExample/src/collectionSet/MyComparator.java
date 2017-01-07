package collectionSet;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {

		Integer I1= (Integer) obj1;
		Integer I2= (Integer) obj2;
		
		if(I1<I2) 
			return +1;
		else if (I1>I2) 
			return -1;
		else 
			return 0;
	}

	
	
	//other implementations:
	
	
	/*@Override
	public int compare(Object obj1, Object obj2) {

		Integer I1= (Integer) obj1;
		Integer I2= (Integer) obj2;
		return I1.compareTo(I2) // Ascending order
		
	}*/
	
	
	
	/*@Override
	public int compare(Object obj1, Object obj2) {

		Integer I1= (Integer) obj1;
		Integer I2= (Integer) obj2;
		return -I1.compareTo(I2) //Descending order
		
	}*/
	
	
	/*@Override
	public int compare(Object obj1, Object obj2) {

		Integer I1= (Integer) obj1;
		Integer I2= (Integer) obj2;
		return I2.compareTo(I1) // Descending order
		
	}*/
	
	/*@Override
	public int compare(Object obj1, Object obj2) {

		Integer I1= (Integer) obj1;
		Integer I2= (Integer) obj2;
		return -I2.compareTo(I1) // Ascending order
		
	}*/
	
	
	/*@Override
	public int compare(Object obj1, Object obj2) {

				return + ; // Inserted order  
		
	}*/
	
	/*@Override
	public int compare(Object obj1, Object obj2) {

				return -;  // Reverse of  Inserted order  
		
	}*/
	
	/*@Override
	public int compare(Object obj1, Object obj2) {

				return 0; // only first element will be inserted and all remaining are duplicates  
		
	}*/


}

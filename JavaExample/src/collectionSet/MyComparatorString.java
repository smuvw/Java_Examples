package collectionSet;

import java.util.Comparator;

public class MyComparatorString implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object obj1, Object obj2) {

		String s1= (String) obj1;
		String s2= obj2.toString(); // or (String) obj2; 
 		return s2.compareTo(s1);
		
	}

}

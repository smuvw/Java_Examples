package collectionSet;

import java.util.TreeSet;

public class TreeSetExp_demo7 {

	public static void main(String[] args) {
	//StringBuffer is not implemented thru comparable class so, we need to customize sorting order
		
	/*	if we are depending on natural sorting order compulsory object should be homogeneous and comparable otherwise we 
	get runtime exception saying CCE.
	if we are defining our own sorting by comprator then objects need to be comparable and homogeneous. 
	That is we can add heterogeous and non comparable object also */
		
		
		TreeSet t= new TreeSet( new MyComparatorStringBuffer() );
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		
		System.out.println(t);
		
	}

}

package Collections;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String>  mylist= new ArrayList<String>();
		
		mylist.add("Selenium"); // index 0
		
		mylist.add("UFT"); // index 1
		
		mylist.add("QTP"); // index 2
		
		System.out.println(mylist.get(0));  // Print first value
		
		System.out.println(mylist.size()); //Print size of Arraylist
		
		//Print  all values 
		
		for (int i=0;i<mylist.size();i++){
			
			System.out.println(mylist.get(i));
			
		}
	}

}

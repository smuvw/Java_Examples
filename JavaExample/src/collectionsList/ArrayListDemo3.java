package collectionsList;

import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public ArrayList<String> add(){
		ArrayList<String> AL= new ArrayList<String>();
		AL.add("srini");
		AL.add("Muvva");
		return AL;
	}

	public static void main(String[] args) {
		
		ArrayListDemo3 a= new ArrayListDemo3();
		ArrayList b=a.add();
		System.out.println(b.get(0));
		System.out.println(b.get(1));
	}

}

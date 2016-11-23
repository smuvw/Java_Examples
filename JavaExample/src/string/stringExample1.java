package string;

public class stringExample1 {

	public static void main(String[] args) {

		
		//Immutable nature
		//once create the object - Modification are not allowed
		String s1="Soft";
		s1.concat("Q");
		System.out.println(s1);//soft
		
		//Mutable nature
		//Modification are allowed
		StringBuffer sb1= new StringBuffer("soft");
		sb1.append("Q");
		System.out.println(sb1);//softQ

	}

}

package String;

//String
//StringBuffer

public class stringExample {

	public static void main(String[] args) {

		String s1="muvva"; //objects are created in SCP memory
		System.out.println(s1);
		
		
		String s11="kris"; //objects are created in SCP memory
		System.out.println(s11);
		
		String s12="muvva"; //objects are created in SCP memory and SCP is not allowed duplicated 
		System.out.println(s12);
		
		//== operator compare reference comparison 
		if (s1==s12) {
			System.out.println("both are match");
		} else 
		{
			System.out.println("both are  not match");
		} 
		
		String s2= new String("muvva"); //objects are created in Heap memory
		System.out.println(s2);
		
		String s3= new String("muvva"); //objects are created in Heap memory and allow to create duplicate objects 
		System.out.println(s3);
		
		StringBuffer sb1= new StringBuffer("srini");
		System.out.println(sb1);
	}

}

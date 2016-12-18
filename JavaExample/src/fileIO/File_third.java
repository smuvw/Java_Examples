package fileIO;

import java.io.File;

public class File_third {
	
	//To display  name of all files and directory present in "C:\Newfolder(4)"

	public static void main(String[] args) throws Exception{
		
	/*	int count =0;
		File f= new File("C:\\Newfolder(4)");
		
		String[] s = f.list();
		
		
		for (String s1 :s){
			count++;
			System.out.println(s1);
		}
		System.out.println(count);
	}
*/
	
//display only file 
		
	int count =0;
	File f= new File("C:\\Newfolder(4)");
	
	String[] s = f.list();
	
	
	for (String s1 :s){
		
		File f1= new File(f,s1);
		if (f1.isFile()) {
		count++;
		System.out.println(s1);
		}
	}
	System.out.println(count);
}
	
	
	
}

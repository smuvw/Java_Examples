package fileIO;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {
		
		
		/*File f= new File("C:\\Newfolder(4)\\abc.txt");  //new File - Create the File object  not creating the "abc.txt"
		
		System.out.println(f.exists());
		
		f.createNewFile(); //create abc.txt file 
		
		System.out.println(f.exists());*/
		
		//Directory creation
	File f1= new File("C:\\Newfolder(4)\\test");  //new File - Create the File object  not creating the "abc.txt"
		
		System.out.println(f1.exists());
		
		f1.mkdir();
		//System.out.println(f1.getName());
		
		System.out.println(f1.exists());
		
		

	}

}

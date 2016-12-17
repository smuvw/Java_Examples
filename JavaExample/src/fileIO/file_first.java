package fileIO;

import java.io.File;
import java.io.IOException;

public class file_first {

	public static void main(String[] args) throws IOException {
		
		//Create a file named with abc.txt in current working directory 
		//first constructor example 
		
		File f= new File("abc.txt");  //new File - Create the File object not creating the "abc.txt"
		
		System.out.println(f.exists());
		
		f.createNewFile(); //create abc.txt physical file 
		
		System.out.println(f.exists());
		
		//Create a directory  named with test123  in current working directory  and create a file  named with abc123.txt in that directory
	   	
		//Create a directory 
		File f1= new File("test123"); 
		
		f1.mkdir();
		
		
		//Create a file in existing directory  using second constructor 
		
		 File f2= new File("test123","abc123.txt");  
		
	    	f2.createNewFile();
	    	
	    	
	    	
	    	//Create a file in existing directory  using third constructor 
			
			 File f3= new File(f1,"abc123.txt");  
			
		    	f3.createNewFile();
		
		

	}

}

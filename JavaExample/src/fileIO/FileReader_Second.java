package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Second {

	public static void main(String[] args) throws IOException {
	
		// int read(char[] ch)
		//int - no of characters copied from file in to array
		
		
		//first find length of the file  
		
		File f = new File("abc.txt");
		
	   FileReader fr= new FileReader(f);
	
	char[] ch= new char[(int) f.length()]; //by default  f.length() - return type is long  and converting to int . Taking array size from f.length 
		
				fr.read(ch);
				
				
				for (char ch1:ch)
				{
					System.out.print(ch1);
				}
			fr.close();
				
				
	}


}

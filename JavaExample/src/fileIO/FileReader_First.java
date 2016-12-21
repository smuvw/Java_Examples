package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_First {

	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("abc.txt");
		
		int i= fr.read();
		
		while( i !=-1){  // read until EOF of the file 			
			System.out.print((char)i); //if not performing type casting it will print Unicode value 
			//	System.out.print(i);
			i=fr.read(); //go for next character
		}
		
		fr.close();
		

	}

}

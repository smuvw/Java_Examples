package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_First {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("abc.txt"); //overriding 
		
		//FileWriter fw= new FileWriter("abc.txt",true); //append
		
		fw.write(100);
		fw.write('\n');
		fw.write("vas\nmuvva");
		fw.write('\n');
		
		char [] ch={'a','b','c'};
		
		fw.write(ch);
		fw.write('\n');
		
		fw.flush();
		fw.close();
		
		
	}

}

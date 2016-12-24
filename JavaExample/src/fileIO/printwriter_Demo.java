package fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printwriter_Demo {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		PrintWriter pw= new PrintWriter("abc.txt");
		pw.write(100); //character 'd' will added  to the file
		pw.println(100); //int value added to the file 
		pw.println(true);
		
		pw.println('A');
		pw.println("Srini");
		pw.flush();
		pw.close();
	}

}

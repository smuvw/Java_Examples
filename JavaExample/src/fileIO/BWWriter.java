package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BWWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=  new FileWriter("abc.txt");
		
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write(100);
	bw.newLine();
	char[] ch= {'a','b','c','d'};
	
	bw.write(ch);
	bw.newLine();
	
	bw.write("srini");
	bw.newLine();
	
	bw.write("welcome to java");
	bw.flush();
	bw.close();
	
	

	}

}

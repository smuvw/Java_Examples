package fileIO;

import java.io.File;
import java.io.IOException;

public class File_second {

	public static void main(String[] args) throws IOException {
	
		//create demo.txt file in existing folder using second constructor 
		
		File f= new File("C:\\Newfolder(4)","demo.txt");
		
		f.createNewFile();
		
		
	}

}

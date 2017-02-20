package fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fisExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("abc.txt");
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file);
			System.out.println("total file Size" + fis.available());
			int content;
			
			while ((content= fis.read()) !=-1){
				System.out.println((char)content);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			fis.close();
					
		}

	}

}

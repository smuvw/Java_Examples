package exceptions;

import java.io.PrintWriter;

public class throwsExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Ex:1
		/*PrintWriter pw= new PrintWriter("abc.txt");
		pw.write("hello");*/
		
		//EX2:
		
		/*Thread.sleep(1000);*/
		
		//Ex: first way using try catch 
		
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//Throws 
		Thread.sleep(1000);
	}

}

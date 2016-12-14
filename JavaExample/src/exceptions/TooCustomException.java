package exceptions;

public class TooCustomException {

	public static void main(String[] args) {
	
		int age= 66;
		
		if (age> 60) {
			throw new TooYoungException(" your age is already crossed marriage age ");
		}
		
		else if  (age < 18) {
			throw new TooYoungException(" Pls wait some more time");
		}
	}

}

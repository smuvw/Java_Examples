package dataTypes;

public class JavaIntExamples {
	
	int k; // default value is "0" for int and assigned by JVM

	public static void main(String[] args) {
		 /*
         * int is 32 bit signed type ranges from –2,147,483,648
         * to 2,147,483,647. int is also most commonly used integer
         * type in Java.
         * Declare int varibale as below
         *
         * int <variable name> = <default value>;
         *
         * here assigning default value is optional.
         */
         
         int i = 0;
         int j = 100;
         
         System.out.println("Value of int variable i is :" + i);
         System.out.println("Value of int variable j is :" + j);
         
         JavaIntExamples t= new JavaIntExamples();
         
         System.out.println("Value of int variable j is :" + t.k);
	}

}

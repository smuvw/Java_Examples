package arrays;

public class arraySample {

	public static void main(String[] args) {
		
		//int a[]= new int[3];
		int[] a= new int[3];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		String b[]= new String[2];
		b[0]="UFT";
		b[1]="Seleniun";
		System.out.println(b[0]);
		System.out.println(b[1]);

		
		double[] myList = {2.9, 3.9, 4.4, 4.5};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	}

}

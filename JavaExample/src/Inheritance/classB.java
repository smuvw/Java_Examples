package Inheritance;


//classB is extends classA
//classA- Super class
//classB - is sub-class

public class classB extends classA{
	
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		classB b= new classB();
		
		b.no=100;  
		System.out.println(b.no);
		b.Name="Sri";
		System.out.println(b.Name);
		b.add(1, 2);
		b.mul(2, 2);
		
		b.sub(10, 5);
		

	}

}

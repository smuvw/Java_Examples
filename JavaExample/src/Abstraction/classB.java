package Abstraction;

public class classB extends classA {

	public static void main(String[] args) {
		classB b= new classB();
		b.sub(25, 15);

	}

	@Override
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
		
	}

}

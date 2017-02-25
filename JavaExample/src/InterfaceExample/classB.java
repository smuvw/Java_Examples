package InterfaceExample;

public class classB implements classA{

	public static void main(String[] args) {
		classB b= new classB();
		b.add(1, 2);
		b.sub(5, 2);
		b.mul(1, 3);
		System.out.println(b.name);
		System.out.println(b.no);
	}

	@Override
	public void add(int a, int b) {
	int c=a+b;
	System.out.println(c);
		
	}

	@Override
	public void sub(int a, int b) {
		int c=a-b;
		System.out.println(c);
		
	}

	@Override
	public void mul(int a, int b) {
		int c=a*b;
		System.out.println(c);
		
	}

}

package singletonPatteren;

public class SingleObjectRun {

	public static void main(String[] args) {
		
		SingleObject a=SingleObject.getInstance();
		System.out.println(a);
		a.add(5,6);
		
		a.b=100;
		System.out.println(a.b);
		
		SingleObject a1=SingleObject.getInstance();
		System.out.println(a1);

	}

}

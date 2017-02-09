package variables;

public class instance_static {
	
	int a=10;
	static int b=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		instance_static  t= new instance_static();
		
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.a=20;
		t.b=30;
		System.out.println(t.a);
		System.out.println(t.b);
		
		instance_static  t2= new instance_static();
		System.out.println(t2.a);
		System.out.println(t2.b);
		t2.b=777;
		
		instance_static  t3= new instance_static();
		System.out.println(t3.a);
		System.out.println(t3.b);
	}

}

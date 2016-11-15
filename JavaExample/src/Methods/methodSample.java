package Methods;

public class methodSample {
	
	//non-static methods
	
	public void add(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int a,int b){
		int c=a-b;
		System.out.println(c);
	}
	
	
	//static methods
	
	public static void add(int a, int b,int c){
		int d=a+b+c;
		System.out.println(d);
	}
	public static void sub(int a, int b,int c){
		int d=a-b-c;
		System.out.println(d);
		
		}
	
	//return value methods
	
	public int add1(int a, int b){
		int c=a+b;
		return c;
	}
	public int sub1(int a,int b){
		int c=a-b;
		
		return c;
	}
	
	
	
}

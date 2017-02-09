package superExample;

public class classB extends classA{
	int c;

	
	classB(int x, int y,int z) {
		super(x, y);
		c=z;
		
	}
	
	int multiple(){

		
		return a*b*c;
	}

	public static void main(String[] args) {
		
		classB b= new classB(1,2,3);
		int i=b.multiple();
		System.out.println(i);
		

	}

}

package superExample;

public class Shape {
	
	int x;
	int y;
	String uom;
	
	Shape(int x,int y, String uom){
		
		this.x=x;
		this.y=y;
		this.uom=uom;
		
	}
	
	public void display(){
		
		System.out.println("Building a Shape");
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("uom is " + uom);
	}
	
	
	public void welcome(){
		System.out.println("welcome to Drawboard");
	}
	

}

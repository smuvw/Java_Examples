package superExample;

public class Circle extends Shape{
	
	int radius;
	
	Circle(int x,int y, String uom,int radius){
		
		super(x,y,uom);
		this.radius=radius;
		
	}
	
public void display(){
		
		System.out.println("Building a Circle as below");
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("uom is " + uom);
		System.out.println("radius is " + radius);
	}

}

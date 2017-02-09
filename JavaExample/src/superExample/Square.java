package superExample;

public class Square extends Shape{
	
	
	int side;
	
	Square(int x,int y, String uom,int side){
		
		super(x,y,uom);
		this.side=side;
		
	}
	
public void display(){
		
		System.out.println("Building a Square as below");
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println("uom is " + uom);
		System.out.println("side is " + side);
	}

}

package superExample;

public class ShapeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square sp = new Square(10,20,"CM",4);
		
		sp.welcome();
		sp.display();
		
		Circle c= new Circle(30,35,"cm",5);
		
		c.welcome();
		c.display();
		

	}

}

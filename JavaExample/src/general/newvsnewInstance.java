package general;

//what is the difference between new vs newInstance 
// new purpose is create the object
//if you know class name then use the new keyword to create object


public class newvsnewInstance {

	public static void main(String[] args) throws Exception, IllegalAccessException, ClassNotFoundException  {
		
	Object o=Class.forName(args[0]).newInstance();
	System.out.println();
		
	}

}

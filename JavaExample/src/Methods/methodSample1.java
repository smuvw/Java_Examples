package Methods;

public class methodSample1 {

	public static void main(String[] args) {
		methodSample ms= new methodSample();
	
		//non-static methods 
		ms.add(1, 2);
		ms.sub(10, 2);
		
		// static methods calls without object ref
		methodSample.add(1, 2,4);
		methodSample.sub(1, 2,4);
		
		//or  static methods calls with object ref
				ms.add(1, 2,4);
				ms.sub(10, 2,2);
			
		//return value methods
				
		int d=ms.add1(3, 5);
		System.out.println(d);
				
	}

}

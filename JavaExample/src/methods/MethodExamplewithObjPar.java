package methods;

public class MethodExamplewithObjPar {
	
	
	public void add(methodSample y) {
		System.out.println("this is add Method ");
	}

	public static void main(String[] args) {
		
		methodSample ms= new methodSample();
		
		MethodExamplewithObjPar ME= new MethodExamplewithObjPar();
		
		
		ME.add(ms);
	

	}

}

package collectionSet;

public class compareTo_Exp {

	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));//-ve
		System.out.println("Z".compareTo("K"));// +  ve
		System.out.println("A".compareTo("A")); //0
		System.out.println("A".compareTo(null)); //NPE

	}

}

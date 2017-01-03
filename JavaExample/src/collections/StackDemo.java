package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack s= new Stack();
		
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s);//[A,B,C]
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));//if object is not return it will return -1


	}

}

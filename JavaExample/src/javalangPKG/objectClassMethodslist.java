package javalangPKG;

import java.lang.reflect.Method;

public class objectClassMethodslist {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Class c=Class.forName("java.lang.Object");
		Method[] m=c.getDeclaredMethods();
		
		int count=0;
		
		for (Method m1: m)
		{
			System.out.println(m1);
			count++;
		
		}
		
		System.out.println(count);
	}

}

package collectionMAP;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Book> map= new Hashtable<Integer,Book>();
		
		Book b1= new Book(1,"SeleniumBook","sri","ABC");
		Book b2= new Book(2,"SeleniumBook","sri","ABC");
		Book b3= new Book(3,"SeleniumBook","sri","ABC");
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		
		for (Map.Entry<Integer, Book> entry: map.entrySet()) {
			
			int key = entry.getKey();
			Book b= entry.getValue();
			
			System.out.println(key + "details");
			
			System.out.println(b.id + " "+ b.name+ " "+ b.author+ " "+ b.publisher);
		
		}
		
	}

}

package Collections;

import java.util.Hashtable;

public class hashTableExample {

	public static void main(String[] args) {
		
		
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		ht.put("name", "srini");
		ht.put("location", "hyd");
		ht.put("state", "AP");
		
		System.out.println(ht.get("name"));
		
		ht.put("state", "TN");
		
		System.out.println(ht.get("state"));
		
	}

}

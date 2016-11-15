package Collections;

import java.util.Hashtable;

public class hashTableExample1 {

	public static void main(String[] args) {
       Hashtable<String,String> ht1 = new Hashtable<String,String>();
		
		ht1.put("name", "srini");
		ht1.put("name", "vasu");
	
		  Hashtable<String,String> ht2 = new Hashtable<String,String>();
			
			ht2.put("state", "GNT");
			ht2.put("state", "hyd");
			
			
			  Hashtable<String,Hashtable<String,String>> ht3 = new Hashtable<String,Hashtable<String,String>>();	
			  
			  ht3.put("address",ht1);
			  
			  System.out.println(ht3.get("address").get("name"));

	}

}

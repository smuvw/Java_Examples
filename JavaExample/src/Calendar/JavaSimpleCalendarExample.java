package Calendar;

import java.util.Calendar;

/*
Simple Java Calendar Example
This example shows how to use Java Calendar class to display current date
and time.
*/


public class JavaSimpleCalendarExample {
	 public static void main(String[] args) {
		   
		
		    //use getInstance() method to get object of java Calendar class
		    Calendar cal = Calendar.getInstance();
		   
		    //use getTime() method of Calendar class to get date and time
		    System.out.println("Today is : " + cal.getTime());  
		    System.out.println("Calendar Type is : "+ cal.getCalendarType());
		  }
}

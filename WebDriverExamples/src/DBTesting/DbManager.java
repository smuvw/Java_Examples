package DBTesting;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DbManager {
	
	
       private static Connection conn = null;


	
	//MySQL database
	// class.forName method, dynamically load the drivers class file into memory
	//
	public static void setMysqlDbConnection() throws SQLException, ClassNotFoundException
    {
    try
    {
    	
        ///Load mysql jdbc driver	
    	
        Class.forName (TestConfig.mysqldriver);
        

      //Create Connection to DB
        conn = DriverManager.getConnection (TestConfig.mysqlurl, TestConfig.mysqluserName, TestConfig.mysqlpassword);
       
        if(!conn.isClosed())
			System.out.println("Successfully connected to MySQL server");
			
	
    }
    catch (Exception e)
    {
        System.err.println ("Cannot connect to database server");
       
       
    }
   

}
	
	
	//Query results 
		
	public static List<String> getMysqlQuery(String query) throws SQLException{
		
		//Create Statement Object
		Statement St = conn.createStatement();
		// Execute the SQL Query. Store results in ResultSet	
		ResultSet rs = St.executeQuery(query);
		
		List<String> values = new ArrayList<String>();
		
		// While Loop to iterate through all data and print results	
		
		while(rs.next()){
			
			values.add(rs.getString(1)); //first column
			values.add(rs.getString(2)); //second column
			//values.add(rs.getString(3)); //Third column
			
		}
		return values;
	}
	
	
	
	
	
	
	
	
	public static Connection getConnection()	{
		return conn;
	
			}

}

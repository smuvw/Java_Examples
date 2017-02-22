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
        //Register  mysql drivers
    	
        Class.forName (TestConfig.mysqldriver);
        
           
        //Get a connection to DB
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
		
	
		Statement St = conn.createStatement();
		ResultSet rs = St.executeQuery(query);
		List<String> values = new ArrayList<String>();
		while(rs.next()){
			
			values.add(rs.getString(1)); //first column
			values.add(rs.getString(2)); //second column
			values.add(rs.getString(3)); //Third column
			
		}
		return values;
	}
	
	
	
	
	
	
	
	
	public static Connection getConnection()	{
		return conn;
	
			}

}

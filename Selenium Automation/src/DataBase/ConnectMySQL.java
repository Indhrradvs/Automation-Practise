package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySQL {

	@Test
	public void TestDB() throws Exception {

		// This Driver helps us to connect with DB

		Class.forName("com.mysql.jdbc.Driver");

		// To verify that Driver is Loaded or Not, if loaded Ready to connect DB.

		System.out.println("Driver Loaded");

		// Connecting with Our DB. **Import connection from Java.sql

		Connection MyCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "admin");
		
		System.out.println("Connected to MySQL DB");
	
		// Sending Statements to DataBase
		
		Statement smt = MyCon.createStatement();
		
		// Executing Query
		
		ResultSet rs = smt.executeQuery("select * from selenium_users");
		
		// Next() --> Moves cursor one row in forward direction
		while(rs.next()) {
			
			String Username = rs.getString("User_Name");
			System.out.println("DataBase Record is "+Username); // Returns user names
			
			String email = rs.getString("Email");
			System.out.println("DataBase Record is "+email); // Returns E-mails
		}
		
	
	
	}
	

}

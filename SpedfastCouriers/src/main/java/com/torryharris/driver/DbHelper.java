package com.torryharris.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHelper {
	
	private static Connection con;
	
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/special", "root","Geethu@16119");
			System.out.println("connection established");
		
		return con;
	}
	public void closeConnection(Connection con,Statement stat) throws SQLException{
		stat.close();
		con.close();
		
	}
	
}

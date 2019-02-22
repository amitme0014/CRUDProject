package com.dbConnection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

	
	private static Connection connection=null;
	private static final String DbDriverClass="com.mysql.jdbc.Driver"; 
	private static final String DB_URL="jdbc:mysql://localhost:3306/db";
	private static final String DbUsername="amit";
	private static final String DbPassword="amit";
	
	static {
		try {
			Class.forName(DbDriverClass);
			connection=DriverManager.getConnection(DB_URL, DbUsername, DbPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB driver class was not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Oops SQL Exception,something wrong with the username and password may be");
		}
		
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	
	
}

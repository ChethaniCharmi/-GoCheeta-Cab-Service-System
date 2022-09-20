package com.codewithcharmi.gocheetacabservicewebapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectorImplMySQL implements DatabaseConnector{

	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		// 2 --> Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver.class");
				
		// 3 --> Establish the connection
		String url = "jdbc:mysql://localhost:3306/gocheetadb";
		String userName = "root";
		String password = "01234";
		
		return DriverManager.getConnection(url,userName,password);

	}

}
